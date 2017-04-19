
import java.util.ArrayList;

/**
 *
 * @author tanulo
 */
public class SzetValogat {
    private ArrayList<Integer> tomb = new ArrayList();
    private ArrayList<Integer> paros    = new ArrayList();
    private ArrayList<Integer> paratlan = new ArrayList();
    
    public ArrayList<Integer> getTomb() {
        return tomb;
    }

    public void setTomb(ArrayList<Integer> tomb) {
        this.tomb = tomb;
    }

    public ArrayList<Integer> getParos() {
        return paros;
    }

    public ArrayList<Integer> getParatlan() {
        return paratlan;
    }
    
    /**
     * Páros páratlan szétválogatás
     */
    public void valogat(){
        //foreach 
        for(Integer elem : this.tomb){
            if(elem % 2 == 0){
                this.paros.add(elem);
            }else{
                this.paratlan.add(elem);
            }
        }
    }

    @Override
    public String toString() {
        return "SzetValogat{" + "tomb=" + tomb + ", paros=" + paros + ", paratlan=" + paratlan + '}';
    }
    
}
