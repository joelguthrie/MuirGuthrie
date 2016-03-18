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
    
    private Map[] planets;
    private Map map;
    private Player player;

    private ItemInvetoryModel[] inventory;
            
    public Game(double totalTime) {
        this.totalTime = totalTime;
    }

    public Game() {
        
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

    public ItemInvetoryModel[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemInvetoryModel[] inventory) {
        this.inventory = inventory;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map[] getPlanets() {
        return planets;
    }

    public void setPlanets(Map[] planets) {
        this.planets = planets;
    }
    
}
