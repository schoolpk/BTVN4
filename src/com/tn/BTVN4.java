package com.tn;

import com.tn.TD.Person;

import java.util.Scanner;

public class BTVN4 {
    public static void main(String[] args) {
        Person person1 = new Person();
        Scanner sc = new Scanner(System.in);
//        System.out.println("inputInfo1 :");
//        String Info1 = sc.nextLine();
//        person1.setName(Info1);
//
//        System.out.println("inputInfo2 :");
//        String Info2 = sc.nextLine();
//        person1.setSex(Info2);
//
//        System.out.println("inputInfo3 :");
//        String Info3 = sc.nextLine();
//        person1.setAddress(Info3);
//
//        System.out.println("inputInfo4 :");
//        sc = new Scanner(System.in);
//        int Info4 = sc.nextInt();
//        person1.setDate(Info4);
//
//
//        System.out.println("showInfo : ");
//        System.out.println("Name : " + person1.getName());
//        System.out.println("Sex : " + person1.getSex());
//        System.out.println("Address : " + person1.getAddress());
//        System.out.println("Date : " + person1.getDate());

        System.out.println("inputInfo : ");
        person1.name = sc.nextLine();
        person1.sex = sc.nextLine();
        person1.address = sc.nextLine();
        person1.date = sc.nextInt();


        System.out.println("showInfo : ");
        person1.showInfo();
    }
}
