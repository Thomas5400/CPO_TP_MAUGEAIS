/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_maugeais;

/**
 *
 * @author thoma
 */
public class Voiture {
    
    String Modele;
    String Marque;
    int PuissanceCV;
    
    public Voiture(String un_modele, String une_marque, int puissance){
        Modele= un_modele;
        Marque= une_marque;
        PuissanceCV= puissance;
    }  
    @Override
    public String toString () {
    return "Marque : "+ Marque+ "    Modele : "+ Modele+ "    Puissance : "+ PuissanceCV+ " chevaux";
}

}
