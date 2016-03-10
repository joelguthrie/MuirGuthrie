/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelLayer;

import java.io.Serializable;

/**
 *
 * @author MIc
 */
public class Game implements Serializable{
    
    //varables
    private double totalTime;

    private Spaceship spaceship;
    private Emitter emitter;
    private Body body;
    private Crystal crystal;
    private Hilt hilt;


            
    public Game(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }
        public Spaceship getSpaceship() {
        return spaceship;
    }

    public void setSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
        
    } public Game(Emitter emitter, Body body, Crystal crystal, Hilt hilt) {
        this.emitter = emitter;
        this.body = body;
        this.crystal = crystal;
        this.hilt = hilt;
    }

    public Emitter getEmitter() {
        return emitter;
    }

    public Body getBody() {
        return body;
    }

    public Crystal getCrystal() {
        return crystal;
    }

    public Hilt getHilt() {
        return hilt;
    }
    
}
