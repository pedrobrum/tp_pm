
package truco;

public class Truco {
    private final Time time[];
    private final Jogador jogador[];
    private int primeiro;
    private int atual;
    private final Baralho baralho;

    public Truco(Time[] time, Jogador[] jogador, Baralho baralho) {
        this.time = time;
        this.jogador = jogador;
        this.baralho = baralho;
    }
    
    public void iniciarJogo(){
        baralho.embaralhar();
        atual = primeiro;
        for (int i = 0; i < 4; i++)
            jogador[i].receberCarta(new Carta[]{
                baralho.getTopo(),
                baralho.getTopo(),
                baralho.getTopo()});
        jogador[atual].sinalizar();
    }
    
    public void jogarCarta(int iJ, int iC){
        if (atual != iJ || atual == -1)
            return;
        jogador[iJ].jogarCarta(iC);
        atual = (atual + 1) % 4;
        if (atual == primeiro){
            Carta maior[] = new Carta[]{
                Carta.Max(jogador[0].getMesa(), jogador[2].getMesa()),
                Carta.Max(jogador[1].getMesa(), jogador[3].getMesa())
            };
            
            int c = maior[0].compareTo(maior[1]);
            if (c < 0)
                time[0].incPontos(3);
            else if (c > 0)
                time[1].incPontos(3);
            else{
                time[0].incPontos(1);
                time[1].incPontos(1);
            }
            primeiro = (primeiro + 1) % 4;
            return;
        }   
        jogador[atual].sinalizar();
    }
}
