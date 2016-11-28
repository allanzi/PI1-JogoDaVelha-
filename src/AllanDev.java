
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
    static String tabuleiro()
    {
        String LinhaColuna;
        
        LinhaColuna = JOptionPane.showInputDialog(null,   
                "   1   2   3  \n"+
                "1    |   |   |  \n"+
                "2    |   |   |  \n"+
                "3    |   |   |  \n"+
                "\n"+
                "Digite a linha e coluna:  \n"
                + "Exemplo: (1,1)");
        
        String badah = "   1   2   3  \n"+
                "1    |   |   |  \n"+
                "2    |   |   |  \n"+
                "3    |   |   |  \n"+
                "\n"+
                "Digite a linha e coluna:  \n"
                + "Exemplo: (1,1)";
        
        System.out.println(badah);
        
        String newBadah = badah.substring(0,18)+"x"+badah.substring(19,98);
        
        System.out.print(newBadah);
        
        return LinhaColuna;
    }
    
    static String[] inciaTabuleiro()
    {
        String LinhaColuna;
        
        LinhaColuna = tabuleiro();
        
        while (LinhaColuna.length() < 0 || LinhaColuna.contains(",") == false) {            
            JOptionPane.showMessageDialog(null, "Digite corretamente uma linha e coluna");
            
            LinhaColuna = tabuleiro();
        }
        
        while(Pattern.matches("[a-zA-Z]+", LinhaColuna)== true){
            JOptionPane.showMessageDialog(null, "Somente digite números separados por ','");
            
            LinhaColuna = tabuleiro();
        }
        
        String[] parts = LinhaColuna.split(",");
        
        int linha = Integer.parseInt(parts[0]);
        int coluna = Integer.parseInt(parts[1]);
        
        while((linha < 0 || linha > 3) || (coluna < 0 || coluna > 3)){
            JOptionPane.showMessageDialog(null, "Digite uma linha e/ou coluna válida");
            
            LinhaColuna = tabuleiro();
        }
        
        return parts;
    }
    
    public static void main(String[] args) {
        
        String parts[] = inciaTabuleiro();
        
        int linha = Integer.parseInt(parts[0]);
        int coluna = Integer.parseInt(parts[1]);

        int escolhas[][] = new int[3][3];
        
        while(escolhas[linha][coluna] != 0){
           JOptionPane.showMessageDialog(null, "Esta posição já está ocupada!");
           
           parts = inciaTabuleiro();
        }
        
        if (linha == 1 && coluna == 1) {
            
        }else if (linha == 1 && coluna == 2) {
            
        }else if (linha == 1 && coluna == 3) {
            
        }
        
        else if (linha == 2 && coluna == 1) {
            
        }else if (linha == 2 && coluna == 2) {
            
        }else if (linha == 2 && coluna == 3) {
            
        }
        
        else if (linha == 3 && coluna == 1) {
            
        }else if (linha == 3 && coluna == 2) {
            
        }else if (linha == 3 && coluna == 3) {
            
        }
    }
}
