/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_maugeais;

/**
 *
 * @author thoma
 */
public class TP2_convertisseurObjet_MAUGEAIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Convertisseur Cel = new Convertisseur ();
        System.out.println(Cel.CelsiusversKelvin(33));
        System.out.println(Cel.CelsiusversFarenheit(33));
        
        Convertisseur Kel = new Convertisseur();
        System.out.println(Kel.KelvinversCelsius(300));
        System.out.println(Kel.KelvinversFarenheit(300));
        System.out.println(Kel.KelvinversFarenheit(450));
        
        
        System.out.println(Cel.toString());
        System.out.println(Kel.toString());


        
        
        
        
        
        
        
        
    }
    
}
