/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class Triangle {
    private int a;
    
    public double area(){
        double half = 3*((double)a/2);
        return Math.sqrt(Math.pow((half-a),3));
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    
}
