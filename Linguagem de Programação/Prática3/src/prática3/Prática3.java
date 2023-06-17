/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prática3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author guara
 */
public class Prática3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//              LISTA 3 - Linguagem de Prog.        
//    01. Escreva um programa principal que:
//    a) Leia 10 números (vetor inteiros) a partir de valores digitados pelo usuário.
//    b) Imprima na tela os 10 números.
//          Scanner ler = new Scanner(System.in);
//          int bn = 10;
//          int vetorbn[] = new int [bn];
//          for (int i=0; i<bn; i++){
//            System.out.printf("Informe %d º valor de %d: ", (i+1), bn);
//            vetorbn[i]=ler.nextInt();
//          }
//          for (int i=0; i<bn; i++){
//              System.out.println("Eis o valor da pos. " + (i+1) + ": " + vetorbn[i]);
//          }
//
//    02. Escreva um programa principal que:
//    a) Leia 10 números (vetor inteiros) a partir de valores digitados pelo usuário.
//    b) Imprima na tela apenas os valores maiores e igual a 20.        
//          Scanner ler = new Scanner(System.in);
//          int bn = 10;
//          int vetorbn[] = new int [bn];
//          for (int i=0; i<bn; i++){
//            System.out.printf("Informe %do valor de %d: ", (i+1), bn);
//            vetorbn[i]=ler.nextInt();
//          }
//           for (int i=0; i<bn; i++){
//             if (vetorbn[i]>=20){
//                 System.out.printf("O valor da pos. %d e %d\n", (i+1), vetorbn[i]);
//            }
//          }
//
//    03. Escreva um programa principal que:
//    a) Leia 10 números (vetor de inteiros ) a partir de valores digitados pelo usuário, apenas armazene no vetor os números pares;
//    Obs:os valores devem ser armazenados em  posições consecutivas.
//    b) Imprima na tela a quantidade de valores armazenados no vetor(item a), o maior valor encontrado e também a média desses valores.
//           
//        Scanner ler = new Scanner(System.in);
//        int bn=10;
//        int vetor1[]= new int[bn];
//        int vetor2[]= new int[bn];
//        int ct1=0;
//        int ct2=0;
//        int ct3=0;
//        int maior=0;
//        int soma=0;
//        
//        for (int i=0;i<bn;i++){
//            System.out.println("Insira o valor: ");
//            vetor1[i]=ler.nextInt();
//            if (vetor1[i]%2==0){               
//              vetor2[ct1]=vetor1[i];
//              ct1+=1;
//            }
//        }
//        
//        for (int i=0;i<bn;i++){
//            if (vetor2[i]>0){
//              ct2+=1;    
//            }
//            ct3=vetor2[i];
//            if (ct3>maior){
//              maior=ct3;
//            }
//            soma+=vetor2[i];
//        }
//        
//        System.out.println("\nQuantidade total do vetor: "+ ct2);
//        System.out.println("O maior valor encontrado foi: "+ maior);
//        System.out.println("A media foi de: " + (soma/ct2));
//    
//
//
//    04. Dada uma sequência de n números,imprimi-la na ordem inversa a da leitura.
//            int bn=0;
//            int vetor[];
//            int tamanho;
//            Scanner ler= new Scanner(System.in);
//            System.out.println("Defina o tamanho do vetor");
//            tamanho = ler.nextInt();
//            vetor= new int[tamanho];
//            for (int i=0; tamanho>i;i++){
//                System.out.printf("Informe %do valor de %d: ", (i+1), tamanho);
//                vetor[i]=ler.nextInt();
//            }
//            System.out.println(tamanho);
//            System.out.println("Ordem inversa:");
//            for (int z=(tamanho-1);z>=bn;z--){
//               System.out.println(vetor[z]);
//            }
//
//    05. Leia um vetor de 8 posições e troque os 4 primeiros valores pelos 4 últimos e vice e versa. 
//    Escreva ao final o vetor obtido
//            int tamvet=8;int pedra=4;
//            int var1=0; int var2=4;int var3=4; int var4=0;
//            int vetor[] = new int [tamvet];
//            int vetor2[] = new int[tamvet];
//            Scanner ler = new Scanner(System.in);
//            
//            for (int i=0; i<tamvet;i++){
//                System.out.println("Insira o valor:");
//                vetor[i]= ler.nextInt();
//            }
//            
//            do {vetor2[var1]=vetor[var2];var2++;var1++;}
//            while (var1<pedra);
//            
//            do {vetor2[var3]=vetor[var4];var4++;var3++;}
//            while (var4<pedra);
//            
//            System.out.println("Vetor: "+ Arrays.toString(vetor2));
//            
//            
//   06. Inicialize um vetor de 10 posições e em seguida leia um valor X qualquer. Seu programa devera fazer uma busca do valor
//   de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado.
//          
//            int bn=10;
//            int ct; int crl=0;
//            Scanner ler= new Scanner(System.in);
//            
////          CASO QUEIRA UMA LISTA JÁ FEITA
//            
//            int vetor[] = {2,5,4,54,43,22,5,9,30,15};
//            
////          CASO QUEIRA QUE A PESSOA INSIRA OS VALORES
////
////            int vetor[]= new int [bn];
////            System.out.print("Insira 10 valores no vetor a seguir\n");
////            for (int i=0;i<bn;i++){
////                System.out.println("Insira o valor a seguir:");
////                vetor[i]=ler.nextInt();
////            }
////          
//            System.out.println("\nInsira o valor que deseja procurar");
//            System.out.printf("Valor: ");
//            ct= ler.nextInt();
//            for (int i=0;i<bn;i++){
//                crl++;
//                if (vetor[i]==ct){
//                   System.out.printf("O numero %d encontra-se na pos. %d",ct,crl);
//                   return;              
//                }
//            }
//            System.out.println("Não foi encontrado o num. no vetor");

//     07. Dado dois vetores, A (5 elementos) e B (8 elementos), faça um programa em C que imprima todos os elementos comuns
//     aos dois vetores.
//        int A[] = {1,2,4,6,21};
//        int B[] = {2,3,6,7,9,11,15,20};
//        System.out.println("Lista de elementos iguais:");
//        for (int i=0;i<A.length;i++){
//            int numA= A[i];
//            for (int z=0;z<B.length;z++){
//                int numB=B[z];
//                if (numA==numB){
//                    System.out.print(numA + " ");
//                }
//            }
//        }
//        System.out.println("");

//     08. Suponha um vetor N com 10 elementos e outro vetor M com 10 elementos. Faça um programa em C que calcule o produto 
//     escalar P de A por B. (Isto é, P =A[1]*B[1] + A[2]*B[2] + ... A[N]+B[N]).
//        int M[] = {1,2,3,4,5,6,7,8,9,10};
//        int N[] = {1,1,1,1,1,1,1,1,1,1};
//        int soma=0;
//        for (int i=0;i<M.length;i++){
//            int C=M[i]*N[i];
//            soma+=C;
//        }
//        System.out.print("O produto escalar de ambos os vetores e " + soma);
    }
}
          
    

