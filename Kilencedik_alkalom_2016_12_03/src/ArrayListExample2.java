
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class ArrayListExample2 {
    public static void main(String[] args) {
        Triangle[] tri = new Triangle[5];
        tri[0] = new Triangle();
        tri[1] = new Triangle();
        tri[2] = new Triangle();
        
        //null
        //értékadás tri tömb 0. elemének, amely
        //egy Triangle objektum, a 32 értéket adom
        tri[0].setA(32);
        if(tri[4] == null){
            System.out.println("A negyedik elem nullértékű");
        }
        //null pointer exception
        //tri[4].setA(45);
        if(tri[4] != null){
            tri[4].setA(45);
        }
        //hint
        System.gc();
        for (int i = 0; i < tri.length; i++) {
            /*
            if(tri[i] != null){
                tri[i].setA(i);
            }else{
                tri[i] = new Triangle();
                tri[i].setA(i);
            } */
            if(tri[i] == null){
                tri[i] = new Triangle();
            }
            tri[i].setA(i);
            ArrayList<Triangle> triList = new ArrayList<>();
            
            List l = new ArrayList();
            ArrayList l2 = (ArrayList)l;
            
            
        }   
    }
}
