/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author thoma
 */
public class Arme { //Création classe arme
    String Nom;//Attributs nom et stats d'attaque de l'arme
    int Attaque ;
    
    public Arme(String NOM_ARME, int ATT_ARME){//Constructeur d'une arme
        if (ATT_ARME>100|| ATT_ARME<0){
            System.out.println("Impossible cette arme doit avoir une attaque comprise entre 0 et 100");//SI arme non entre 0 et 100 impossible
        }
        else{  
            Nom = NOM_ARME;// Sinon on crée l'arme
            Attaque = ATT_ARME;      
        } 
 
    }
    
        @Override
    public String toString () {//to String permet de renvoyer à l'utilisateur un résultat de manière "claire" les caractéristiques de l'arme
    return "Nom de l'arme :"+ Nom+ "\nStat d'attaque : "+ Attaque;
    }
    
    
    
}
