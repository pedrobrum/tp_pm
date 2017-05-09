package Jogada;

import javafx.util.Pair;

public class Instrucao {

    public static Pair<Integer, Instrucao> formatInstrucao(String config){
        String [] configs = config.split(";");
        if (configs[0].equals("DUMP")){
            return new Pair<>(null, null);
        }
        else{
            int id = Integer.valueOf(configs[0]);
            int idJogador = Integer.valueOf(configs[1]);
            int valorDado = Integer.valueOf(configs[2]);
            return new Pair<>(id, new Instrucao(id, idJogador, valorDado));
        }
    }
    
    private final int id;
    private final int idJogador;
    private final int valorDado;

    public Instrucao(int id, int idJogador, int valorDado) {
        this.id = id;
        this.idJogador = idJogador;
        this.valorDado = valorDado;
    }

    public int getId() {
        return id;
    }

    public int getIdJogador() {
        return idJogador;
    }

    public int getValorDado() {
        return valorDado;
    }
    
    public static boolean isDump(Instrucao instrucao){
        return instrucao == null;
    }
}
