/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prática2;

/**
 *
 * @author guara
 */
public class Aluno {
    
    private int ra;
    private String nome;
    private char sexo;
    private String rg;
    private String cpf;
    private Data dataNasc;

    public Aluno(int ra, String nome, char sexo, String rg, String cpf, int dia, int mes, int ano) {
        this.ra = ra;
        this.nome = nome;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasc = new Data(dia, mes, ano);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void imprimirAluno(){
       System.out.println("RA: "+ this.getRa());
       System.out.println("Nome: "+ this.getNome());
       System.out.println("Sexo: "+this.getSexo());
       System.out.println("RG: "+ this.getRg());
       System.out.println("CPF: "+this.getCpf());
       System.out.println("Data: "+ this.dataNasc.Formatardata());
    }
}
