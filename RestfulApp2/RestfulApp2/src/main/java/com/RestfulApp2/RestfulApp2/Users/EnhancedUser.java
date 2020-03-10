package com.RestfulApp2.RestfulApp2.Users;

//import io.swagger.models.auth.In;

public class EnhancedUser {
    private String name;
    private Integer id;
    private int age;
    private float salary;
    private String city;
    private float bonus;
    private int increment;


    EnhancedUser(String name,int id,int age,String city,float salary,int increment){
        this.name=name;
        this.age=age;
        this.id=id;
        this.city=city;
        this.salary=salary;
        this.increment=increment;
        setBonus(increment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public float getBonus() {
        return bonus;
    }

    public float getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public void setBonus(int increment) {
        this.bonus = salary+((salary*increment)/100);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EnhancedUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", bonus=" + bonus +
                '}';
    }
}
