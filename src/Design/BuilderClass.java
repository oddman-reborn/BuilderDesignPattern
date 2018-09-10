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
public class BuilderClass {
    
    private BillInfo bill;

    public BillInfo getBill() {
        this.bill=new BillInfo();
        return bill;
    }
    
    
}
