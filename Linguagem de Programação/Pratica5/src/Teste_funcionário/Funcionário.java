/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teste_funcion�rio;

/**
 *
 * @author guara
 */
public class Funcion�rio extends Pessoa{
    private double sal�rio;

    public Funcion�rio(double sal�rio, String RG, String Nome) {
        super(RG, Nome);
        this.sal�rio = sal�rio;
    }

    public double getSal�rio() {
        return sal�rio;
    }

    public void setSal�rio(double sal�rio) {
        this.sal�rio = sal�rio;
    }
    
    public double aumentar_salario(double percent){
        this.sal�rio+= sal�rio*(percent/100);
        return sal�rio;
    }
    
}
