/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Teste_animal;

/**
 *
 * @author guara
 */
public class Zoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Cachorro cao1,cao2;
    cao1= new Cachorro("Pastor Alemão", "Bernardo", 12.3);
    cao2= new Cachorro("São Bernardo", "Pastor", 13.3);
    cao1.imprimirCachorro();
    cao2.imprimirCachorro();
    
    Peixe p1,p2;
    p1=new Peixe("Agua doce","Peixe1",0.3);
    p2=new Peixe("Agua salgada","Peixe2",1.0);
    p1.imprimirPeixe();
    p2.imprimirPeixe();
    
    }
    
}
