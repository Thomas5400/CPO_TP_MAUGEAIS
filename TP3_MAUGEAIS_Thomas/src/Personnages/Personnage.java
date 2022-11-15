/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author thoma
 */
public class Personnage {
    String Nom_perso;
    int Life;
    
    public Personnage(String NomduPerso, int Vie){
        Nom_perso = NomduPerso;
        Life = Vie;
    }
    @Override
    public String toString () {//to String permet de renvoyer à l'utilisateur un résultat de manière "claire" les caractéristiques du perso
    return "Nom du personnage :"+ Nom_perso+ "\nPoints de vie : "+ Life;
    }
}
