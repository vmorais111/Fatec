/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prática3;

/**
 *
 * @author guara
 */
public class Questão7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//     07. Dado dois vetores, A (5 elementos) e B (8 elementos), faça um programa em C que imprima todos os elementos comuns
//     aos dois vetores.
        int A[] = {1,2,4,6,21};
        int B[] = {2,3,6,7,9,11,15,20};
        System.out.println("Lista de elementos iguais:");
        for (int i=0;i<A.length;i++){
            int numA= A[i];
            for (int z=0;z<B.length;z++){
                int numB=B[z];
                if (numA==numB){
                    System.out.print(numA + " ");
                }
            }
        }
        System.out.println("");
    }
    
}
