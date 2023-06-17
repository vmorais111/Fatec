/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica6;

/**
 *
 * @author guara
 */
public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public float calculoDistancia(Ponto p1, Ponto p2){
        float resultado= (float) Math.sqrt(Math.pow(p1.getX()- p2.getX(),2) + Math.pow(p1.getY()- p2.getY(), 2));
        return resultado;

    }
    
}
