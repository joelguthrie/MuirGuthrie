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
public class InventoryItem implements Serializable{
    
    //varables
    private ItemType type;
    private int quantity;

    public InventoryItem() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDescription(String emittter) {
     
    }

    public void setQuantityInStock(int i) {
       
    }

    public void setRequiredAmount(int i) {
      
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
    
}
