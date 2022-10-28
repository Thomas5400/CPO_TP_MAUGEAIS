/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_maugeais;

/**
 *
 * @author thoma
 */
public class TP2_relation_1_MAUGEAIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Voiture uneClio = new Voiture ("Clio", "Renault",5 ) ;  // Initialisation avec le constructeur des voitures et propriétaires
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
// Le code fonctionne bien
        
    bob.liste_voitures[0] = uneClio ;// 1ère voiture de Bob
    bob.nbVoitures += 1 ;
    uneClio.Proprietaire = bob ;
    
    bob.liste_voitures[1] = une2008 ; // Deuxième voiture pour Bob
    bob.nbVoitures += 1 ;
    une2008.Proprietaire = bob ;
    System.out.println("\nla premiere voiture de Bob est   " +bob.liste_voitures[0] ) ;
    System.out.println("la deuxieme voiture de Bob est   " +bob.liste_voitures[1] ) ;

    reno.liste_voitures[0] = uneMicra ;
    reno.nbVoitures +=1 ;
    uneMicra.Proprietaire = reno ;
    
    reno.liste_voitures[1] = uneAutreClio ; // ajout de 2 voitures à Reno
    reno.nbVoitures +=1 ;
    uneAutreClio.Proprietaire = reno ;
    System.out.println("\nla premiere voiture de Reno est   " +bob.liste_voitures[0] ) ;
    System.out.println("la deuxieme voiture de Reno est   " +bob.liste_voitures[1] ) ;   
    }
    
}
