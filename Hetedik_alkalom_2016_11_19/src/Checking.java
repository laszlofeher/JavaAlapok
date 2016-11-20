/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class Checking {
    
    /**
     * email cim ellenorzese
     */
    
    
    public boolean emailCheck(String s){
        if(s!= null && s.length() >0){
            if(s.contains("@")){
                String s1 = s.substring(s.indexOf("@"));
                int pos = s1.indexOf(".");
                if(s1.length()-pos > 1){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
        public boolean emailCheck2(String s){
            if(emptyString(s)){
                return stringContainChars(s, '@','.');
            }
            return false;
        }
        
        public boolean emptyString(String s){
            if(s!= null && s.length() >0){
                return true;
            }
            return false;
        }
        
        public boolean stringContainChars(String s, char at, char point){
            int pos = s.indexOf(at);
            if(pos > 0){
                String s1   = s.substring(pos);
                int pos2    = s1.indexOf(point);
                if(pos2>0){
                    return s1.length()-pos2 > 1;
                }
            }
            return false;
        }
}       





