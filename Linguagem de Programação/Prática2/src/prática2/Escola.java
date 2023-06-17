/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prática2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guara
 */
public class Escola {
    private String nome;
    private List<Aluno> listAluno;

    public Escola(String nome) {
        this.nome = nome;
        listAluno = new ArrayList<Aluno>();
    }
    
    public void addAluno(Aluno aluno){
        listAluno.add(aluno);
    }
    public void imprimir(){
        System.out.println("nome: "+ nome);
        for (int i=0;i<listAluno.size();i++){
            Aluno aluno = listAluno.get(i);
            System.out.println("*");
            aluno.imprimirAluno();
        }
    }  
    

}

