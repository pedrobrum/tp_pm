package GUI;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import truco.Carta;

public class JButtonCarta extends JButton implements Carta.Exibivel{

    @Override
    public void setColor(Color c) {
        setForeground(c);
    }

    @Override
    public void setSinalizacao(boolean b) {
        setBorder(new LineBorder(Color.yellow));
    }
    
}
