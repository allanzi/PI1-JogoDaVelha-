
import java.util.Random;
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
public class JoaoDev {

    static byte XouO (){
        
        byte escolha = Byte.parseByte(JOptionPane.showInputDialog("jogador1 escolha um número"
                + " 0 e 1: \n0 - O \n1 - X \n"));  
        
        while (escolha < 0 || escolha > 1){
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
            
            escolha = Byte.parseByte(JOptionPane.showInputDialog("jogador1 escolha um número"
                + " 0 e 1: \n0 - O \n1 - X \n"));  
        }
        
        switch (escolha){
            case 0: 
                JOptionPane.showMessageDialog(null,"jogador1 você escolheu O, então jogador2 ficou com X");
            break;
            case 1: 
                JOptionPane.showMessageDialog(null,"jogador1 você escolheu X, então jogador2 ficou com O");
            break;
        } 
        return escolha;
    }
    static int mostraXouO (int escolha){
        Random gerador = new Random ();
        int resultado = 0;
        
        JOptionPane.showMessageDialog(null, "Vamos fazer um jogo de par ou impar, para ver quem começa a jogar");
        int pOUi = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 digite: \n0 para par \n1 para ímpar"));
        
        switch (pOUi){
            case 0: 
                JOptionPane.showMessageDialog(null,"Jogardor 1 escolheu par, então Jogador 2 fica com ímpar");
                int numJ1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 digite um número de 0 a 10"));
                int numJ2 = Integer.parseInt (JOptionPane.showInputDialog("Jogador 2 digite um númerpo de 0 a 10"));
                resultado = gerador.nextInt(10) +1;
        
        if (resultado % 2 == 0){
            JOptionPane.showMessageDialog(null, "         [ "+resultado+" ]        "+"\njogador1  ganhou, então ele começa!! ");
        }else{
            JOptionPane.showMessageDialog(null, "         [ "+resultado+" ]        "+"\njogador2 ganhou, então ele começa!! ");
        }  
        break;
            case 1: 
                JOptionPane.showMessageDialog(null,"Jogardor 1 escolheu ímpar, então Jogador 2 fica com par");
                numJ1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 digite um número de 0 a 10"));
                numJ2 = Integer.parseInt (JOptionPane.showInputDialog("Jogador 2 digite um númerpo de 0 a 10"));
                resultado = gerador.nextInt(10) +1;
        
        if (resultado % 2 == 1){
            JOptionPane.showMessageDialog(null, "                               [ "+resultado+" ]        "+"\njogador1  ganhou, então ele começa!! ");
        }else{
            JOptionPane.showMessageDialog(null, "                               [ "+resultado+" ]        "+"\njogador2 ganhou, então ele começa!! ");
        }    
        break;
            default:
            JOptionPane.showMessageDialog(null, "ERRO!! Digite apenas 0 ou 1");
        }
        return resultado;
    }
    public static void main(String[] args) {
        int escolha = XouO();
        int resultadoXouO = mostraXouO(0);
        
    }
    
}
