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
public class Baton extends Arme {
    private int age;//on crée la variable age
    
    public Baton (int age,String N, int ATT){//constructeur de l'arme Baton 
        super (N,ATT);
        if (age>=0&age<100){//Condition sur l'age du baton pour le crée
            this.age=age;
        }
        else{
            this.age=1;
        }
    }
    
    public int getAge(){//méthode pour avoir l'age
        return age;
    }
    
    public void setAge(int age ){//méthode pour changer l'age
        if (age<=100&age>=0){
            this.age=age;
        }
    }
    @Override
    public String toString () {//to String permet de renvoyer à l'utilisateur un résultat de manière "claire" les caractéristiques de l'arme
          return "Baton{"+ "Nom = "+ Nom+ "    Attaque = "+ Attaque + "     Age = "+ age+ "}"  ;
    }
}  

    

