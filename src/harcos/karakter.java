
package harcos;


import java.util.ArrayList;


public abstract class karakter {
   String nev ,faj;
   ArrayList<Eszkoz> eszkoztar;

    public karakter(String nev, String faj) {
        
        if(nev.length()<=3){
            System.out.println("túl rovid a név");
        }else{
            this.nev = nev;
            this.faj = faj;
            this.eszkoztar = new ArrayList<>();
        }
        
    }
    public void felvesz(Eszkoz eszkoz ){
        eszkoztar.add(eszkoz);
    }
    public void eldobb(int eldobasErteke){
        if (eldobasErteke<eszkoztar.size()){
        eszkoztar.remove(eldobasErteke);}
        
        else{
            System.out.println("túl nagy számot adtál meg ");
        }
    }

    @Override
    public String toString() {
        String eszkozok="";
        for (Eszkoz eszkoz : eszkoztar) {
            eszkozok+=eszkoz.toString();
        }
        return "karakter{" + "nev=" + nev + ", faj=" + faj + ", eszkoztar=" +eszkozok
                + '}';
    }
    
   
}
