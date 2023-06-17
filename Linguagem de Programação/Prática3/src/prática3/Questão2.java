/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prática3;

import java.util.Scanner;

/**
 *
 * @author guara
 */
public class Questão2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    02. Escreva um programa principal que:
//    a) Leia 10 números (vetor inteiros) a partir de valores digitados pelo usuário.
//    b) Imprima na tela apenas os valores maiores e igual a 20.        
          Scanner ler = new Scanner(System.in);
          int bn = 10;
          int vetorbn[] = new int [bn];
          for (int i=0; i<bn; i++){
            System.out.printf("Informe %do valor de %d: ", (i+1), bn);
            vetorbn[i]=ler.nextInt();
          }
           for (int i=0; i<bn; i++){
             if (vetorbn[i]>=20){
                 System.out.printf("O valor da pos. %d e %d\n", (i+1), vetorbn[i]);
            }
          }

    }
    
}
