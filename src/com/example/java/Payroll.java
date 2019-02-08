package com.example.java;

public class Payroll {
    public static void main(String[] args) {
        Address a1 = new Address("123", "East Bend Court",
                "Baltimore","MD","21244");

        Address a2 = new Address("123", "West Bend Court",
                "Columbia","MD","21245");

        Address a3 = null;


       Employee ee1 = new Employee("Simon","Sharma",
                "301-200-5543",a1,955623,
                003,"Pilot",500000.00);


        Employee ee2 = new Employee("Sejal","Paudel",
                "301-200-5546",a2,955623,
                003,"Pilot",55000.00);

        Employee ee3 = new Employee("Diwa","Pathak",
                "301-200-5546",a3,955623,
                001,"Writer",55000.00);







        ee1.printEmployee();
        System.out.println("----------------------------------------");

        ee2.printEmployee();
        System.out.println("----------------------------------------");

        ee2.setTitle("producer");
        ee2.setSalary(400);
        ee2.printEmployee();
        System.out.println("----------------------------------------");
        ee3.printEmployee();
        System.out.println("----------------------------------------");



        if(ee1.compareTo(ee2) == 0)
            System.out.println("\nEqual salaries");
        else if (ee1.compareTo(ee2) <0)
            System.out.println("\n" + ee2.getName()+ " makes more than "+ ee1.getName());
        else
            System.out.println("\n" + ee1.getName()+ " makes more than "+ ee2.getName()+"\n");
        System.out.println("----------------------------------------");





        System.out.println("Addresses in sorted order: \n");
        if (a1.compareTo(a2)==0 || a1.compareTo(a2)<0)

        {
            System.out.println(a1);
            System.out.println(a2);
        }
        else
        {
            System.out.println(a2);
            System.out.println(a1);
        }
    }
}
