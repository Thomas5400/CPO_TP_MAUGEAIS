/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_maugeais;

/**
 *
 * @author thoma
 */
public class Convertisseur {//nouvelle classe
    int nbConversions;// On rentre les différents attributs, un pour chaque conversion à effectuer
    double K_C ;
    double C_K;
    double C_F;
    double F_C;
    double K_F;
    double F_K;
    
    public Convertisseur(){//constructeur pour initialiser le nombre de conversion à 0
        nbConversions = 0;
    }
    public double CelsiusversKelvin(double D_Celsius) {
        C_K = D_Celsius+237.15;//calcul de la conversion
        nbConversions += 1 ;//on rajoute +1 au nombre de conversion . Cette action se repetera pour toutes les conversions
        return C_K;// on retourne la valeur finale qui est la température convertie dans la nouvelle unité voulue
    }
    // on répète cela pour toutes les conversion que l'on souhaite effectuer
    public double KelvinversCelsius(double D_Kelvin) {
        K_C = D_Kelvin -273.15;
        nbConversions += 1 ;
        return  K_C;
    }
    
    public double FarenheitversCelsius(double D_Farenheit) {
        F_C = (D_Farenheit-32) /1.8;
        nbConversions += 1 ;
        return F_C;
    }
    
    public double CelsiusversFarenheit(double D_Celsius) {
        C_F = D_Celsius*1.8 +32;
        nbConversions += 1 ;
        return C_F;
    }
    
    public double FarenheitversKelvin(double D_Farenheit) {
        F_K = (D_Farenheit-32)/1.8 + 273.15;
        nbConversions += 1 ;
        return F_K;
    }
    
    public double KelvinversFarenheit(double D_Kelvin) {
        K_F = (D_Kelvin - 273.15)*1.8 +32;
        nbConversions += 1 ;
        return K_F;
    }
    
    @Override// Cela permet de bien afficher les résultats des conversions
    public String toString() {
    return "nb de conversions  : "+ nbConversions;// on affiche de la sorte a avoir du texte puis la valeur calculée pour le nombre de conversion effectue par un objet 
    }

    
    
}
