
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
    static String NomeJ1 (){
        String nomeJ1 = JOptionPane.showInputDialog("Jogador 1, digite seu nome:");
        return nomeJ1;
    }
    static String NomeJ2 (){
        String nomeJ1 = JOptionPane.showInputDialog("Jogador 2, digite seu nome:");
        return nomeJ1;
    }
    static byte XouO (String nomeJ1,String nomeJ2){
        String jogador1 =nomeJ1;
        String jogador2 =nomeJ2;
        byte escolha = Byte.parseByte(JOptionPane.showInputDialog(jogador1 +" escolha um número"
                + "0 e 1: \n0 - O \n1 - X \n"));        
        while (escolha > 0 && escolha < 2){
        switch (escolha){
            case 0: 
                JOptionPane.showMessageDialog(null,jogador1 +" você escolheu O, então"+ jogador2
                    + " ficou com X");
                break;
            case 1: 
                JOptionPane.showMessageDialog(null,jogador1 +" você escolheu O, então"+ jogador2
                    + " ficou com X");
                break;
            default:
                JOptionPane.showInputDialog("ERRO! Digite apenas um número entre 0 e 1");
        }
    } return escolha;
    }
    static byte mostraXouO (byte escolha, String jogador1, String jogador2){
        Random gerador = new Random ();
        byte resultado = gerador.nextBytes(10) +1;
        
        if (resultado % 2 == 1){
            JOptionPane.showMessageDialog(null, "         [ "+resultado+" ]        "+"\n"+jogador2 + " ganhou, então ele começa!! ");
        }else{
            JOptionPane.showMessageDialog(null, "         [ "+resultado+" ]        "+"\n"+jogador1 + " ganhou, então ele começa!! ");
        }return resultado;
    }
    public static void main(String[] args) {
        String jogador1 = NomeJ1();
        String jogador2 = NomeJ2();
        byte escolha = XouO(jogador1, jogador2);
        byte resultadoXouO = mostraXouO(escolha, jogador1, jogador2);
    }
    
}
