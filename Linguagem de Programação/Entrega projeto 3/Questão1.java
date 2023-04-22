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
public class Questão1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    01. Escreva um programa principal que:
//    a) Leia 10 números (vetor inteiros) a partir de valores digitados pelo usuário.
//    b) Imprima na tela os 10 números.
          Scanner ler = new Scanner(System.in);
          int bn = 10;
          int vetorbn[] = new int [bn];
          for (int i=0; i<bn; i++){
            System.out.printf("Informe %d º valor de %d: ", (i+1), bn);
            vetorbn[i]=ler.nextInt();
          }
          for (int i=0; i<bn; i++){
              System.out.println("Eis o valor da pos. " + (i+1) + ": " + vetorbn[i]);
          }

    }
    
}
