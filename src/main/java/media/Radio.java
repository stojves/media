/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package media;

/**
 *
 * @author Vesna
 */
public class Radio {
    double fmFrequency = 91.8;
    double amFrequency = 600;
    char band = 'A';

    public void setFmFrequency(double fm){
        fmFrequency = fm;
    }

    public double getFmFrequency(){
        return fmFrequency;
    }

    public void setAmFrequency(double am){
        amFrequency = am;
    }

    public double getAmFrequency(){
        return amFrequency;
    }

    public void setBand(char bb){
        band = bb;
    }

    public double getBand(){
        return band;
    }

    
}
