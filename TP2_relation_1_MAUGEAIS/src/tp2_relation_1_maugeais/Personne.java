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
    
    String nom;        //Création des attributs
    String prenom;
    int nbVoitures ;
    Voiture [] liste_voitures ;
    
    public Personne(String un_nom, String un_prenom){  // Construction de "Personne" qui prends donc les variables d'entrée
        nom = un_nom;
        prenom= un_prenom;
        nbVoitures = 0;// au début la personne ne possède aucune voitures
        liste_voitures = new Voiture [3] ; // le tableau contenant les voitures possédées par la personne
        
    }
    
    public boolean ajoutervoiture(Voiture voiture_a_ajouter){ // création méthode pour automatisé les liens d'appartenances et de possesion 
        if (voiture_a_ajouter.Proprietaire != null){ // si la voiture appartient déjà à quelqu'un on ne peut pas l'ajouter
            return false;
        }
        else{
            if (nbVoitures >= 3){ // si la personne possède déjà + de 3 voitures il ne peut plus en posséder davantage
                return false;
            }
            else{
                liste_voitures[nbVoitures]=voiture_a_ajouter;// sinon on peut donc bien ajouter la voiture
                nbVoitures+=1;//le proprio possède donc 1 voiture en plus 
                voiture_a_ajouter.Proprietaire = this ;//La voiture en question a un nouveau propriétaire XXXXX: celui que l'on nomme en appellant cette méthode (XXXXX.ajoutervoiture)
                return true;//l'ajout de la voitures s'est donc bien déroulé on renvoit true
            }
        }
        
    }
            
            
    @Override
    public String toString () {
    return "Prenom : "+ prenom+ "     Nom : "+ nom;
    }
}
