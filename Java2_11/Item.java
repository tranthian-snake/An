package Java2_11;

public class Item {
    private String product_id;
    private String product_name;
    private double price;
    private int qty;
    private int discount;

    public Item(String product_id, String product_name, double price, int qty, int discount){
        this.product_id= product_id;
        this.product_name= product_name;
        this.price= price;
        this.qty= qty;
        this.discount= discount;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public int getQty() {
        return qty;
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item[" +
                "product_id='" + product_id + '\'' +
                ", product_name='" + product_name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", discount=" + discount +
                ']';
    }
}
