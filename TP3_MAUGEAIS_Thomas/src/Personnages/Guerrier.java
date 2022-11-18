/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Personnages.Personnage;

/**
 *
 * @author thoma
 */
public class Guerrier extends Personnage {
    private boolean Cheval;//attribut cheval du guerrier
    
    public Guerrier (boolean Cheval,String Name, int LP){//Constructeur du guerrier
        super (Name,LP);//reutilisation attributs personnage
        this.Cheval= Cheval ;   
    }
    public void setHorse(boolean Cheval){//changer la condition cheval du guerrier
        this.Cheval=Cheval;
        
    }
    
    
        @Override
    public String toString () {//to String permet de renvoyer à l'utilisateur un résultat de manière "claire" les caractéristiques de guerrier
    return "Guerrier{"+ "Nom : "+ Nom_perso+ "    A cheval ? : "+ Cheval + "     Points de vie = "+ Life+ "}"  ;
    }
}
