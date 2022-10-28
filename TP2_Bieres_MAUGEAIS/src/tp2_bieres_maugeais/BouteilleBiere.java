/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_maugeais;

/**
 *
 * @author thoma
 */
public class BouteilleBiere {// création classe bouteille
    String nom ;// Différents attributs de la classe
    double degreAlcool;
    String brasserie;
    boolean ouverte;
    public void lireEtiquette() {//Affichage de l'étiquette en affichant proprement les attributs et du texte pour présenter
        System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ;
    }
    public boolean Décapsuler () {//méthode Décapsuler
        if (ouverte==false){// Si l'état de la biere n'est pas déjà "ouverte" alors
            ouverte=true; // on change cet état
            return true;// La bouteille à bien été décapsulée
        }
        else{
            System.out.println("erreur : biere déjà ouverte");//on affiche un message d'erreur 
            return false;//la biere a déja été ouverte on ne peut pas la décapsuler
        }
    }
    @Override//méthode String qu'on nous demande de rentrer
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
    }// avec tostring on affiche proprement l'état de la bouteille
        
    
public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {// constructeur de "bouteille de biere" cela permet de creer plus facilement et rapidement des objets de cette classe dans le main
 nom = unNom;// les attributs de l'objet sont les variables d'entrées 
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}

    
}
