package Cafe;

import java.util.Scanner;

public class Tenth extends Barista {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter number of orders:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        Tenth[] arr = new Tenth[num];
        for (int i = 0; i < num; i++) {
            arr[i] = new Tenth();
            arr[i].ordertaken(i);
            arr[i].paymentinitiated();
            arr[i].paymentcompleted();
            arr[i].orderpreparing();
            arr[i].ordercompleted();
        }
    }
}



