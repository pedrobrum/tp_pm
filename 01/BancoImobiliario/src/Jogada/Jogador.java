package Jogada;

import Tabuleiro.Imovel;
import Tabuleiro.Posicao;
import Tabuleiro.Tabuleiro;

public class Jogador {
    private final int id;
    private int posicao;
    private double valor;
    private int qtJogadas;
    private int qtVoltas;
    private int qtPassaVez;
    private double aluguelRecebido;
    private double aluguelPago;
    private int gastoImoveis;

    public Jogador(int id, int valorInicial) {
        this.id = id;
        this.valor = valorInicial;
        this.qtJogadas = 0;
        this.qtVoltas = 0;
        this.qtPassaVez = 0;
        this.aluguelRecebido = 0;
        this.aluguelPago = 0;
        this.gastoImoveis = 0;
    }
    
    public void descontarValor(double desconto){
        this.valor -= desconto;
    }
    
    public void creditarValor(double credito){
        this.valor += credito;
    }

    public void setPosicaoInicial(int posicao) {
        this.posicao = posicao;
    }

    public void andar(int incremento, Jogada jogada, Tabuleiro tabuleiro) {
        qtJogadas++;
        while (incremento > 0){
            posicao++;
            if (posicao == tabuleiro.getQtPosicoes()){
                posicao = 1;
            }
            if (posicao == tabuleiro.getPosicaoInicial()){
                qtVoltas++;
                valor += 500;
            }
            incremento--;
        }
        if (tabuleiro.getPosicao(posicao) instanceof Imovel){
            Imovel imovel = (Imovel) tabuleiro.getPosicao(posicao);
            if (imovel.isComprada()){
                if (imovel.getDono() != id){
                    Jogador dono = jogada.getJogadores(imovel.getDono());
                    double pagamento = imovel.getTaxa()*imovel.getValor()/100; //
                    if (valor - pagamento< 0){
                        this.eliminar(jogada, tabuleiro);
                    }
                    else{
                        pagarAluguel(pagamento);
                        dono.receberAluguel(pagamento);
                    }
                }
            }
            else if (imovel.getValor() <= valor){
                imovel.comprar(this);
            }
        }else if (!Posicao.isInicial(tabuleiro.getPosicao(posicao))){
            qtPassaVez++;
        }
    }
    
    public void eliminar(Jogada jogada, Tabuleiro tabuleiro){
        jogada.decrementarJogadores();
        posicao = 0;
        for (int i = 1; i <= tabuleiro.getQtPosicoes(); i++){
            if (tabuleiro.getPosicao(i) instanceof Imovel){
                Imovel imovel = (Imovel) tabuleiro.getPosicao(i);
                if (imovel.getDono() == id)
                    imovel.devolver();
            }
        }
    }

    public boolean isEliminado(){
        return posicao == 0;
    }
    
    public int getId() {
        return id;
    }
    
    public void receberAluguel(double valor){
        aluguelRecebido += valor;
        creditarValor(valor);        
    }
    
    public void pagarAluguel(double valor){
        aluguelPago += valor;
        descontarValor(valor);
    }
    
    public void gastarImovel(double valor){
        this.gastoImoveis += valor;
        descontarValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public int getQtJogadas() {
        return qtJogadas;
    }

    
    
    public int getQtVoltas() {
        return qtVoltas;
    }

    public int getQtPassaVez() {
        return qtPassaVez;
    }

    public double getAluguelRecebido() {
        return aluguelRecebido;
    }

    public double getAluguelPago() {
        return aluguelPago;
    }

    public int getGastoImoveis() {
        return gastoImoveis;
    }
}
