/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelLayer;

import java.io.Serializable;

/**
 *
 * @author Joel
 */
public class Emitter implements Serializable {
    private int emitter;

    public int getEmitter() {
        return emitter;
    }

    public void setEmitter(int emitter) {
        this.emitter = emitter;
    }

    public Emitter(int emitter) {
        this.emitter = emitter;
    }
}
