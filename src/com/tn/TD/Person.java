package com.tn.TD;

public class Person {
    public String name;

    public String sex;

    public int date;

    public String address;

    public Person() {
    }

    public Person(String name, String sex, int date, String address) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.address = address;
    }

    public void showInfo(){
        System.out.println(name);
        System.out.println(sex);
        System.out.println(address);
        System.out.println(date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
