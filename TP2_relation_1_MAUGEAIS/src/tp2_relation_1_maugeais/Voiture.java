/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_maugeais;

/**
 *
 * @author thoma
 */
public class Voiture {
    
    String Modele;  // On rentre les attributs de la classe voiture 
    String Marque;
    int PuissanceCV;
    Personne Proprietaire ;

    
    public Voiture(String un_modele, String une_marque, int puissance){ // la construction d'une voiture avec les attributs comme variables d'entrée
        Modele= un_modele;
        Marque= une_marque;
        PuissanceCV= puissance;
        Proprietaire = null;// ne possède aucun propriétaire au début
        
    }  
    @Override
    public String toString () {//to String permet de renvoyer à l'utilisateur un résultat de manière "claire" des attributs que l'on a pour une voiture
    return "Marque : "+ Marque+ "    Modele : "+ Modele+ "    Puissance : "+ PuissanceCV+ " chevaux";
}

}
