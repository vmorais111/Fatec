/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prática2;

/**
 *
 * @author guara
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno al1,al2,al3;
        al1= new Aluno(33049251, "Joselito Morales", 'M',"31.123.321-5", "789.678.567-43", 12, 12, 23);
        al2= new Aluno(33049251, "Miguelito Silva", 'M',"32.333.444-6", "567.443.221-22", 14, 01, 23);
        al3= new Aluno(33049251, "Mariana Silveira", 'F',"22.454.323-5", "798.000.111-34", 12, 06, 23);
        
        Escola escola=new Escola("Escola Estadual Mazaropi");
        escola.addAluno(al1);
        escola.addAluno(al2);
        escola.addAluno(al3);
        escola.imprimir();
    }
    
}
