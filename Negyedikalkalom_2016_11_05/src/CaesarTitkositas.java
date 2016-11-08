public class CaesarTitkositas {
    //metódus (függvény)
    public static String coder(String s, int shift){
        String sUpper = s.toUpperCase();
        String rString = "";
        for (int i = 0; i < sUpper.length(); i++) {
            //a karaketr kódját
            int charCode = (int)sUpper.charAt(i);
            //a karakter kódjához hozzáad
            int shiftCharCode = charCode +shift;
            //a megváltozott karakterkód visszaalakitása
            //karakterré
            rString += (char)shiftCharCode;
            //rString += (char)((int)sUpper.charAt(i)+shift);
        }
        return rString;        
    }
    
    public static String decoder(String s, int shift){
        return coder(s, shift*-1);
    }
    
    public static void main(String[] args) {
        System.out.println(coder("Helló világ",5));
        System.out.println(decoder("MJQQØ%[NQÆL", 5));
    }
}