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
public interface Bill {

    public void setVat(float vat);

    public void setTotalPrice(float totalPrice);

    public void setSellingDate(Date sellingDate);
}
