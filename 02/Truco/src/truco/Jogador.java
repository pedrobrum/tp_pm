package truco;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Jogador {
    private Carta carta[];
    private final JButton labelCarta[];
    private final JButton labelJogada;
    
    public Jogador(JButton labelCarta[], JButton labelJogada){
        this.labelCarta = labelCarta;
        this.labelJogada = labelJogada;
        for (int i = 0; i < 3; i++)
                labelCarta[i].setText("");
        labelJogada.setText("");
    }
    
    public void receberCarta(Carta carta[]){
        this.carta = carta;
        for (int i = 0; i < 3; i++)
            labelCarta[i].setText(carta[i].getSimbolo());
        labelJogada.setText("");
    }
    
    public boolean jogarCarta(int i){
        if (carta[i] != null){
            labelCarta[i].setText("");
            labelJogada.setText(carta[i].getSimbolo());
            carta[i] = null;
            return true;
        }
        return false;
    }
}
