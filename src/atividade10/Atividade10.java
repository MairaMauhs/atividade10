/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade10;

/**
 *
 * @author AliraMaria
 */
public class Atividade10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desenvolver um algoritmo que efetue a soma
        //de todos os números ímpares que são múltiplos 
        //de três e que se encontram no conjunto dos números de 1 até 500.
        
        int cont, soma;
        
        cont = 0;
        soma = 0;
        
        while (cont > = 0  e & cont <= 500 ) {
        cont ++ ;
        if (cont % 2  ! =  0 e  & cont % 3  ==  0 ) {
        soma + = cont;
        }
        }

        JOptionPane . showMessageDialog ( null , " Soma dos números múltiplos de"
                + " três entre 0 e 500 é: "  + soma);
            
        }
    }
    
}
