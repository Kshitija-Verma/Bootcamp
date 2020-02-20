package Cafe;

public class Barista extends Cashier  {

    void orderpreparing(){
        System.out.println("Order is preparing");
    }
    void ordercompleted(){
        intimation = true;
        ordercollect();

    }
}
