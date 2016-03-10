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
public class Hilt implements Serializable{
        private int hilt;

    public int getHilt() {
        return hilt;
    }

    public void setHilt(int hilt) {
        this.hilt = hilt;
    }

    public Hilt(int hilt) {
        this.hilt = hilt;
    }
}
