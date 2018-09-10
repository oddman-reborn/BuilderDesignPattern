/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

import java.util.Date;

/**
 *
 * @author Monirul Islam
 */
public class BillInfo implements Bill{
    
    private float vat;
    private float totalPrice;
    private Date sellingDate;
    private ProductInfo productInfo;
    
    public BillInfo()
    {
        this.productInfo=new ProductInfo();
    }
    @Override
    public void setVat(float vat) {
        this.vat = vat;
    }
    
    @Override
    public void setTotalPrice(float price) {
        
        this.totalPrice = price+((vat*price)/100);
    }

    @Override
    public void setSellingDate(Date sellingDate) {
        this.sellingDate = sellingDate;
    }
    
    public void setProductName(String name)
    {
        this.productInfo.setName(name);
    }
    
    public void setProductPrice(float price){
        this.productInfo.setPrice(price);
    }
    
    public void setProductQty(int qty){
        this.productInfo.setQty(qty);
    }
    
    public ProductInfo getProductInfo()
    {
        return this.productInfo;
    }

    public float getVat() {
        return vat;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public Date getSellingDate() {
        return sellingDate;
    }
   
}
