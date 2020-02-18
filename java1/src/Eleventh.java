 class Bank{
  public  int rateofinterest;
  public  String branchname;
   public String Ifsccode;
    void getDetails(){
        System.out.println("rate of interest is : " + rateofinterest);
        System.out.println("Branch name is : " + branchname);
        System.out.println("IFSC code is: " + Ifsccode);
    }

}
 class Sbi extends Bank{
   Sbi() {
         branchname = "Modinagar";
         rateofinterest = 8;
         Ifsccode = "SBI0323000";
     }



}
 class Boi extends Bank{
   Boi()

     {
         rateofinterest = 7;
         Ifsccode = "BOI032300";
         branchname = "Delhi";
     }

}
 class Icici extends Bank{
    Icici() {
        rateofinterest = 9;
        Ifsccode = "Icici760010";
        branchname = "Ghaziabad";
    }

}
public class Eleventh {
    public static void main(String[] args) {
        Boi b = new Boi();

        b.getDetails();
        Sbi s = new Sbi();
        s.getDetails();
        Icici i = new Icici();
        i.getDetails();
    }

}
