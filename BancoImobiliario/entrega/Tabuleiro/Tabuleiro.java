/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabuleiro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javafx.util.Pair;

/**
 *
 * @author rafael
 */
public class Tabuleiro {
    
    private final int qtPosicoes;
    private final int posicaoInicial;
    private final Posicao [] posicao;
    
    public Tabuleiro(String nomeArquivo) throws Exception{
        File tabuleiroF = new File(nomeArquivo);
        FileReader tabuleiroFR = new FileReader(tabuleiroF);
        BufferedReader tabuleiroBR = new BufferedReader(tabuleiroFR);
        String qtPosicoesString = tabuleiroBR.readLine();
        this.qtPosicoes = Integer.valueOf(qtPosicoesString);
        this.posicao = new Posicao[this.qtPosicoes + 1];
        for (int i = 1; i <= this.qtPosicoes; i++){
            String posicaoLine = tabuleiroBR.readLine();
            Pair<Integer, Posicao> pair = Posicao.formatPosicao(posicaoLine);
            this.posicao[pair.getKey()] = pair.getValue();
        }
        int posicaoInicial = -1;
        for (int i = 1; i <= this.qtPosicoes; i++)
            if (Posicao.isInicial(posicao[i])){
                posicaoInicial = i;
                break;
            }
        this.posicaoInicial = posicaoInicial;
        /*
        } catch (FileNotFoundException ex) { //tabuleiro.txt não existe
            Logger.getLogger(BancoImobiliario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) { //não tem linha em tabuleiro.txt
            Logger.getLogger(BancoImobiliario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) { //posicao inválida
            Logger.getLogger(Tabuleiro.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    public int getQtPosicoes() {
        return qtPosicoes;
    }

    
    
    public int getPosicaoInicial() {
        return posicaoInicial;
    }

    public Posicao getPosicao(int i) {
        return posicao[i];
    }
    
    
    
}
