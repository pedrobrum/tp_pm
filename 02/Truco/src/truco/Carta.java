package truco;

import java.awt.Color;

public class Carta implements Comparable<Carta>{
    private final String simbolo;
    private final Integer valor;
    private final Color cor;
    
    public static Carta Max(Carta l, Carta r){
        if (l.compareTo(r) > 0)
            return l;
        return r;
    }
    
    public Carta(String simbolo, int valor, Color cor) {
        this.simbolo = simbolo;
        this.valor = valor;
        this.cor = cor;
    }    

    public String getSimbolo() {
        return simbolo;
    }

    public Integer getValor() {
        return valor;
    }

    public Color getCor() {
        return cor;
    }
    
    @Override
    public int compareTo(Carta o) {
        return valor.compareTo(o.valor);
    }
    
    @Override
    public String toString(){
        return simbolo;
    }

    public interface Exibivel {
        public void setText(String s);
        public void setColor(Color c);
        public void setSinalizacao(boolean b);
    }
}
