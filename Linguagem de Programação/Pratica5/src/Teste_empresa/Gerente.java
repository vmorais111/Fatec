/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teste_empresa;

/**
 *
 * @author guara
 */
public class Gerente extends Funcionário{
    private int senha;

    public Gerente(int senha, String nome, int cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    boolean autentica(int senha){
        return this.senha==senha;
    }
    
    public void imprimir(){
        System.out.println("senha: "+senha);
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Salário: "+salario+"\n");
    }
}
