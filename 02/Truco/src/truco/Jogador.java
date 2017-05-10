package truco;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class Jogador {
    private Carta carta[];
    private Carta mesa;
    private final JButton[] buttonCarta;
    private final JButton buttonJogada;
    
    public Jogador(JButton labelCarta[], JButton labelJogada){
        this.buttonCarta = labelCarta;
        this.buttonJogada = labelJogada;
        for (int i = 0; i < 3; i++)
                labelCarta[i].setText("");
        labelJogada.setText("");
    }
    
    public void receberCarta(Carta carta[]){
        this.carta = carta;
        for (int i = 0; i < 3; i++){
            buttonCarta[i].setText(carta[i].getSimbolo());
            buttonCarta[i].setForeground(carta[i].getCor());
        }
        buttonJogada.setText("");
    }
    
    public boolean jogarCarta(int c){
        if (carta[c] != null){
            buttonCarta[c].setText("");
            buttonJogada.setText(carta[c].toString());
            buttonJogada.setForeground(carta[c].getCor());
            mesa = carta[c];
            carta[c] = null;
            for (int i = 0; i < 3; i++)
                buttonCarta[i].setBorder(null);
            return true;
        }
        return false;
    }
    
    public void sinalizar(){
        for (int i = 0; i < 3; i++)
            if (carta[i] != null && buttonCarta[i] != null)
               buttonCarta[i].setBorder(new LineBorder(Color.yellow));
    }

    public Carta getMesa(){
        Carta c = mesa;
        mesa = null;
        return c;
    }
}
