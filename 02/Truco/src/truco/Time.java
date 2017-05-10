package truco;

import javax.swing.JLabel;

public class Time {
    private int pontos;
    private final JLabel labelPontos;

    public Time(JLabel labelPontos) {
        this.labelPontos = labelPontos;
        this.pontos = 0;
    }

    public void incPontos(int pontos) {
        this.pontos += pontos;
        labelPontos.setText(String.valueOf(this.pontos));
    }
}
