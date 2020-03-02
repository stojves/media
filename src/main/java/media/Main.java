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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Television t1 = new Television();
        t1.setVolume(23);
        t1.setCurrentProgram(45);
        System.out.println("Jacina zvuka je "+t1.getVolume()+" a kanal je "+t1.getCurrentProgram());
    
        Radio b92 = new Radio();
        b92.setFmFrequency(92.5);
        b92.setAmFrequency(0);
        b92.setBand('F');

        Radio s = new Radio();
        s.setFmFrequency(100.8);
        s.setAmFrequency(0);
        s.setBand('F');

        System.out.println("Radio B92 ima frekvenciju "+b92.getFmFrequency());
        
    }

}
