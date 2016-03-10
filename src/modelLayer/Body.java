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
public class Body implements Serializable{
    private int body;

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public Body(int body) {
        this.body = body;
    }
}
