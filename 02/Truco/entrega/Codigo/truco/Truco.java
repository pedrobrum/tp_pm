
package truco;

import java.util.ArrayList;
import java.util.List;

public class Truco {
    
    private enum EstadoRodada{
        FINALIZADA, INICIALIZADA, PRETRUCO, TRUCO, ENTRERODADAS
    }
        
    private final Time time[];
    private final Jogador jogador[];
    private final Baralho baralho;
    private final Exibivel feed;
    private final Alertador alertador;
    private int primeiroRodada;
    private int primeiro;
    private int atual;
    private boolean truco;
    private EstadoRodada estado;
    private List<Integer> vencedorRodada;

    public Truco(Time[] time, Jogador[] jogador,
            Baralho baralho, Exibivel feed,
            Alertador alertador) {
        this.time = time;
        this.jogador = jogador;
        this.baralho = baralho;
        this.feed = feed;
        this.alertador = alertador;
        reiniciar();
    }
    
    public void reiniciar(){
        this.estado = EstadoRodada.FINALIZADA;
        primeiroRodada = 0;
        for (int i = 0; i < 2; i++)
            time[i].resetar();
        for (int i = 0; i < 4; i++)
            jogador[i].resetar();
    }
    
    public void iniciarJogo(){
        truco = false;
        estado = EstadoRodada.FINALIZADA;
        primeiro = primeiroRodada;
        primeiroRodada = (primeiroRodada + 1) % 4;
        iniciarRodada();
    }
    
    public void iniciarRodada(boolean truco){
        iniciarRodada();
        this.truco = truco;
    }
    
    public void iniciarRodada(){
        if (estado == EstadoRodada.FINALIZADA){
            baralho.embaralhar();
            for (int i = 0; i < 4; i++)
                jogador[i].receberCarta(new Carta[]{
                    baralho.getTopo(),
                    baralho.getTopo(),
                    baralho.getTopo()}
                );
            vencedorRodada = new ArrayList<>();
            primeiro = primeiroRodada;
            primeiroRodada = (primeiroRodada + 1) % 4;
        }
        atual = primeiro;
        for (int i = 0; i < 4; i++)
            jogador[i].limpaMesa();
        jogador[atual].sinalizar(true);
        estado = EstadoRodada.INICIALIZADA;
        feed.setText("Rodada iniciada!");
    }
    
    public void trucar(){
        if (estado == EstadoRodada.INICIALIZADA){
            estado = EstadoRodada.PRETRUCO;
            feed.setText("Truco!!!");
        }
    }
    
    public void aceitar(){
        if (estado == EstadoRodada.PRETRUCO){
            estado = EstadoRodada.TRUCO;
            truco = true;
            feed.setText("Valendo 3 pontos!");
        }
    }
    
    public void desistir(){
        int inc = truco ? 3 : 1;
        vencedorRodada.clear();
        if (estado == EstadoRodada.PRETRUCO){
            vencedorRodada.add(atual%2);
            finalizarRodada(atual%2, inc);
        }
        else if (estado != EstadoRodada.ENTRERODADAS){
            vencedorRodada.add((atual+1)%2);
            finalizarRodada((atual+1)%2, inc);
        }
    }
    
    public void jogarCarta(int iJ, int iC){
        if (estado == EstadoRodada.ENTRERODADAS ||
            estado == EstadoRodada.PRETRUCO ||
            estado == EstadoRodada.FINALIZADA)
            return;
        if (atual != iJ || atual == -1)
            return;
        if (!jogador[iJ].jogarCarta(iC))
            return;
        jogador[atual].sinalizar(false);
        atual = (atual + 1) % 4;
        if (atual == primeiro){
            int vencedor = 0;
            Carta maior = jogador[vencedor].getMesa();
            for (int i = 1; i < 4; i++){
                int c = jogador[i].getMesa().compareTo(maior);
                if (c > 0){
                    vencedor = i;
                    maior = jogador[i].getMesa();
                }
                else if (c == 0 && i%2 != vencedor)
                    vencedor = -1;
            }

            int inc = truco ? 3 : 1;
            if (vencedor == -1)
                finalizarRodada(primeiro%2, inc);
            else
                finalizarRodada(vencedor, inc);
        }
        else
            jogador[atual].sinalizar(true);
    }
    
    private void finalizarRodada(int vencedor, int inc){
        for (int i = 0; i < 4; i++)
            jogador[i].sinalizar(false);
        primeiro = vencedor;
        vencedor %= 2;
        estado = EstadoRodada.ENTRERODADAS;
        feed.setText("O time " + Time.getNome(vencedor) + " venceu!");
        switch (vencedorRodada.size()){
            case 0:{
                vencedorRodada.add(vencedor);
                return;
            }
            case 1:{
                if (vencedorRodada.get(0) != vencedor){
                    vencedorRodada.add(vencedor);
                    return;
                }
            }break;
            default:{}
        }
        alertador.showMessage(inc + " pontos para " + Time.getNome(vencedor) + "!");
        time[vencedor].incPontos(inc);
        estado = EstadoRodada.FINALIZADA;
        iniciarRodada(false);
        if (time[vencedor].getPontos() >= 12){
            alertador.showMessage("O time " + Time.getNome(vencedor) + " venceu o jogo!");
            reiniciar();
        }
    }
}
