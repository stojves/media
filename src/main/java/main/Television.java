/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author Vesna
 */
public class Television {
    int volume = 0;
    int currentProgram = 1;
    boolean turnOn;

    public void setVolume(int vv){
        volume = vv;
    }

    public int getVolume(){
        return volume;
    }

    public void setCurrentProgram(int cp){
        currentProgram = cp;
    }
    public int getCurrentProgram(){
        return currentProgram;

    }

}
