/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsoalkalom_2016_10_08;

/**
 *
 * @author tanulo
 */
public class PokSwitch {
    public static void main(String[] args) {
        int labak = 11;
        
        switch (labak) {
            case 1:
                System.out.println("Kell még 7 láb");
                break;
            case 2:
                System.out.println("Kell még 6 láb");
                break;
            case 3:
                System.out.println("Kell még 5 láb");
                break;
            case 4:
                System.out.println("Kell még 4 láb");
                break;
            case 5:
                System.out.println("Kell még 3 láb");
                break;
            case 6:
                System.out.println("Kell még 4 láb");
                break;
            case 7:
                System.out.println("Kell még 1 láb");
                break;
            case 8:
                System.out.println("Pont elegendő láb van");
                break;
            default:
                System.out.println("Nagyon sok láb ez....");
                break;
        }
        System.out.println(labak == 3 ? "igen" : "nem");
        
        
        
        
        
    }
}
