/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prática4;

/**
 *
 * @author guara
 */
public class Disciplina {
    private int codigo;
    private int cargahoraria;

    public Disciplina(int codigo, int cargahoraria) {
        this.codigo = codigo;
        this.cargahoraria = cargahoraria;
    }
    
    public int ch(){
        return cargahoraria;
    }
    
    public void imprimeDisc(){
        System.out.println("Codigo: "+ codigo);
        System.out.println("Carga horaria:" + cargahoraria);
    }
}
