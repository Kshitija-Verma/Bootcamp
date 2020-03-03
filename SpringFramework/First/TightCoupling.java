package com.tothenew.bootcamp.demo;

public class TightCoupling {
    public static void main(String[] args) {
        new Manager(new lazyWorker(),new ExcellentWorker(),new ExtraOrdinaryWorker()).manageWork();

    }
}

class Manager{
    private lazyWorker lw;
    private ExcellentWorker ew;
    private ExtraOrdinaryWorker eow;
    public Manager(lazyWorker lw,ExcellentWorker ew,ExtraOrdinaryWorker eow){
       this.lw =lw;
       this.ew = ew;
       this.eow = eow;
    }


    public void manageWork(){
        lw.doWork();
        ew.doWork();
        eow.doWork();

    }

}
class lazyWorker {
    public void doWork(){
        System.out.println("lazy worker is working");
    }
}

class ExcellentWorker {
    public void doWork(){
        System.out.println("Excellent worker is working");
    }
}

class ExtraOrdinaryWorker {
    public void doWork(){
        System.out.println("Extra Ordinary worker is working");
    }
}