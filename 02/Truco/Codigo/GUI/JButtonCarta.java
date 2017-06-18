package GUI;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import truco.Carta;

public class JButtonCarta extends JButton implements Carta.Exibivel{

    private static Border border;

    public JButtonCarta() {
        if (border == null)
            border = new LineBorder(Color.yellow);
    }
    
    @Override
    public void setColor(Color c) {
        setForeground(c);
    }

    @Override
    public void setSinalizacao(boolean b) {
        if (b)
            setBorder(border);
        else
            setBorder(null);
    }
    
}
