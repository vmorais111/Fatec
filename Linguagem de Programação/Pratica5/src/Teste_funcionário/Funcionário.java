/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teste_funcionário;

/**
 *
 * @author guara
 */
public class Funcionário extends Pessoa{
    private double salário;

    public Funcionário(double salário, String RG, String Nome) {
        super(RG, Nome);
        this.salário = salário;
    }

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }
    
    public double aumentar_salario(double percent){
        this.salário+= salário*(percent/100);
        return salário;
    }
    
}
