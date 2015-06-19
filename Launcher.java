/**
 * Created by panasyuk on 18.06.2015.
 */
public class Launcher {
    public static void main(String[] args) {
       Shop shop = new Shop();
        Service.printStock(shop.getStock());
        shop.dd();
        Service.priceName(shop.getStock());



        //shop.makeStock();
//        System.out.println(shop.getStock()[0].getName());
//        System.out.println(shop.getStock()[1].getName());
//        System.out.println(shop.getStock()[2].getName());
//        System.out.println(shop.getClients()[2].getName());

    }


}
