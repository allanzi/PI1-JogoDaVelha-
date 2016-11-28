
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
    public static void main(String[] args) {
        String LinhaColuna;
        
        LinhaColuna = JOptionPane.showInputDialog(null,   
                "   1   2   3  \n"+
                "1    |   |   |  \n"+
                "2    |   |   |  \n"+
                "3    |   |   |  \n"+
                "\n"+
                "Digite a linha e coluna:  \n"
                + "Exemplo: (1,1)");
        
        while (LinhaColuna.length() < 0 || LinhaColuna.contains(",") == false) {            
            JOptionPane.showMessageDialog(null, "Digite corretamente uma linha e coluna");
            
            LinhaColuna = JOptionPane.showInputDialog(null,   
                "   1   2   3  \n"+
                "1    |   |   |  \n"+
                "2    |   |   |  \n"+
                "3    |   |   |  \n"+
                "\n"+
                "Digite a linha e coluna:  \n"
                + "Exemplo: (1,1)");
        }
        
        while(Pattern.matches("[a-zA-Z]+", LinhaColuna)){
            JOptionPane.showMessageDialog(null, "Somente digite números separados por ','");
            
            LinhaColuna = JOptionPane.showInputDialog(null,   
                "   1   2   3  \n"+
                "1    |   |   |  \n"+
                "2    |   |   |  \n"+
                "3    |   |   |  \n"+
                "\n"+
                "Digite a linha e coluna:  \n"
                + "Exemplo: (1,1)");
        }
        
        String[] parts = LinhaColuna.split(",");
        
        int linha = Integer.parseInt(parts[0]);
        int coluna = Integer.parseInt(parts[1]);
        
        while((linha < 0 || linha > 3) || (coluna < 0 || coluna > 3)){
            JOptionPane.showMessageDialog(null, "Digite uma linha e/ou coluna válida");
            
            LinhaColuna = JOptionPane.showInputDialog(null,   
                "   1   2   3  \n"+
                "1    |   |   |  \n"+
                "2    |   |   |  \n"+
                "3    |   |   |  \n"+
                "\n"+
                "Digite a linha e coluna:  \n"
                + "Exemplo: (1,1)");
        }
    }
    
    static String Jogadores(int acao, int jogador, String nome) {
        String jogador1 = "", jogador2 = "", resposta = "";
        
        switch(acao){
            
            case 1:
                switch(jogador){
                    case 1:
                        jogador1 = nome;
                        resposta = nome;
                    break;
                    case 2:
                        jogador2 = nome;
                        resposta = nome;
                    break;
                    default:
                        System.out.print("Número de jogador inválido");
                }
                
            break;
            case 0:
                
                switch(jogador){
                    case 1:
                        resposta = jogador1;
                    break;
                    case 2:
                        resposta = jogador2;
                    break;
                    default:
                        System.out.print("Número de jogador inválido");
                }
                
            break;
            default:
                System.out.print("Ação inválida");
                
        }
        
        return resposta;
    }
}
