
package harcos;


public class Eszkoz {
     String nev ;
     double suly;

    public Eszkoz(String nev, double suly) {
        this.nev = nev;
        this.suly = suly;
    }

    @Override
    public String toString() {
        return "Eszkoz{" + "nev=" + nev + ", suly=" + suly + '}';
    }
     
}
