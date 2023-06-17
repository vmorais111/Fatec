/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prática4;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author guara
 */
public class Curso {
    private int numero;
    private String nome;
    private List<Disciplina> listadisciplina;

    public Curso(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        listadisciplina = new ArrayList<Disciplina>();
    }
    
    public void adicionaDisc(Disciplina disciplina){
        listadisciplina.add(disciplina);
    }
    
    public void exibeDCHMaior(){
        int ct=0;
        for (int i=0;i<listadisciplina.size();i++){
            int bn=listadisciplina.get(i).ch();
            if (ct<bn){
                ct=bn;
            }
        }
        System.out.println("Carga horaria maior:" + ct);
    }
    
    public int calcularTotalHora(){
        int soma=0;
        for (int i=0;i<listadisciplina.size();i++){
            soma+=listadisciplina.get(i).ch();
        }
        return soma;
    }
    
    public void imprimir(){
        System.out.println("numero: " + numero);
        System.out.println("nome: "+ nome);
        for (int i=0;i<listadisciplina.size();i++){
            Disciplina disc = listadisciplina.get(i);
            System.out.println("*");
            disc.imprimeDisc();
        }
        System.out.println("*");
        System.out.println("Total de horas:" + calcularTotalHora());
        exibeDCHMaior();        
    }
    
}
