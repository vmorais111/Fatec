/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Teste_funcionário;

/**
 *
 * @author guara
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Funcionário func=new Funcionário(1200.00,"12380706","Joselito");
       System.out.println(func.getSalário());
       System.out.println(func.aumentar_salario(1.2));
    }
    
}
