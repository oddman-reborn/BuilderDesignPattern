/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import Design.BillInfo;
import Design.BuilderClass;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Monirul Islam
 */
public class BuilderDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BuilderClass build = new BuilderClass();

        BillInfo bill = build.getBill();

        System.out.println("Product Name : ");
        bill.setProductName(input.nextLine());

        System.out.println("Product Quantity : ");
        bill.setProductQty(input.nextInt());

        System.out.println("Product Price : ");
        bill.setProductPrice(input.nextFloat());

        System.out.println("VAT(%) : ");
        bill.setVat(input.nextFloat());
        bill.setTotalPrice(bill.getProductInfo().getPrice());
        bill.setSellingDate(new Date());

        System.out.println(bill.getSellingDate());
        String heading = "---------------Bill Info---------------";

        System.out.println(heading);

        String productData = "Product" + bill.getProductInfo().getName();
        int dataLength = productData.length();
        int headLength = heading.length();
        String space = putSpace(headLength - dataLength);
        System.out.println("Product" + space + bill.getProductInfo().getName());

        productData = "Price" + bill.getProductInfo().getPrice();
        dataLength = productData.length();
        headLength = heading.length();
        space = putSpace(headLength - dataLength);
        System.out.println("Price" + space + bill.getProductInfo().getPrice());

        productData = "Quantity" + bill.getProductInfo().getQty();
        dataLength = productData.length();
        headLength = heading.length();
        space = putSpace(headLength - dataLength);
        System.out.println("Quantity" + space + bill.getProductInfo().getQty());

        productData = "VAT" + (bill.getTotalPrice()-bill.getProductInfo().getPrice());
        dataLength = productData.length();
        headLength = heading.length();
        space = putSpace(headLength - dataLength);
        System.out.println("VAT" + space + (bill.getTotalPrice()-bill.getProductInfo().getPrice()));

        productData = "Total Price" + bill.getTotalPrice();
        dataLength = productData.length();
        headLength = heading.length();
        space = putSpace(headLength - dataLength);
        System.out.println("Total Price" + space + bill.getTotalPrice());

        System.out.println("");
    }

    public static String putSpace(int spaceAmount) {
        String s = "";
        for (int i = 1; i <= spaceAmount; i++) {
            s = s + ".";
        }
        return s;
    }

}
