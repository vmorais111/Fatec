/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prática4;

/**
 *
 * @author guara
 */
public class Prática4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Disciplina dp1,dp2,dp3,dp4;
        dp1 = new Disciplina(1,20);
        dp2 = new Disciplina(2,30);
        dp3 = new Disciplina(3,40);
        dp4 = new Disciplina(4,40);
        
        Curso curso = new Curso(1,"Teste");
        curso.adicionaDisc(dp1);
        curso.adicionaDisc(dp2);
        curso.adicionaDisc(dp3);
        curso.adicionaDisc(dp4);
        curso.imprimir();
        
    }
    
}
