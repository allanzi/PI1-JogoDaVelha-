import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author allan.psantos4
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
            
            if ((Pattern.matches("([ \\d+|\\D+]*[,])+", LinhaColuna)== true) || (Pattern.matches("([a-zA-Z]*[,])+", LinhaColuna)== true) || (Pattern.matches("([a-zA-Z]*[,])?[a-zA-Z]+", LinhaColuna)== true) || (Pattern.matches("[a-zA-Z]+", LinhaColuna)== true) || (LinhaColuna.length() <= 0) || (LinhaColuna.contains(",") == false)) {
                JOptionPane.showMessageDialog(null, "Digite corretamente uma linha e coluna");
                continue;
            }
            
            parts = LinhaColuna.split(",");
            linha = Integer.parseInt(parts[0]);
            coluna = Integer.parseInt(parts[1]);
            
            if ((linha <= 0 || linha > 3) || (coluna <= 0 || coluna > 3)) {
                JOptionPane.showMessageDialog(null, "Digite uma linha e/ou coluna válida");
            }
                
        }while((Pattern.matches("([a-zA-Z]*[,])?[a-zA-Z]+", LinhaColuna)== true) || (Pattern.matches("[a-zA-Z]+", LinhaColuna)== true) || (LinhaColuna.length() <= 0) || (LinhaColuna.contains(",") == false) || (linha <= 0 || linha > 3) || (coluna <= 0 || coluna > 3));
        
        return parts;
    }
    
    static String alteraTabuleiro(int linha, int coluna, String tabuleiro, String numerador)
    {
        if (linha == 1 && coluna == 1) {
            
            tabuleiro = tabuleiro.substring(0,18)+numerador+tabuleiro.substring(19,94);
            
        }else if (linha == 1 && coluna == 2) {
            
            tabuleiro = tabuleiro.substring(0,22)+numerador+tabuleiro.substring(23,94);
            
        }else if (linha == 1 && coluna == 3) {
            tabuleiro = tabuleiro.substring(0,26)+numerador+tabuleiro.substring(27,94);
        }
        
        else if (linha == 2 && coluna == 1) {
            
            tabuleiro = tabuleiro.substring(0,35)+numerador+tabuleiro.substring(36,94);
            
        }else if (linha == 2 && coluna == 2) {
            
            tabuleiro = tabuleiro.substring(0,39)+numerador+tabuleiro.substring(40,94);
            
        }else if (linha == 2 && coluna == 3) {
            
            tabuleiro = tabuleiro.substring(0,43)+numerador+tabuleiro.substring(44,94);
            
        }
        
        else if (linha == 3 && coluna == 1) {
            
            tabuleiro = tabuleiro.substring(0,52)+numerador+tabuleiro.substring(53,94);
            
        }else if (linha == 3 && coluna == 2) {
            
            tabuleiro = tabuleiro.substring(0,56)+numerador+tabuleiro.substring(57,94);
            
        }else if (linha == 3 && coluna == 3) {
            tabuleiro = tabuleiro.substring(0,60)+numerador+tabuleiro.substring(61,94);
        }
        
        return tabuleiro;
    }
    
    static int verificaJogada(int escolhas[][]){
        if (((escolhas[1][1] == escolhas[1][2]) && (escolhas[1][2] == escolhas[1][3])) && ((escolhas[1][1] == 1 && escolhas[1][2] == 1 && escolhas[1][3] == 1) || (escolhas[1][1] == 2 && escolhas[1][2] == 2 && escolhas[1][3] == 2))) {
            
            if (escolhas[1][1] == 1 && escolhas[1][2] == 1 && escolhas[1][3] == 1) {
                return 1;
            }else {
                return 2;
            }
            
        }else if(((escolhas[2][1] == escolhas[2][2]) && (escolhas[2][2] == escolhas[2][3])) && ((escolhas[2][1] == 1 && escolhas[2][2] == 1 && escolhas[2][3] == 1) || (escolhas[2][1] == 2 && escolhas[2][2] == 2 && escolhas[2][3] == 2))){
           
            if (escolhas[2][1] == 1 && escolhas[2][2] == 1 && escolhas[2][3] == 1) {
                return 1;
            }else {
                return 2;
            }
            
        }else if(((escolhas[3][1] == escolhas[3][2]) && (escolhas[3][2] == escolhas[3][3])) && ((escolhas[3][1] == 1 && escolhas[3][2] == 1 && escolhas[3][3] == 1) || (escolhas[3][1] == 2 && escolhas[3][2] == 2 && escolhas[3][3] == 2))){
            
            if (escolhas[3][1] == 1 && escolhas[3][2] == 1 && escolhas[3][3] == 1) {
                return 1;
            }else {
                return 2;
            }
            
        }else if(((escolhas[1][1] == escolhas[2][1]) && (escolhas[2][1] == escolhas[3][1])) && ((escolhas[1][1] == 1 && escolhas[2][1] == 1 && escolhas[3][1] == 1) || (escolhas[1][1] == 2 && escolhas[2][1] == 2 && escolhas[3][1] == 2))){
            
            if (escolhas[1][1] == 1 && escolhas[2][1] == 1 && escolhas[3][1] == 1) {
                return 1;
            }else {
                return 2;
            }
            
        }else if(((escolhas[1][2] == escolhas[2][2]) && (escolhas[2][2] == escolhas[3][2])) && ((escolhas[1][2] == 1 && escolhas[2][2] == 1 && escolhas[3][2] == 1) || (escolhas[1][2] == 2 && escolhas[2][2] == 2 && escolhas[3][2] == 2))){
            
            if (escolhas[1][2] == 1 && escolhas[2][2] == 1 && escolhas[3][2] == 1) {
                return 1;
            }else {
                return 2;
            }
            
        }else if(((escolhas[1][3] == escolhas[2][3]) && (escolhas[2][3] == escolhas[3][3])) && ((escolhas[1][3] == 1 && escolhas[2][3] == 1 && escolhas[3][3] == 1) || (escolhas[1][3] == 2 && escolhas[2][3] == 2 && escolhas[3][3] == 2))){
            
            if (escolhas[1][3] == 1 && escolhas[2][3] == 1 && escolhas[3][3] == 1) {
                return 1;
            }else {
                return 2;
            }
            
        }else if(((escolhas[1][1] == escolhas[2][2]) && (escolhas[2][2] == escolhas[3][3])) && ((escolhas[1][1] == 1 && escolhas[2][2] == 1 && escolhas[3][3] == 1) || (escolhas[1][1] == 2 && escolhas[2][2] == 2 && escolhas[3][3] == 2))){
            
            if (escolhas[1][1] == 1 && escolhas[2][2] == 1 && escolhas[3][3] == 1) {
                return 1;
            }else {
                return 2;
            }
            
        }else if(((escolhas[1][3] == escolhas[2][2]) && (escolhas[2][2] == escolhas[3][1])) && ((escolhas[1][3] == 1 && escolhas[2][2] == 1 && escolhas[3][1] == 1) || (escolhas[1][3] == 2 && escolhas[2][2] == 2 && escolhas[3][1] == 2))){
            
            if (escolhas[1][3] == 1 && escolhas[2][2] == 1 && escolhas[3][1] == 1) {
                return 1;
            }else {
                return 2;
            }
            
        }else if(escolhas[1][1] != 0 && escolhas[1][2] != 0 && escolhas[1][3] != 0  && escolhas[2][1] != 0 && escolhas[2][2] != 0 && escolhas[2][3] != 0&& escolhas[3][1] != 0 && escolhas[3][2] != 0 && escolhas[3][3] != 0){
            return -1;
        }
        
        return 0;
    }
    
    static  int executaJogo(){
        int contador1 = 0, contador2 = 0, contadorVelha = 0, linha = 0, coluna = 0, vez = 0, ganhador = 0;
        int escolhas[][] = new int[4][4];
        String parts[] = new String[10];
        String numerador;
        
        String tabuleiro = "   1   2   3  \n"+
            "1    |   |   |  \n"+
            "2    |   |   |  \n"+
            "3    |   |   |  \n"+
            "\n"+
            "Digite a linha e coluna:  \n";
        
        do {
            if (vez == 0) {
                JOptionPane.showMessageDialog(null, "Vez do jogador: 1");
            }else {
                JOptionPane.showMessageDialog(null, "Vez do jogador: 2");
            }
            
            parts = inciaTabuleiro(tabuleiro);
            
            linha = Integer.parseInt(parts[0]);

            coluna = Integer.parseInt(parts[1]);
            
            if(escolhas[linha][coluna] != 0){
                JOptionPane.showMessageDialog(null, "Esta posição já está ocupada!");
                continue;
            } 
            
            if (vez == 0) {
                escolhas[linha][coluna] = 1;
            }else {
                escolhas[linha][coluna] = 2;
            }
            
            if (vez == 0) {
                numerador = "x";
            }else{
                numerador = "o";
            }
            
            tabuleiro =  alteraTabuleiro(linha, coluna, tabuleiro, numerador);
            
            linha = 0;
            coluna = 0;
            
            int verifica = verificaJogada(escolhas);
            
            if (verifica != 0) {
                
                switch (verifica) {
                    case 1:
                        contador1++;
                        JOptionPane.showMessageDialog(null, "Jogador 1 ganhou, mas o jogo ainda não acabou!");
                        break;
                    case 2:
                        contador2++;
                        JOptionPane.showMessageDialog(null, "Jogador 2 ganhou, mas o jogo ainda não acabou!");
                        break;
                    case -1:
                        contadorVelha++;
                        JOptionPane.showMessageDialog(null, "velha ganhou, mas o jogo ainda não acabou!");
                        break;
                    default:
                        break;
                }
                
                JOptionPane.showMessageDialog(null, "Placar:  \n"
                                                    +"Jogador 1: "+contador1+"\n"
                                                    +"Jogador 2: "+contador2+"\n"
                                                    +"Velha: "+contadorVelha);
                
                for (int[] escolha : escolhas) {
                    for (int j = 0; j < escolha.length; j++) {
                        escolha[j] = 0;
                    }
                }
                tabuleiro = "   1   2   3  \n"+
                            "1    |   |   |  \n"+
                            "2    |   |   |  \n"+
                            "3    |   |   |  \n"+
                            "\n"+
                            "Digite a linha e coluna:  \n";
                vez = 1;
            }
            
            if (vez == 0) {
                vez = 1;
            }else {
                vez = 0;
            }
            
        } while (contadorVelha < 3 && contador1 < 3 && contador2 < 3);
        
        if (contador1 >= 2) {
            return 1;
        }else if (contador2 >= 2) {
            return 2;
        }else if (contadorVelha >= 2) {
            return -1;
        }
        
        return 0;
    }
    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Olá, sejam bem-vindos ao Jogo da Velha!!");
        
        int ganhador = executaJogo();
        
        switch (ganhador) {
            case 1:
                JOptionPane.showMessageDialog(null, "O jogador: 1, ganhou o jogo!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O jogador: 2, ganhou o jogo!");
                break;
            case -1:
                JOptionPane.showMessageDialog(null, "Eita!! A velha ganhou o jogo!");
                break;
            default:
                break;
        }
    }
}
