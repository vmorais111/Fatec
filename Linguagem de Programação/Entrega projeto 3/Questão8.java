/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prática3;

/**
 *
 * @author guara
 */
public class Questão8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//     08. Suponha um vetor N com 10 elementos e outro vetor M com 10 elementos. Faça um programa em C que calcule o produto 
//     escalar P de A por B. (Isto é, P =A[1]*B[1] + A[2]*B[2] + ... A[N]+B[N]).
        int M[] = {1,2,3,4,5,6,7,8,9,10};
        int N[] = {1,1,1,1,1,1,1,1,1,1};
        int soma=0;
        for (int i=0;i<M.length;i++){
            int C=M[i]*N[i];
            soma+=C;
        }
        System.out.print("O produto escalar de ambos os vetores e " + soma + "\n");
    }
    
}
