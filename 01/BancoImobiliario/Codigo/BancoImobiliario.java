import Jogada.Jogada;
import Tabuleiro.Tabuleiro;

public class BancoImobiliario {

    public static void main(String[] args) throws Exception{
        Tabuleiro tabuleiro = new Tabuleiro("tabuleiro.txt");
        Jogada jogada = new Jogada("jogadas.txt");
        jogada.simular(tabuleiro,"estatisticas.txt");
    }
    
}
