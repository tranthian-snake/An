/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol01;

/**
 *
 * @author Tran Thi An
 */
public class testInvoiceItem {
    public static void main(String[] args) {
        Sol01.InvoiceItem i1=new Sol01.InvoiceItem("Q1576", "Computer", 10, 20.5);
        System.out.println(i1.toString());
        
        i1.setQty(12);
        System.out.println("Total= "+i1.getTotal());
        
    }
}
