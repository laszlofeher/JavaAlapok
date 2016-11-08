/**
 * Feladat : 
 * 1-100 ig a páros számok négyzetének összege.
 * @author tanulo
 */
public class ParosSzamok {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%2 == 0){
                //sum += i*i;
                sum += (int)Math.pow(i,2);
            }
        }
        System.out.println(sum);
    }
}
