package Cafe;

import java.util.Scanner;

public class Customer extends Coffeeshop {

    Scanner sc =new Scanner(System.in);
    String Orderdrink() {
        System.out.println("Enter the drink name: 1.Latte 2.Cappuccino 3.Simple coffe 4.Tea");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                drinkname = "Lattee";
                return drinkname;
            case 2:
                drinkname = "Cappuccino";
                return drinkname;
            case 3:
                drinkname = "Simple coffee";
                return drinkname;
            case 4:
                drinkname = "Tea";
                return drinkname;
            default:
                System.out.println("Wrong choice");
                break;

        }
        return drinkname;
    }
        void paymentinitiated(){
            payment=true;

        }

    void ordercollect(){

        if(intimation==true)
        {
            System.out.println("Order is ready!!");
        }
        else
        {
            System.out.println("You have to wait!!");
        }
    }
}
