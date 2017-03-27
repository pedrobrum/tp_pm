package Jogada;

import Tabuleiro.Tabuleiro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javafx.util.Pair;

public class Jogada {
    
    private final int qtInstrucoes;
    private final Instrucao [] instrucoes;
    private final int qtJogadores;
    private final Jogador [] jogadores;
    private int jogadoresPositivos;
    private int qtRodadas;

    public Jogada(String nomeArquivo) throws Exception{
        File jogadaF = new File(nomeArquivo);
        FileReader jogadaFR = new FileReader(jogadaF);
        BufferedReader jogadaBR = new BufferedReader(jogadaFR);
        String initialLine = jogadaBR.readLine();
        String [] configs = initialLine.split("%");
        this.qtInstrucoes = Integer.valueOf(configs[0]);
        this.instrucoes = new Instrucao[qtInstrucoes+1];
        this.qtJogadores = Integer.valueOf(configs[1]);
        this.jogadoresPositivos = qtJogadores;
        int valorInicial = Integer.valueOf(configs[2]);
        this.jogadores = new Jogador[qtJogadores+1];
        for (int i = 1; i <= qtJogadores; i++)
            jogadores[i] = new Jogador(i, valorInicial);
        for (int i = 1; i <= qtInstrucoes; i++){
            String config = jogadaBR.readLine();
            Pair<Integer, Instrucao> pair = Instrucao.formatInstrucao(config);
            instrucoes[i] = pair.getValue();
        }
        this.qtRodadas = 0;
    }

    public int getQtInstrucoes() {
        return qtInstrucoes;
    }

    public Jogador getJogadores(int i) {
        return jogadores[i];
    }    
    
    public void simular(Tabuleiro tabuleiro){
        for (int i = 1; i <= qtJogadores; i++){
            jogadores[i].setPosicaoInicial(tabuleiro.getPosicaoInicial());
        }
        int i = 1;
        while (jogadoresPositivos > 1 && i <= qtInstrucoes && !Instrucao.isDump(instrucoes[i])){
            int idJogador = instrucoes[i].getIdJogador();
            jogadores[idJogador].andar(instrucoes[i].getValorDado(), this, tabuleiro);
            qtRodadas++;
            i++;
        }
    }
    
    public void gerarEstatisticas(String nomeArquivo) throws Exception{
        File estatisticasF = new File(nomeArquivo);
        FileWriter estatisticasFW = new FileWriter(estatisticasF);
        BufferedWriter estatisticasBW = new BufferedWriter(estatisticasFW);
        estatisticasBW.append("1:" + qtRodadas + "\n");
        
        estatisticasBW.append("2:");
        for (int i = 1; i <= qtJogadores-1; i++){
            estatisticasBW.append(String.valueOf(i) + "-" + jogadores[i].getQtVoltas() + ";");
        }
        estatisticasBW.append(String.valueOf(qtJogadores) + "-" + jogadores[qtJogadores].getQtVoltas() + "\n");
        
        estatisticasBW.append("3:");
        for (int i = 1; i <= qtJogadores-1; i++){
            estatisticasBW.append(String.valueOf(i) + "-" + jogadores[i].getValor()+ ";");
        }
        estatisticasBW.append(String.valueOf(qtJogadores) + "-" + jogadores[qtJogadores].getValor() + "\n");
        
        estatisticasBW.append("4:");
        for (int i = 1; i <= qtJogadores-1; i++){
            estatisticasBW.append(String.valueOf(i) + "-" + jogadores[i].getAluguelRecebido()+ ";");
        }
        estatisticasBW.append(String.valueOf(qtJogadores) + "-" + jogadores[qtJogadores].getAluguelRecebido() + "\n");
        
        estatisticasBW.append("5:");
        for (int i = 1; i <= qtJogadores-1; i++){
            estatisticasBW.append(String.valueOf(i) + "-" + jogadores[i].getAluguelPago() + ";");
        }
        estatisticasBW.append(String.valueOf(qtJogadores) + "-" + jogadores[qtJogadores].getAluguelPago() + "\n");
        
        estatisticasBW.append("6:");
        for (int i = 1; i <= qtJogadores-1; i++){
            estatisticasBW.append(String.valueOf(i) + "-" + jogadores[i].getGastoImoveis() + ";");
        }
        estatisticasBW.append(String.valueOf(qtJogadores) + "-" + jogadores[qtJogadores].getGastoImoveis() + "\n");
        
        estatisticasBW.append("7:");
        for (int i = 1; i <= qtJogadores-1; i++){
            estatisticasBW.append(String.valueOf(i) + "-" + jogadores[i].getQtPassaVez() + ";");
        }
        estatisticasBW.append(String.valueOf(qtJogadores) + "-" + jogadores[qtJogadores].getQtPassaVez() + "\n");
        
        estatisticasBW.flush();
    }
    
    public void decrementarJogadores(){
        jogadoresPositivos--;
    }
    
}
