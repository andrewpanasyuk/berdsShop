/**
 * Created by panasyuk on 18.06.2015.
 */
public class Data {
    //public Prodact prod1 = new Prodact("Eagle", "pcs", 12.50, 10);

    public static Prodact productData(int i) {
        Prodact[]prod = new Prodact[10];
        prod[0] = new Prodact(TypePoduct.EAGL, "pcs.", 12.50, 10, 0);
        prod[1] = new Prodact(TypePoduct.GOOS, "pcs.", 13.50, 11, 0);
        prod[2] = new Prodact(TypePoduct.TURKEY, "pcs.", 14.50, 12, 0);
//        prod[3] = new Prodact("Eagle3", "pcs", 15.50, 13);
//        prod[4] = new Prodact("Eagle4", "pcs", 16.50, 12);
//        prod[5] = new Prodact("Eagle5", "pcs", 17.50, 8);
//        prod[6] = new Prodact("Eagle6", "pcs", 18.50, 7);
//        prod[7] = new Prodact("Eagle7", "pcs", 19.50, 9);
//        prod[8] = new Prodact("Eagle8", "pcs", 20.50, 5);
//        prod[9] = new Prodact("Eagle9", "pcs", 21.50, 4);
        return prod[i];

    }
    public  static Customer[] customer(){
        Customer[]customers = new Customer[5];
        customers[0] = new Customer("Ivanov", 25, 0, "m");
        customers[1] = new Customer("Petrova", 18, 0, "f");
        customers[2] = new Customer("Lagutkin", 35, 10, "m");
        customers[3] = new Customer("Shevchenko", 45, 30, "m");
        customers[4] = new Customer("Pupkina", 22, 5, "f");
        return customers;
    }
}
