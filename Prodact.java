/**
 * Created by panasyuk on 18.06.2015.
 */
public class Prodact {
    private TypePoduct name;
    private String item;
    private double price;
    private int inStock;
    private int sale;
    private Prodact[] stock;

    public Prodact(){

    }
    public Prodact(TypePoduct name, String item, double price, int inStock, int sale){
        this.name = name;
        this.item = item;
        this.price = price;
        this.inStock = inStock;
        this.sale = sale;

    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public Prodact(Prodact[] stock){
        this.stock = getStock();
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public TypePoduct getName() {
        return name;
    }

    public void setName(TypePoduct name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Prodact[] getStock() {
        return stock;
    }

    public void setStock(Prodact[] stock) {
        this.stock = stock;
    }
}
