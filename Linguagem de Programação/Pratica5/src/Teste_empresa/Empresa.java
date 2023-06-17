/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Teste_empresa;

/**
 *
 * @author guara
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente g1,g2;
        g1 = new Gerente(1234,"Luana",899292,1200.00);
        g2 = new Gerente(2457,"Mariana",88898,1300.00);
        g1.imprimir();g2.imprimir();
        System.out.println(g1.autentica(1345));
        System.out.println(g2.autentica(2457));
    }
    
}
