/**
 * Created by panasyuk on 18.06.2015.
 */
public class Customer {
    private String name;
    private int old;
    private String sex;
    private int personalDiscount;
    private Prodact[] prodacts;
   //private int personalID;


    public Customer(){

    }

    public Customer(String name, int old, int personalDiscount, String sex) {
        //this(prodacts)
        this.name = name;
        this.old = old;
        this.personalDiscount = personalDiscount;
        //this.personalID = personalID;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public int getPersonalDiscount() {
        return personalDiscount;
    }

    public void setPersonalDiscount(int personalDiscount) {
        this.personalDiscount = personalDiscount;
    }

//    public int getPersonalID() {
//        return personalID;
//    }
//
//    public void setPersonalID(int personalID) {
//        this.personalID = personalID;
//    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
