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
public class Magicien extends Personnage{

    private boolean Confirmé;//Attribut pour le magicien si confirme ou non 
    
    public Magicien (boolean Confirmé,String Name, int LP){//constructeur du magicien reutilisant les attributs du constructeur de personnages
        super (Name,LP);
        this.Confirmé= Confirmé ;   
    }
    
    public void setConfirm(boolean Confirmé){//méthode pour changer l'attribut confirme du magicien 
        this.Confirmé=Confirmé;
        
    }
    
    @Override
    public String toString () {//to String permet de renvoyer à l'utilisateur un résultat de manière "claire" les caractéristiques de magicien
    return "Guerrier{"+ "Nom : "+ Nom_perso+ "    Confirmé ? : "+ Confirmé + "     Points de vie = "+ Life+ "}"  ;
    }
    
    
    
}
