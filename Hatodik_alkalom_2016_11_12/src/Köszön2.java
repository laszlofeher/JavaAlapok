
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class Köszön2 { 
  public static void main(String[] args) { 
    String vezetékNév=null, keresztNév=null;            //1
    
    Scanner scanner = new Scanner(System.in);
    
    while((vezetékNév = scanner.nextLine()).equals("")){          //2 
      System.out.println("Hiányzó vezetéknév. Újra!");  //3 
    }
    while((keresztNév = scanner.nextLine()).equals(""))          //3 
      System.out.println("Hiányzó keresztnév. Újra!"); 
    System.out.println("Üdvözlöm "+vezetékNév+" "+ 
      keresztNév+"!");                                  //4 
  } 
}
