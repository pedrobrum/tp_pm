
package truco;

public class Truco {
    
    private enum EstadoRodada{
        FINALIZADA, INICIALIZADA, PRETRUCO, TRUCO
    }
    private static int Pontos(EstadoRodada estado){
        switch (estado){
            case TRUCO:
                return 3;
            default:
                return 1;
        }
    }
    
    private final Time time[];
    private final Jogador jogador[];
    private int primeiro;
    private int atual;
    private final Baralho baralho;
    private EstadoRodada estado;
    private final Exibivel feed;

    public Truco(Time[] time, Jogador[] jogador, Baralho baralho, Exibivel feed) {
        this.time = time;
        this.jogador = jogador;
        this.baralho = baralho;
        this.feed = feed;
    }
    
    public void iniciarJogo(){
        primeiro = 0;
        time[0].resetar();
        time[1].resetar();
        estado = EstadoRodada.FINALIZADA;
        iniciarRodada();
    }
    
    public void iniciarRodada(){
        if (estado == EstadoRodada.FINALIZADA){
            baralho.embaralhar();
            atual = primeiro;
            for (int i = 0; i < 4; i++)
                jogador[i].receberCarta(new Carta[]{
                    baralho.getTopo(),
                    baralho.getTopo(),
                    baralho.getTopo()});
            jogador[atual].sinalizar(true);
            estado = EstadoRodada.INICIALIZADA;
        }
    }
    
    public void trucar(){
        if (estado == EstadoRodada.INICIALIZADA)
            estado = EstadoRodada.PRETRUCO;
    }
    
    public void aceitar(){
        if (estado == EstadoRodada.PRETRUCO)
            estado = EstadoRodada.TRUCO;
    }
    
    public void desistir(){
        if (estado != EstadoRodada.FINALIZADA)
            time[atual%2].incPontos(Pontos(estado));
    }
    
    public void jogarCarta(int iJ, int iC){
        if (estado == EstadoRodada.PRETRUCO)
            return;
        if (atual != iJ || atual == -1)
            return;
        jogador[iJ].jogarCarta(iC);
        jogador[atual].sinalizar(false);
        atual = (atual + 1) % 4;
        jogador[atual].sinalizar(true);
        if (atual == primeiro)
            finalizarRodada();
    }
    
    private void finalizarRodada(){
        Carta maior[] = new Carta[]{
            Carta.Max(jogador[0].getMesa(), jogador[2].getMesa()),
            Carta.Max(jogador[1].getMesa(), jogador[3].getMesa())
        };
        
        int c = maior[0].compareTo(maior[1]);
        if (c < 0)
            time[0].incPontos(Pontos(estado));
        else if (c > 0)
            time[1].incPontos(Pontos(estado));
        else{
            time[primeiro%2].incPontos(Pontos(estado));
        }
        primeiro = (primeiro + 1) % 4;
        estado = EstadoRodada.FINALIZADA;
    }
}
