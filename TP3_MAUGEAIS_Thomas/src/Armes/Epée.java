/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author thoma
 */
public class Epée extends Arme {
    private int finesse;
    
    public Epée (int finesse,String N, int ATT){//constructeur epee
        super (N,ATT);//on réutilise les attribut du constructeur d'arme
        if (finesse>=0&finesse<100){//condition sur la finesse de l'epee
            this.finesse=finesse;
        }
        else{
            this.finesse=1;
        }
    }
    
    public int getFinesse(){//méthode pour avoir la finesse 
        return finesse;
    }
    
    public void setFinesse(int finesse ){//méthode pour changer la finesse de l'arme la finesse
        if (finesse<=100&finesse>=0){
            this.finesse=finesse;
        }
    }
    
    @Override
    public String toString () {//to String permet de renvoyer à l'utilisateur un résultat de manière "claire" les caractéristiques de l'arme
          return "Epee{"+ "Nom = "+ Nom+ "    Attaque = "+ Attaque + "     Finesse = "+ finesse+ "}"  ;
    }
}
