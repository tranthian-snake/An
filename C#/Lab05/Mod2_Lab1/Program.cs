using System;
 class Program
 {
    static void Main(string[] args)
    {
        //var employee1 = new Employee("Libby", 2000);
        var employee1 = new Technicalemployee("Libby");
        var employee2 = new Technicalemployee("Zaynah");
        var employee3 = new BusnessEmployee("Winter");

        Console.WriteLine(employee1.employeeStatus() + "..." + employee2.employeeStatus() + "..." + employee3.employeeStatus());
    }
 }