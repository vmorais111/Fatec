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
public class Questão4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    04. Dada uma sequência de n números,imprimi-la na ordem inversa a da leitura.
            int bn=0;
            int vetor[];
            int tamanho;
            Scanner ler= new Scanner(System.in);
            System.out.println("Defina o tamanho do vetor");
            tamanho = ler.nextInt();
            vetor= new int[tamanho];
            for (int i=0; tamanho>i;i++){
                System.out.printf("Informe %do valor de %d: ", (i+1), tamanho);
                vetor[i]=ler.nextInt();
            }
            System.out.println(tamanho);
            System.out.println("Ordem inversa:");
            for (int z=(tamanho-1);z>=bn;z--){
               System.out.println(vetor[z]);
            }

    }
    
}
