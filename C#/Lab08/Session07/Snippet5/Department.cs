using System;

namespace Snippet5
{
    class Department : Employees
    {
        int _deptId = 501;
        string _deptName = "Sales";
        new void Display()
        {
            base.Display();
            Console.WriteLine("Department ID: " + _deptId);
            Console.WriteLine("Department Name: " + _deptName);
        }
        static void Main(string[] args)
        {
            Department objDepartment = new Department();
            objDepartment.Display();
        }
    }
}
