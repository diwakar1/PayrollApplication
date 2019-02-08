package com.example.java;

public class Employee implements Comparable{

    //instance data

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;
    private int employeeID;
    private int DeptID;
    private String title;
    private double salary;

    //constructor
    public Employee(String firstName, String lastName, String phoneNumber,
                    Address address,
                    int emplouyeeID, int deptID, String title, double salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.employeeID = emplouyeeID;
        DeptID = deptID;
        this.title = title;
        this.salary = salary;
    }


    //setters and getters

    public String getName()
    {
        return firstName+ " "+ lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }


    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEmployeeID()
    {
        return employeeID;
    }

    public void setEmployeeID(int employeeID)
    {
        this.employeeID = employeeID;
    }

    public int getDeptID()
    {
        return DeptID;
    }

    public void setDeptID(int deptID)
    {
        DeptID = deptID;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        if(salary <=1000)
            System.out.println("This is error, salary was not updated");
        else
            this.salary = salary;
    }

    //print all information

    public void printEmployee()
    {
        if (address==null)
        {
            System.out.println(getName() + "\nTitle: " + title +
                    "\nEmployee ID: " + employeeID +
                    "\nDepartment: " + getDeptname(getDeptID()));
            System.out.printf("salary: $%8.2f", getSalary());
            System.out.println();
        }
        else
        {
            System.out.println(getName() + "\nTitle: " + title +
                    "\nAddress: " + address.toString() + "\nEmployee ID: " + employeeID +
                    "\nDepartment: " + getDeptname(getDeptID()));
            System.out.printf("salary: $%8.2f", getSalary());
            System.out.println();
        }
    }



    // get department name  according to department id
    public String getDeptname(int value)
    {
        switch(value)
        {
            case 001:
                return "Human Resources";
            case 002:
                return "Staff";
            case 003:
                return "Faculty";
            case 004:
                return "Administration";
            case 005:
                return "Other";

        }
        return String.valueOf(value);
    }

    //compares salary of one employee to another employee
    @Override
   public int compareTo(Object t){
        Employee emp = (Employee)t;
        if(this.salary>emp.salary)
        {
            return 1;
        }
        else if (this.salary==emp.salary)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }

}
