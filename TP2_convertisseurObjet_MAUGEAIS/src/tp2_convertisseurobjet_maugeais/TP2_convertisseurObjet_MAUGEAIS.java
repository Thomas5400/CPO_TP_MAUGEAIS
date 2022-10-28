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
        Convertisseur Cel = new Convertisseur ();//Nouvel objet convertisseur à la base crée juste pour convertir de celsius vers autre mais il peut en réalité tout faire car c'est leXXX de cel.XXX qui fait une conversion ou une autre
        System.out.println(Cel.CelsiusversKelvin(33));// affichage des résultats des conversion pour des valeur de 33 degres celsius
        System.out.println(Cel.CelsiusversFarenheit(33));
        
        Convertisseur Kel = new Convertisseur();                    //// De meme , nouvel objet pour degre Kelvin vers autre
        System.out.println(Kel.KelvinversCelsius(300));
        System.out.println(Kel.KelvinversFarenheit(300));
        System.out.println(Kel.KelvinversFarenheit(450));
        
        
        System.out.println(Cel.toString());//affiche le nombre de conversion de l'objet Cel
        System.out.println(Kel.toString());//affiche le nombre de conversion de l'objet Kel
        
        System.out.println("Quelle conversion voulez vous effectuer ? \n 1 pour Celsius vers Autre \n 2 pour Farenheit vers autre\n 3 pour Kelvin vers autre  ");//Choix de l'utilisateur sur la conversion à effectuer
        Scanner sc = new Scanner(System.in);//Intègre la réponse donnée par l'utilisateur
        
        int a = sc.nextInt();
        if (a == 1){ // si la reponse est 1 alors 
            System.out.println("choisissez la valeur a convertir :");//on demande la, valeur à convertir 
            Scanner T = new Scanner(System.in);//valeur rentrée
            double c = T.nextDouble();//c devient la valeur rentrée
            System.out.println("La valeur en Kelvin est : "+ Cel.CelsiusversKelvin(c));// on calcule et affiche proprement les conversions
            System.out.println("La valeur en Farenheit est : "+ Cel.CelsiusversFarenheit(c));
            
        }
        else {
            if (a == 2){//Raisonnement similaire pour un autre type de conversion, revoir la partie "si a==1"
                System.out.println("choisissez la valeur a convertir :");
                Scanner U = new Scanner(System.in);
                double d = U.nextDouble();
                System.out.println("La valeur en Kelvin est : "+ Cel.FarenheitversKelvin(d));
                System.out.println("La valeur en Celsius est : "+ Cel.FarenheitversCelsius(d));
            }
            else{
                if (a==3){//Raisonnement similaire pour un autre type de conversion, revoir la partie "si a==1"
                    System.out.println("choisissez la valeur a convertir :");
                    Scanner V = new Scanner(System.in);
                    double e = V.nextDouble();
                    System.out.println("La valeur en Kelvin est : "+ Cel.KelvinversFarenheit(e));
                    System.out.println("La valeur en Celsius est : "+ Cel.KelvinversCelsius(e));
                }
                else{
                    System.out.println("ERREUR Veuillez relancer le programme");// Si l'utilisateur rentre une autre valeur que 1, 2 ou 3 alors il y a une erreur et un message prévenant l'utilisateur de recommencer
                }
            }
                  
        }
             
    }
    
}
