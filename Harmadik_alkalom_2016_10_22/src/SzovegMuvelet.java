/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class SzovegMuvelet {
    public static String intelligensLevagas(String s, int hossz){
        if(s.length() > hossz){
            s = s.substring(0, hossz);
            int poz1 = s.lastIndexOf(".");
            int poz2 = s.lastIndexOf("!");
            int poz3 = s.lastIndexOf("?");
            if(poz1 > poz2 && poz1 > poz3){
                return s.substring(0, poz1+1);
            }else if(poz2 > poz1 && poz2 > poz3){
                return s.substring(0, poz2+1);
            }else{
                return s.substring(0, poz3+1);
            }
        }
        return s;
    }
    
    public static String kKiszed(String s){
        //lista a k -król
        //meg kell nézni, hogy a listában szereplő
        //kifejezések szerepelnek a szövegben
        String[] kLista = {
            "Állat",
            "Állatkínzó",
            "Alpári",
            "Alulmaradt",
            "Alultáplált"
        };
        for (int i = 0; i < kLista.length; i++) {
            //szöveg kicserélése keresett szöveg,
            //amire ki kell cserélni
            s = s.replace(kLista[i], "***");
        }
        return s;
    }
    
    public static void main(String[] args) {
        String s = "– hívott fel 2006. október 23-án az egyik legjobb gimnáziumi barátom, akit most nevezzünk csak Zénónak. Én akkor érkeztem haza Dabasról, a nagyszüleimtől, előtte pedig az akkori barátnőméknél aludtam Leányfalun, tehát csak a nap végére tudtam meg, hogy mi megy a városban. 2006-ot írunk, nekem akkor még csak egy Nokia 3220-asom volt, amin ugyan már lehetett volna net, de még bőven messze volt a mai információs fejlettségtől.\n" +
"Szóval ott álltam a Gyáli úti lakásunk nappalijában, miközben édesapám csípőre tett kézzel figyelte a Hír tévét. Vérző fejű, síró emberek, magyar zászlót tartó maszkos csávóval a tetején elszabaduló tank a Deák téren és iszonyatos balhé mindenhol a városban. Már elmúlt este 11, amikor hívott Zénó. Zaklatott hangon közölte, hogy verik a magyarokat a városban, forradalom van, és azonnal menjek én is, és legyek olyan szíves hozni neki egy sálat, mert mindenhol könnygázoznak. Anyám szigorú tekintettel nézett rám, hogy eszembe ne jusson kimenni, édesapám egy ideig szintén ezen a véleményen volt, de aztán áldását adta az egészre. Én meg fogtam magam, és a sálgyűjteményemből kihalásztam egy West Ham United- meg egy Fradi-sálat. Fradista vagyok, na, a pályától öt percre nőttem fel, a gyerekszobám ablakán át hallottam '95-ben, ha gólt lőttünk a BL-ben, az öcsém pedig egészen egy felnőtt meccsig vitte a klubnál. Tök kézenfekvő ötletnek tűnt.";
        System.out.println(SzovegMuvelet.intelligensLevagas(s, 320));
    }
}
