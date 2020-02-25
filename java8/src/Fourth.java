@FunctionalInterface
interface EmployeeDetails{
    Employee details(String name,int age,String city);
}

class Employee{
    String name;
    int age;
    String city;
    Employee(String name , int age,String city){
        this.name = name;
        this.age = age;
        this.city = city;
        printDetails(name,age,city);
    }
    void printDetails(String name,int age,String city){
        System.out.println(name+" " + age +" " +city);
    }

}
public class Fourth {
    public static void main(String[] args) {

EmployeeDetails empdetails = Employee::new;
empdetails.details("Kshitija",21,"Modinagar");


    }
}
