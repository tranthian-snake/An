using System;
using System.Collections.Generic;
using System.Text;

namespace Students
{
    class StudentDetails
    {
        String studName= "James";
        int rollNumber = 20;

        public StudentDetails(String studName, int rollNumber)
        {
            this.studName = studName;
            this.rollNumber = rollNumber;
        }

        static void Main(string[] args)
        {
            StudentDetails objStudent = new StudentDetails("Minh", 19);
            Console.WriteLine("Student name " + objStudent.studName);
            Console.WriteLine("Roll number " + objStudent.rollNumber);

        }
    }
}
