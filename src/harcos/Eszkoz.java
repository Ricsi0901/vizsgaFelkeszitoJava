
package harcos;

import java.io.Serializable;
import java.text.Collator;
import java.util.Comparator;
import java.util.Objects;


public class Eszkoz implements Serializable,Comparable<Eszkoz>, Comparator{
     private String nev ;
     private double suly;

    public Eszkoz(String nev, double suly) {
        this.nev = nev;
        this.suly = suly;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nev);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.suly) ^ (Double.doubleToLongBits(this.suly) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Eszkoz other = (Eszkoz) obj;
        if (Double.doubleToLongBits(this.suly) != Double.doubleToLongBits(other.suly)) {
            return false;
        }
        if (!Objects.equals(this.nev, other.nev)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Eszkoz{" + "nev=" + nev + ", suly=" + suly + '}';
    }

    public double getSuly() {
        return suly;
    }

    public String getNev() {
        return nev;
    }

    @Override
    public int compareTo(Eszkoz o) {
      return this.nev.compareTo(o.getNev());
    }

    @Override
    public int compare(Object o1, Object o2) {
      Collator col = Collator.getInstance();
      
    }
     
}
