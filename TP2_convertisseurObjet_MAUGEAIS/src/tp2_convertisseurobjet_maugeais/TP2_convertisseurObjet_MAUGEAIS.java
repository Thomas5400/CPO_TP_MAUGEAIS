/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_maugeais;

import java.util.Scanner;

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
        
        System.out.println("Quelle conversion voulez vous effectuer ? \n 1 pour Celsius vers Autre \n 2 pour Farenheit vers autre\n 3 pour Kelvin vers autre  ");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        if (a == 1){
            System.out.println("choisissez la valeur a convertir :");
            Scanner T = new Scanner(System.in);
            double c = T.nextDouble();
            System.out.println("La valeur en Kelvin est : "+ Cel.CelsiusversKelvin(c));
            System.out.println("La valeur en Farenheit est : "+ Cel.CelsiusversFarenheit(c));
            
        }
        else {
            if (a == 2){
                System.out.println("choisissez la valeur a convertir :");
                Scanner U = new Scanner(System.in);
                double d = U.nextDouble();
                System.out.println("La valeur en Kelvin est : "+ Cel.FarenheitversKelvin(d));
                System.out.println("La valeur en Celsius est : "+ Cel.FarenheitversCelsius(d));
            }
            else{
                if (a==3){
                    System.out.println("choisissez la valeur a convertir :");
                    Scanner V = new Scanner(System.in);
                    double e = V.nextDouble();
                    System.out.println("La valeur en Kelvin est : "+ Cel.KelvinversFarenheit(e));
                    System.out.println("La valeur en Celsius est : "+ Cel.KelvinversCelsius(e));
                }
                else{
                    System.out.println("ERREUR Veuillez relancer le programme");
                }
            }
                  
        }
             
    }
    
}
