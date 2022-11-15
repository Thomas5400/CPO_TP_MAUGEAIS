/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_maugeais_thomas;

/**
 *
 * @author thoma
 */
public class Baton extends Arme {
    private int age;
    
    public Baton (int age,String N, int ATT){
        super (N,ATT);
        if (age>=0&age<100){
            this.age=age;
        }
        else{
            this.age=1;
        }
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age ){
        if (age<=100&age>=0){
            this.age=age;
        }
    }
    @Override
    public String toString () {//to String permet de renvoyer à l'utilisateur un résultat de manière "claire" les caractéristiques de l'arme
          return "Baton{"+ "Nom = "+ Nom+ "    Attaque = "+ Attaque + "     Age = "+ age+ "}"  ;
    }
}  

    

