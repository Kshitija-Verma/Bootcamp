package com.RestfulAssignmentPart1.RestfulAssignment.Employee;

public class EmployeeBean {
    private Integer id;
    private String name;
    private int age;
EmployeeBean(){

}
    EmployeeBean(Integer id , String name , int age){
        this.id=id;
        this.name=name;
        this.age=age;;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age!=0)
            this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
