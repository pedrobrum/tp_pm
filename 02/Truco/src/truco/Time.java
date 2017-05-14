package truco;

public class Time {
    private int pontos;
    private final Exibivel exibivelPontos;

    public Time(Exibivel exibivelPontos) {
        this.pontos = 0;
        this.exibivelPontos = exibivelPontos;
        exibivelPontos.setText(String.valueOf(pontos));
    }

    public void resetar(){
        this.pontos = 0;
        exibivelPontos.setText(String.valueOf(pontos));
    }
    
    public void incPontos(int pontos) {
        this.pontos += pontos;
        exibivelPontos.setText(String.valueOf(this.pontos));
    }
}
