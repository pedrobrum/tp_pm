package Jogada;

import Tabuleiro.Tabuleiro;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javafx.util.Pair;

public class Jogada {
    
    private final int qtInstrucoes;
    private final Instrucao [] instrucoes;
    private final int qtJogadores;
    private final Jogador [] jogadores;
    private int jogadoresPositivos;

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
        
    }
    
    public void simular(Tabuleiro tabuleiro){
        for (int i = 1; i <= qtJogadores; i++){
            jogadores[i].setPosicao(tabuleiro.getPosicaoInicial());
        }
        while (jogadoresPositivos == 0){
            
        }
    }
    
    public void gerarEstatisticas(String nomeArquivo){
        
    }
    
}
