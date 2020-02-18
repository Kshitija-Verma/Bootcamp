import javax.swing.*;
import java.util.Scanner;

public class Nineth {
    enum House {
        A(1000),
        B(2000),
        C(3000),
        D(4000);

        public final int price;
        char ch;
private  House(int price){
    this.price = price;
}
public int getprice(){
    return price;
}
    }
    public static void main(String[] args) {

        House h = House.A;
        System.out.println("The value of A : " + h.getprice());
        House h1 = House.B;
        System.out.println("The value of B : " + h1.getprice());
        House h2 = House.C;
        System.out.println("The value of C : " + h2.getprice());
        House h3 = House.D;
        System.out.println("The value of D : " + h3.getprice());
    }
}
