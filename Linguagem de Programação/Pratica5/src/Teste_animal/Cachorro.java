/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teste_animal;

/**
 *
 * @author guara
 */
public class Cachorro extends Animal{
    private String ra�a;

    public Cachorro(String ra�a, String nome, double peso) {
        super(nome, peso);
        this.ra�a = ra�a;
    }

    public String getRa�a() {
        return ra�a;
    }

    public void setRa�a(String ra�a) {
        this.ra�a = ra�a;
    }
    
    public void imprimirCachorro(){
        System.out.println("Nome: " + nome);
        System.out.println("Peso: "+ peso);
        System.out.println("Ra�a: "+ra�a);
        System.out.println("");
    }    
}
