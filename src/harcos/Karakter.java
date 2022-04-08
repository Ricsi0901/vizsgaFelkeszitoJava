
package harcos;


import java.util.ArrayList;


public abstract class Karakter {
   String nev ,faj;
   ArrayList<Eszkoz> eszkoztar;

    public Karakter(String nev, String faj) {
        
        if(nev.length()<=3){
            try {
               throw new kivetelExeption("A név túl rövid ");
            } catch (kivetelExeption ex) {
                System.out.println("túl rovid a név"+ex);
                this.nev="játékos";
            }
            
        }else{
            this.nev = nev;
            
        }
        this.faj = faj;
        this.eszkoztar = new ArrayList<>();
        
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
        StringBuilder kirat=new StringBuilder();
        kirat.append("karakter{" + "nev=" + nev + ", faj=" + faj + ", eszkoztar=");
        for (Eszkoz eszkoz : eszkoztar) {
            kirat.append(eszkoz.toString()+",");
        }
        kirat.append("}");
        
        return   kirat.toString();
    }
    
   
}
