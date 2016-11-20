/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroma;

/**
 *
 * @author tanulo
 */
public class Palindroma {
    
    public boolean isPalindroma(String s){
        s = allTrim(s);
        s = removeExtraChar(s);
        for (int i = 0; i < s.length()/2; i++) {
            if(s.toLowerCase().charAt(i) != s.toLowerCase().charAt((s.length()-1)-i)){
                return false;
            }
        }
        return true;
    }
    
    public String allTrim(String s){
        return s.replace(" ", "");
    }
    
    public String removeExtraChar(String s){
        return s.replace(".!?,;:", "");
    }
    
    public static void main(String[] args) {
        Palindroma p = new Palindroma();
        System.out.println(p.isPalindroma("Évák eledele kávé"));
    }
}