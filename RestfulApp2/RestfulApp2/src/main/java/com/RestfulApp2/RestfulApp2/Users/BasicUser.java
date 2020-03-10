package com.RestfulApp2.RestfulApp2.Users;

public class BasicUser {
    private String name;
    private Integer id;

    BasicUser( String name,int id){
        this.name=name;
        this.id=id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "BasicUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
