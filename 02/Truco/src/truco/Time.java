package truco;

public class Time {
    private int pontos;
    private final Exibivel exibivelPontos;

    public Time(Exibivel exibivelPontos) {
        this.exibivelPontos = exibivelPontos;
        this.pontos = 0;
    }

    public void incPontos(int pontos) {
        this.pontos += pontos;
        exibivelPontos.setText(String.valueOf(this.pontos));
    }
    
    public interface Exibivel{
        public void setText(String s);
    }
}
