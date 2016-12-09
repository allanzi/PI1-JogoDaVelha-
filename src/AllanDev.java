import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joao.sbviana
 */
public class AllanDev {
    static String tabuleiro(String tabuleiro)
    {
        String LinhaColuna;
        
        LinhaColuna = JOptionPane.showInputDialog(null,tabuleiro
                + "Exemplo: (1,1)");
        
        return LinhaColuna;
    }
    
    static String[] inciaTabuleiro(String tabuleiro)
    {
        String LinhaColuna;
        
        String parts[] = new String[10];
        
        int linha = 0, coluna = 0;
        
        do{            
            LinhaColuna = tabuleiro(tabuleiro);
            
            if ((Pattern.matches("([a-zA-Z]*[,])?[a-zA-Z]+", LinhaColuna)== true) || (Pattern.matches("[a-zA-Z]+", LinhaColuna)== true) || (LinhaColuna.length() <= 0) || (LinhaColuna.contains(",") == false)) {
                JOptionPane.showMessageDialog(null, "Digite corretamente uma linha e coluna");
                continue;
            }
            
            parts = LinhaColuna.split(",");
            linha = Integer.parseInt(parts[0]);
            coluna = Integer.parseInt(parts[1]);
            
            if ((linha < 0 || linha > 3) || (coluna < 0 || coluna > 3)) {
                JOptionPane.showMessageDialog(null, "Digite uma linha e/ou coluna válida");
            }
                
        }while((Pattern.matches("([a-zA-Z]*[,])?[a-zA-Z]+", LinhaColuna)== true) || (Pattern.matches("[a-zA-Z]+", LinhaColuna)== true) || (LinhaColuna.length() <= 0) || (LinhaColuna.contains(",") == false) || (linha < 0 || linha > 3) || (coluna < 0 || coluna > 3));
        
        return parts;
    }
    
    static String alteraTabuleiro(int linha, int coluna, String tabuleiro)
    {
        if (linha == 1 && coluna == 1) {
            
            tabuleiro = tabuleiro.substring(0,18)+"x"+tabuleiro.substring(19,94);
            
        }else if (linha == 1 && coluna == 2) {
            
            tabuleiro = tabuleiro.substring(0,22)+"x"+tabuleiro.substring(23,94);
            
        }else if (linha == 1 && coluna == 3) {
            tabuleiro = tabuleiro.substring(0,26)+"x"+tabuleiro.substring(27,94);
        }
        
        else if (linha == 2 && coluna == 1) {
            
            tabuleiro = tabuleiro.substring(0,35)+"x"+tabuleiro.substring(36,94);
            
        }else if (linha == 2 && coluna == 2) {
            
            tabuleiro = tabuleiro.substring(0,39)+"x"+tabuleiro.substring(40,94);
            
        }else if (linha == 2 && coluna == 3) {
            
            tabuleiro = tabuleiro.substring(0,43)+"x"+tabuleiro.substring(44,94);
            
        }
        
        else if (linha == 3 && coluna == 1) {
            
            tabuleiro = tabuleiro.substring(0,52)+"x"+tabuleiro.substring(53,94);
            
        }else if (linha == 3 && coluna == 2) {
            
            tabuleiro = tabuleiro.substring(0,56)+"x"+tabuleiro.substring(57,94);
            
        }else if (linha == 3 && coluna == 3) {
            tabuleiro = tabuleiro.substring(0,60)+"x"+tabuleiro.substring(61,94);
        }
        
        return tabuleiro;
    }
    
    static boolean verificasJogada(int escolhas[][]){
        if (((escolhas[1][0] == escolhas[1][1]) && (escolhas[1][1] == escolhas[1][2])) && (escolhas[1][0] == 1 && escolhas[1][1] == 1 && escolhas[1][2] == 1)) {
            System.out.println("foi");
            return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int contator = 0, linha = 0, coluna = 0;
        int escolhas[][] = new int[4][4];
        String parts[] = new String[10];
        
        String tabuleiro = "   1   2   3  \n"+
            "1    |   |   |  \n"+
            "2    |   |   |  \n"+
            "3    |   |   |  \n"+
            "\n"+
            "Digite a linha e coluna:  \n";
        
        do {
            parts = inciaTabuleiro(tabuleiro);
            
            linha = Integer.parseInt(parts[0]);

            coluna = Integer.parseInt(parts[1]);
            
            if(escolhas[linha][coluna] != 0){
                JOptionPane.showMessageDialog(null, "Esta posição já está ocupada!");
                continue;
            } 
            
            escolhas[linha][coluna] = 1;

            tabuleiro =  alteraTabuleiro(linha, coluna, tabuleiro);
            
            linha = 0;
            coluna = 0;
            
            if (verificasJogada(escolhas) == true) {
                tabuleiro = "   1   2   3  \n"+
                            "1    |   |   |  \n"+
                            "2    |   |   |  \n"+
                            "3    |   |   |  \n"+
                            "\n"+
                            "Digite a linha e coluna:  \n";
                contator++;
            }
            
        } while (contator <= 2);
        
        JOptionPane.showMessageDialog(null, "Você ganhou, parabéns!");
    }
}
