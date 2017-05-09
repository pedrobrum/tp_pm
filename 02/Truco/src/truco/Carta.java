package truco;

public class Carta implements Comparable<Carta>{
    private String naipe;
    private String simbolo;
    private Integer valor;
    
    public Carta(String naipe, String simbolo, int valor) {
        this.naipe = naipe;
        this.simbolo = simbolo;
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
    @Override
    public int compareTo(Carta o) {
        return valor.compareTo(o.getValor());
    }
}
