using System;
class Employee
{
    public string firstName;
    public string lastName;
    public string address;
    public long sin;
    public double salary;

    public Employee(string firstName,string lastName,string address,long sin,double salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.sin = sin;
        this.salary = salary;
    }

    public override string ToString()
    {
        return "Employee has: first name is " + firstName + ", last name is " + lastName + ", address is " + address + ", sin is " + sin + ", salary is " + salary;
    }
    public double CalculateBonus(double percentage)
    {
        return salary *(percentage/100);
    }
}