/**
 * Created by panasyuk on 18.06.2015.
 */
public class Shop {
    Prodact[] stock;
    Customer[]clients;
    Dial dial;



    public  Shop(){
        this.stock = makeStock(TypePoduct.values().length);
        this.clients = makeClientBase();



    }
    public void dd(){
        Dial d = new Dial(1, clients[0], TypePoduct.EAGL, 5, this);

    }

    public Customer[] getClients() {
        return clients;
    }

    public void setClients(Customer[] clients) {
        this.clients = clients;
    }

    public Prodact[] makeStock(int number){
    Prodact[]stock = new Prodact[number];
    for (int i = 0; i<stock.length; i++) {
        stock[i] = Data.productData(i);
    }
    return stock;
}

    public Customer[] makeClientBase(){
        clients = Data.customer();
        return clients;
    }

    public void runShop() {

        System.out.println("ok");
    }

    public Prodact[] getStock() {
        return stock;
    }

    public void setStock(Prodact[] stock) {
        this.stock = stock;
    }

}
