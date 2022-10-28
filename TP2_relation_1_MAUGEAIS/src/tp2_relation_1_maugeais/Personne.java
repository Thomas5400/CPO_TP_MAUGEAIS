/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_maugeais;

/**
 *
 * @author thoma
 */
public class Personne {
    
    String nom;
    String prenom;
    
    public Personne(String un_nom, String un_prenom){
        nom = un_nom;
        prenom= un_prenom;
        
    }
    
    @Override
    public String toString () {
    return "Prenom : "+ prenom+ "Nom : "+ nom;
    }
}
