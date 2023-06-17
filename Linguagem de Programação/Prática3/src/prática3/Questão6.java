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
public class Questão6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//   06. Inicialize um vetor de 10 posições e em seguida leia um valor X qualquer. Seu programa devera fazer uma busca do valor
//   de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado.
          
            int bn=10;
            int ct; int crl=0;
            Scanner ler= new Scanner(System.in);
            
//          CASO QUEIRA UMA LISTA JÁ FEITA
            
            int vetor[] = {2,5,4,54,43,22,5,9,30,15};
            
//          CASO QUEIRA QUE A PESSOA INSIRA OS VALORES
//
//            int vetor[]= new int [bn];
//            System.out.print("Insira 10 valores no vetor a seguir\n");
//            for (int i=0;i<bn;i++){
//                System.out.println("Insira o valor a seguir:");
//                vetor[i]=ler.nextInt();
//            }
//          
            System.out.println("\nInsira o valor que deseja procurar");
            System.out.printf("Valor: ");
            ct= ler.nextInt();
            for (int i=0;i<bn;i++){
                crl++;
                if (vetor[i]==ct){
                   System.out.printf("O numero %d encontra-se na pos. %d\n",ct,crl);
                   return;              
                }
            }
            System.out.println("Não foi encontrado o num. no vetor");

    }
    
}
