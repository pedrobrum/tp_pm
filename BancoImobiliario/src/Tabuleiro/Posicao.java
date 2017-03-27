package Tabuleiro;

import javafx.util.Pair;

public class Posicao {
    
    public static Pair<Integer, Posicao> formatPosicao(String config) throws Exception{
        String [] configs = config.split(";");
        int id = Integer.valueOf(configs[0]);
        int key = Integer.valueOf(configs[1]);
        int tipoPosicao = Integer.valueOf(configs[2]);
        switch (tipoPosicao){
            case 1:
                return new Pair(key, null);
            case 2:
                return new Pair(key, new Posicao(id));
            case 3:
                int tipoImovel = Integer.valueOf(configs[3]);
                Imovel.Tipo tipo = Imovel.getTipo(tipoImovel);
                int valor = Integer.valueOf(configs[4]);
                int taxa = Integer.valueOf(configs[5]);
                return new Pair(key, new Imovel(id, tipo, valor, taxa));
            default:
                throw new Exception("Tipo de Posição Inválido!");
        }
    }

    private final int id;

    public Posicao(int id) {
        this.id = id;
    }
    
    public void execute(){
        
    }
    
    public static boolean isInicial(Posicao posicao){
        return posicao == null;
    }
}
