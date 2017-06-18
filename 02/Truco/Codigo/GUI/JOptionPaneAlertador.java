package GUI;

import javax.swing.JOptionPane;
import truco.Alertador;

public class JOptionPaneAlertador extends JOptionPane implements Alertador{
    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }    
}
