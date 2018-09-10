/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

/**
 *
 * @author Monirul Islam
 */
public class ProductInfo implements Product{
    
    private String name;
    private float price;
    private int qty;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(float price) {
        this.price = price*qty;
    }

    @Override
    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    
    
    
}
