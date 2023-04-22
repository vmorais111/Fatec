/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_vetor;

import java.util.Scanner;

/**
 *
 * @author guara
 */
public class Aula_vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        int vetor [];
//        vetor = new int [5];
//        vetor [0]=5;
//        vetor [1]=2;
//        vetor [2]=4;
//        vetor [3]=8;
//        vetor [4]=10;
//        int soma=vetor[0]+ vetor[1]+ vetor[2]+ vetor[3]+ vetor[4];
//        System.out.println(soma);
//        
//
//          Scanner ler = new Scanner(System.in);
//          
//          int n=10;
//          int vetor[]= new int[n];
//          
//          for (int i=0; i<n; i++){
//              System.out.printf("Informe %do valor de %d: ", (i+1), n);
//              vetor[i]= ler.nextInt();
//          }
//      
//        EXERCÍCIO DA AULA
//           
          Scanner ler = new Scanner(System.in);
          int bn = 10;
          int vetorbn[] = new int [bn];
          int soma=0;
          for (int i=0; i<bn;i++){
            System.out.printf("Informe %do valor de %d: ", (i+1), bn);
            vetorbn[i]=ler.nextInt();
            soma+= vetorbn[i];
          }
          System.out.println((float)soma/bn);
          
    }
    
}
