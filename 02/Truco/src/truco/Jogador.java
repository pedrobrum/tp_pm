package truco;

import javax.swing.JLabel;

public class Jogador {
    private Carta carta[];
    private final JLabel labelCarta[];
    
    public Jogador(JLabel labelCarta[]){
        this.labelCarta = labelCarta;
    }
    
    public void receberCarta(Carta carta[]){
        this.carta = carta;
        for (int i = 0; i < 3; i++)
            labelCarta[i].setText(carta[i].getSimbolo());
    }
    
}
