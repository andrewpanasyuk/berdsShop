/**
 * Created by panasyuk on 18.06.2015.
 */
public class Service {
    public static void printStock(Prodact[] stock) {
        System.out.printf("%-20s%-10s%-10s%-10s%-10s%n", "Name", "Item", "Price", "InStock", "Sale");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < stock.length; i++) {
            //System.out.printf("| " + "\t" + "%10s%",stock[i].getName() + "\t"+ "| " + "%10s",stock[i].getItem() + "\t" + "%10s%n",stock[i].getPrice() + "\t" + stock[i].getInStock()+ "\t" + stock[i].getSale() + " |");
            System.out.printf("%-20s%-10s%-10s%-10s%-10s%n",stock[i].getName(), stock[i].getItem(), stock[i].getPrice(), stock[i].getInStock(), stock[i].getSale());
        }
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-20s%-10s%-10s%-10s%-10s%n", "Total:");
        int sum = 0;
        for (int i = 0; i<stock.length; i++){
            sum += stock[i].getInStock();
        }
        System.out.print(" " + sum + " | ");
        double inSum = 0.0;
        for (int i = 0; i<stock.length; i++){
            inSum += (stock[i].getPrice() * stock[i].getInStock());
        }
        System.out.print(" " + inSum + " | ");
        double outSum = 0.0;
        for (int i = 0; i<stock.length; i++){
            outSum += (stock[i].getPrice() * stock[i].getSale());
        }
        System.out.println(" " + outSum + " | ");
        System.out.println("|==========================================|");
        System.out.println("");
    }

public  static void priceName(Prodact[]stock) {
    for (int i = 0; i<stock.length; i++) {
        System.out.println("| " + stock[i].getName() + " - " + stock[i].getPrice() + "; (in stock - " + stock[i].getInStock() + " pcs.) |");
    }
}
}


