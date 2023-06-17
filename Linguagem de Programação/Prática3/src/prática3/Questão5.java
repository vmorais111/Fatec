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
public class Questão5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    05. Leia um vetor de 8 posições e troque os 4 primeiros valores pelos 4 últimos e vice e versa. 
//    Escreva ao final o vetor obtido
            int tamvet=8;int pedra=4;
            int var1=0; int var2=4;int var3=4; int var4=0;
            int vetor[] = new int [tamvet];
            int vetor2[] = new int[tamvet];
            Scanner ler = new Scanner(System.in);
            
            for (int i=0; i<tamvet;i++){
                System.out.println("Insira o valor:");
                vetor[i]= ler.nextInt();
            }
            
            do {vetor2[var1]=vetor[var2];var2++;var1++;}
            while (var1<pedra);
            
            do {vetor2[var3]=vetor[var4];var4++;var3++;}
            while (var4<pedra);
            
            System.out.println("Vetor: "+ Arrays.toString(vetor2));

    }
    
}
