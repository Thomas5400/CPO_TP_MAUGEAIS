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

    private boolean Confirmé;
    
    public Magicien (boolean Confirmé,String Name, int LP){
        super (Name,LP);
        this.Confirmé= Confirmé ;   
    }
    
    public void setConfirm(boolean Confirmé){
        this.Confirmé=Confirmé;
        
    }
    
    @Override
    public String toString () {//to String permet de renvoyer à l'utilisateur un résultat de manière "claire" les caractéristiques de l'arme
    return "Guerrier{"+ "Nom : "+ Nom_perso+ "    Confirmé ? : "+ Confirmé + "     Points de vie = "+ Life+ "}"  ;
    }
    
    
    
}
