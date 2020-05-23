using System;
using System.Diagnostics;

namespace Student
{
    class Students
    {
        public String name= "James Aderson";
        public int age=27;

        public Students(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        public void display()
        {
            Console.WriteLine("Student name :"+name);
            Console.WriteLine("Student age :"+ age);
        }
        static void Main(string[] args)
        {
            Students student = new Students("Harry", 34);
            student.display();
        }
    }
}
