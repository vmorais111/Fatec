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
    private String raça;

    public Cachorro(String raça, String nome, double peso) {
        super(nome, peso);
        this.raça = raça;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
    
    public void imprimirCachorro(){
        System.out.println("Nome: " + nome);
        System.out.println("Peso: "+ peso);
        System.out.println("Raça: "+raça);
        System.out.println("");
    }    
}
