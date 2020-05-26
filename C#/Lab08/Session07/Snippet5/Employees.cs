using System;

namespace Snippet5
{
    class Employees
    {
        int _empId = 1;
        string _empName = "James Anderson";
        int _age = 25;
        public void Display() { 
            Console.WriteLine("Employee ID: " +_empId);
            Console.WriteLine("Employee Name: " +_empName);
        }

    }
}
