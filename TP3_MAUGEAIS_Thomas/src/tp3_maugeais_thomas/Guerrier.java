/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_maugeais_thomas;

/**
 *
 * @author thoma
 */
public class Guerrier extends Personnage {
    private boolean Cheval;
    
    public Guerrier (boolean Cheval,String Name, int LP){
        super (Name,LP);
        this.Cheval= Cheval ;   
    }
    public void setHorse(boolean Cheval){
        this.Cheval=Cheval;
        
    }
    
    
        @Override
    public String toString () {//to String permet de renvoyer à l'utilisateur un résultat de manière "claire" les caractéristiques de l'arme
    return "Guerrier{"+ "Nom : "+ Nom_perso+ "    A cheval ? : "+ Cheval + "     Points de vie = "+ Life+ "}"  ;
    }
}
