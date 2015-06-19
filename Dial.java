/**
 * Created by panasyuk on 18.06.2015.
 */
public class Dial {
    private Customer customer;
    private TypePoduct tp;
    private int number;
    private int numberDay;
    private Shop a;

    public Dial(int numberDay, Customer customer, TypePoduct tp, int number, Shop a) {
        this.customer = customer;
        this.number = number;
        this.numberDay = numberDay;
        this.tp = tp;
        this.a = a;
        baseDial();

    }

    public void baseDial() {

        Prodact[] stock = a.getStock();
        for (int i = 0; i < stock.length; i++) {
            if (tp == stock[i].getName()) {
                stock[i].setInStock(stock[i].getInStock() - number);
                stock[i].setSale(stock[i].getSale() + number);
            }


        }
        Service.printStock(stock);
    }

    public Shop getA() {
        return a;
    }
}
