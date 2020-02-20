package Cafe;

import java.util.Scanner;

public class Cashier extends Customer   {


    void ordertaken(int i){
        orderid=i+1;
        drinkname = Orderdrink();
        payment = false;
        intimation = false;
        System.out.println("Order name : "+drinkname+" Order id : "+orderid);


        }

    void paymentcompleted(){
        if(payment==true){
            System.out.println("Order confirmed");
        }
    }
    void intimation(){
        intimation=false;
    }
}
