/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package venda;

/**
 *
 * @author Fatec
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Cliente cli;
       cli=new Cliente("Mariana","10/10/1980",'F',"28788888","1111111111");
       System.out.println(cli.getNome());
        System.out.println(cli.getSexo());
        System.out.println(cli.getRg());
        System.out.println(cli.getCpf());
        System.out.println(cli.getDataNascimento());
    }
    
}
