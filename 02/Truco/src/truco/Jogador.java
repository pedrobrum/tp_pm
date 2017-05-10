package truco;

public class Jogador {
    private Carta carta[];
    private Carta mesa;
    private final Carta.Exibivel exibivelCarta[];
    private final Carta.Exibivel exibivelJogada;
    
    public Jogador(Carta.Exibivel exibivelCarta[], Carta.Exibivel exibivelJogada){
        this.exibivelCarta = exibivelCarta;
        this.exibivelJogada = exibivelJogada;
        for (int i = 0; i < 3; i++)
                exibivelCarta[i].setText("");
        exibivelJogada.setText("");
    }
    
    public void receberCarta(Carta carta[]){
        this.carta = carta;
        for (int i = 0; i < 3; i++){
            exibivelCarta[i].setText(carta[i].getSimbolo());
            exibivelCarta[i].setColor(carta[i].getCor());
        }
        exibivelJogada.setText("");
    }
    
    public boolean jogarCarta(int c){
        if (carta[c] != null){
            exibivelCarta[c].setText("");
            exibivelJogada.setText(carta[c].toString());
            exibivelJogada.setColor(carta[c].getCor());
            mesa = carta[c];
            carta[c] = null;
            for (int i = 0; i < 3; i++)
                exibivelCarta[i].setSinalizacao(false);
            return true;
        }
        return false;
    }
    
    public void sinalizar(){
        for (int i = 0; i < 3; i++)
            if (carta[i] != null && exibivelCarta[i] != null)
               exibivelCarta[i].setSinalizacao(true);
    }

    public Carta getMesa(){
        Carta c = mesa;
        mesa = null;
        return c;
    }
}
