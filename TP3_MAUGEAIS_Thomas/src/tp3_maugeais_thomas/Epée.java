/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_maugeais_thomas;

/**
 *
 * @author thoma
 */
public class Epée extends Arme {
    private int finesse;
    
    public Epée (int finesse,String N, int ATT){
        super (N,ATT);
        if (finesse>=0&finesse<100){
            this.finesse=finesse;
        }
        else{
            this.finesse=1;
        }
    }
    
    public int getFinesse(){
        return finesse;
    }
    
    public void setFinesse(int finesse ){
        if (finesse<=100&finesse>=0){
            this.finesse=finesse;
        }
    }
}
