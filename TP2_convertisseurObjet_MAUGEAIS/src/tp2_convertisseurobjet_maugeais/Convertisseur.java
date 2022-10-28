/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_maugeais;

/**
 *
 * @author thoma
 */
public class Convertisseur {
    int nbConversions;
    double K_C ;
    double C_K;
    double C_F;
    double F_C;
    double K_F;
    double F_K;
    
    public Convertisseur(){
        nbConversions = 0;
    }
    public double CelsiusversKelvin(double D_Celsius) {
        C_K = D_Celsius+237.15;
        nbConversions += 1 ;
        return C_K;
    }
    
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
    
    @Override
    public String toString() {
    return "nb de conversions  : "+ nbConversions;
    }

    
    
}
