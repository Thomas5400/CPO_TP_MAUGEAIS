/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_maugeais;

/**
 *
 * @author thoma
 */
public class TP2_Bieres_MAUGEAIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0,"Dubuisson") ;//on crée des bieres grace au constructeur
        uneBiere.lireEtiquette();//et on affiche leur etiquette grace a la methode lire etiquette
        BouteilleBiere deuxièmeBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
        deuxièmeBiere.lireEtiquette();
        BouteilleBiere troisièmeBiere = new BouteilleBiere("Skoll",6.0,"Brasserie Kronenbourg");
        troisièmeBiere.lireEtiquette();
        BouteilleBiere quatrièmeBiere = new BouteilleBiere("Desperados",5.9,"Brasserie Heineken");
        quatrièmeBiere.lireEtiquette();
        BouteilleBiere cinquièmeBiere = new BouteilleBiere("Heineken,",5.0,"Brasserie Heineken");
        cinquièmeBiere.lireEtiquette();
        
        
        System.out.println(cinquièmeBiere.Décapsuler());// 1er test pour cette bière
        System.out.println(cinquièmeBiere.Décapsuler());// 2eme test pour cette bière
        
        
        
        System.out.println(uneBiere) ;// on affiche l'etat de cette biere ouverte ou non 
        
        BouteilleBiere sixBiere = new BouteilleBiere("Grimbergen,",6.0,"Abbaye de Grimbergen");
        sixBiere.lireEtiquette(); //création d'une dernière bierre et on lit son etiquette
        
        cinquièmeBiere.Décapsuler();// on decapsule ces bieres 
        deuxièmeBiere.Décapsuler();
        
        // Test Question 14
        System.out.println("\n RESULTATS QUESTION 14\n ");
        
        System.out.println(deuxièmeBiere) ;
        System.out.println(troisièmeBiere) ;
        System.out.println(quatrièmeBiere) ;
        System.out.println(cinquièmeBiere) ;
        
        
        
        


       
        


    }
    
}
