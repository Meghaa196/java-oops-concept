package com.demo;
class Member
{
    private String name;
    private int age;
    private long phoneNumber;
    private String address;
    private double salary;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Member(String name,int age,long phoneNumber,  String address,double salary)
    {
        this.name=name;
        this.age=age;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
    }
    
    public void printSalary()
    {
        System.out.println(this.salary);
    }
}

class Employee extends Member
{  
    private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    Employee(String name, int age, long phoneNumber, String address, double salary,String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization=specialization;
    }
    
}


class Manager extends Member
{
  private String department;
  
    public String getDepartment() {
    return department;
}

public void setDepartment(String department) {
    this.department = department;
}

    Manager(String name, int age, long phoneNumber, String address, double salary,String department) {
        super(name, age, phoneNumber, address, salary);
        this.department=department;
    }
    
}


public class Test {
    
    public static void main(String args[])
    {
        Employee e=new Employee("Ranjan",26,98765434,"Kanpur",34000,"Accounts");
        Manager m=new Manager("Anil",37,98272772,"Patna",45000,"Retail");
        
        System.out.println(e.getName()+ " "+e.getAddress()+" "+e.getPhoneNumber()+" "+e.getSalary()+" "+e.getSpecialization());
        System.out.println(m.getName()+ " "+m.getAddress()+" "+m.getPhoneNumber()+" "+m.getSalary()+" "+m.getDepartment());

    }

}
