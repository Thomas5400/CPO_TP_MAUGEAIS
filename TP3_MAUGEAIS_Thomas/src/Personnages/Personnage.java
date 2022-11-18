/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public class Personnage {
    String Nom_perso;//attributs
    int Life;
    
    public Personnage(String NomduPerso, int Vie){//constructeur personnage
        Nom_perso = NomduPerso;
        Life = Vie;
    }
    @Override
    public String toString () {//to String permet de renvoyer à l'utilisateur un résultat de manière "claire" les caractéristiques du perso
    return "Nom du personnage :"+ Nom_perso+ "\nPoints de vie : "+ Life;
    }
    
    public ArrayList<Arme> Inventaire_Armes = new ArrayList<Arme>();//tableau dynamique avec l'inventaire de l'arme
    
    public void setArme(Arme weapon){//Methode pour ajouter une arme à l'inventaire
        if (Inventaire_Armes.size()<=5){
            Inventaire_Armes.add(weapon);
        }
        else{
            System.out.println("Ajout impossible, inventaire plein");//si inventaire plein alors impossible d'ajouter un nouvel item
        }
        
        }
    
    Arme Arme_Portée=null;//Initialisation de  l'arme portée
    
}

