/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harcos;

/**
 *
 * @author Szucs.R.David
 */
public class JatekTer {
    public static void main(String[] args) {
        Harcos h1=new Harcos(2, 10, "bela");
        Harcos h2=new Harcos(3, 8, "bella");
        Harcos h3=new Harcos(5, 40, "be");
        System.out.println( h1.toString());
        System.out.println( h2.toString());
        System.out.println( h3.toString());
        
        h1.felvesz(new Eszkoz("strand papucs", 2));
        h1.felvesz(new Eszkoz("kard", 3));
        h1.felvesz(new Eszkoz("pajzs", 4));
        h2.felvesz(new Eszkoz("alma", 1));
         h1.felvesz(new Eszkoz("kard", 4));
          
         h1.eldobb(0);
        System.out.println( h1.toString());
         System.out.println("siker");
        h1.eldobbeszkozTipus("kard");
       System.out.println( h1.toString());
        System.out.println( h2.toString());
        System.out.println( h3.toString());
    }
}
