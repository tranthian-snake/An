/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex01;

/**
 *
 * @author Tran Thi An
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int qty;
    private String description;
    
    public Product(int id, String name, double price, int qty, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.description = description;
    }
    public Product(){
        id = 79;
        name = "pen";
        price = 7.4;
        qty = 3;
        description = "blue";
    }
    public Product(int id, String name, double price, int qty){
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double setPrice(double price){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public String getDescription(){
        return description;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", qty=" + qty + ", description=" + description + '}';
    }
    
    
}
