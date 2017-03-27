package Tabuleiro;

import Jogada.Jogador;

public class Imovel extends Posicao{
    
    public enum Tipo{
        RESIDENCIA, COMERCIO, INDUSTRIA, HOTEL, HOSPITAL
    }
    
    public static Tipo getTipo(int i) throws Exception{
        switch (i){
            case 1:
                return Tipo.RESIDENCIA;
            case 2:
                return Tipo.COMERCIO;
            case 3:
                return Tipo.INDUSTRIA;
            case 4:
                return Tipo.HOTEL;
            case 5:
                return Tipo.HOSPITAL;
            default:
                throw new Exception("Tipo de Imóvel Inválido");
        }
    }
    
    private final Tipo tipo;
    private final int valor;
    private final int taxa;
    private int dono;
    
    public Imovel(int id, Tipo tipo, int valor, int taxa) {
        super(id);
        this.tipo = tipo;
        this.valor = valor;
        this.taxa = taxa;
        this.dono = 0;
    }

    @Override
    public void execute() {
        super.execute(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isComprada(){
        return dono != 0;
    }
    
    public void comprar(Jogador dono){
        this.dono = dono.getId();
    }
    
}
