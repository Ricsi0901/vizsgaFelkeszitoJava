/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harcos;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author Szucs.R.David
 */
public class Harcos extends Karakter  {
    int ero,ugyesseg;

    public Harcos(int ero, int ugyesseg, String nev) {
        super(nev, "ember");
        this.ero = ero;
        this.ugyesseg = ugyesseg;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void eldobbeszkozTipus (String neve){
        
        System.out.println(neve);
       System.out.println(eszkoztar.get(1).getNev());
        for (int i = 0; i < eszkoztar.size(); i++) {
            
            if(eszkoztar.get(i).getNev()==neve){
                System.out.println(eszkoztar.get(i).getNev());
                 eldobb(i);
                i=0;
               
            } 
            System.out.println(i);
            
        }
        
        
            
    }

    
    @Override
    public void eldobb(int eldobasErteke) {
        super.eldobb(eldobasErteke); 
        
    }

    @Override
    public void felvesz(Eszkoz eszkoz) {
        super.felvesz(eszkoz); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compare(Object o1, Object o2) {
        return o1.equals(o2);
        
    }

    @Override
    public int compareTo(Eszkoz o) {
        return ;
      
    }
    
    
}
