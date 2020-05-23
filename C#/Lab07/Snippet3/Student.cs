using System;

namespace Snippet3
{
    class Student
    {
        void printName(String firstName, String lastName)
        {
            Console.WriteLine("firstName= {0}, lastName={1}", firstName, lastName);
        }

        static void Main(string[] args)
        {
            Student student = new Student();
            /*Passing argument by position*/
            student.printName("Henry","Parker");
            /*Passing named argument*/ 
            student.printName(firstName: "Henry", lastName: "Parker");
            student.printName(lastName: "Parker", firstName: "Henry"); 
            /*Passing named argument after positional argument*/ 
            student.printName("Henry", lastName: "Parker");


        }
    }
}