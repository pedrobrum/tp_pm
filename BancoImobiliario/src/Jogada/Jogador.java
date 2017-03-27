package Jogada;

public class Jogador {
    private final int id;
    private int posicao;
    private int valor;

    public Jogador(int id, int valorInicial) {
        this.id = id;
        this.valor = valorInicial;
    }
    
    public void descontarValor(int desconto){
        this.valor -= desconto;
    }
    
    public void creditarValor(int credito){
        this.valor += credito;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public int getId() {
        return id;
    }
    
    
}
