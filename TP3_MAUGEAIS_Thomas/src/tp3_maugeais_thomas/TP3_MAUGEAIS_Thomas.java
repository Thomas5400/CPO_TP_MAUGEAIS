/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_maugeais_thomas;

import Armes.Epée;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public class TP3_MAUGEAIS_Thomas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Epée Epee_1st = new Epée(5,"Excalibur",7);
        System.out.println(Epee_1st) ;
        
        Epée Epee_2nd = new Epée(7,"Durandal",4);
        System.out.println(Epee_2nd) ;
        
        Baton Baton_1st = new Baton(5,"Chêne",4);
        System.out.println(Baton_1st);
        
        Baton Baton_2nd = new Baton(6,"Charme",5);
        System.out.println(Baton_2nd);
        
        ArrayList<Arme> Armes_du_Y = new ArrayList<Arme>();
        Armes_du_Y.add(Epee_1st);
        Armes_du_Y.add(Epee_2nd);
        Armes_du_Y.add(Baton_1st);
        Armes_du_Y.add(Baton_2nd);
        
        System.out.println(Armes_du_Y);

       
        
        
        
        
        
    }
    
}
