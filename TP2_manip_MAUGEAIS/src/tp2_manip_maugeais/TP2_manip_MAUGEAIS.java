/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_maugeais;

/**
 *
 * @author thoma
 */
public class TP2_manip_MAUGEAIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tartiflette assiette1 = new Tartiflette(500) ;// initialisation des assietes
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
//affichage des calories de assiette 3 et 2.


        assiette2.nbCalories += 150;
        
        System.out.println("\n Ajout de 150 calories à assiette 2 \n \n") ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ;
// Les calories changent bien pour assiette 3 aussi.


        int v= assiette1.nbCalories; // inversion de assiette 1 et 2 
        assiette1.nbCalories = assiette2.nbCalories;
        assiette2.nbCalories = v;
        
        System.out.println("\n Inversion de assiettes 1 et 2\n \n") ;
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
    }
    
}
