package com.tothenew.bootcamp.demo;
interface Worker{
    public void doWork();
}

public class LooseCoupling {
    public static void main(String[] args) {

        new Manager1(new lazyWorker1()).manageWork();
        new Manager1(new ExcellentWorker1()).manageWork();
        new Manager1(new ExtraOrdinaryWorker1()).manageWork();


    }
}
class Manager1{
    private Worker worker;

         public Manager1(Worker worker){
            this.worker=worker;
        }
        public void manageWork(){
            worker.doWork();
        }


}
 class lazyWorker1 implements Worker{
    public void doWork(){
        System.out.println("Lazy worker is working");
    }

}

class ExcellentWorker1 implements Worker{
    public void doWork(){
        System.out.println("Excellent worker is working");
    }
}

class ExtraOrdinaryWorker1 implements Worker {
    public void doWork(){
        System.out.println("Extra Ordinary worker is working");
    }
}
