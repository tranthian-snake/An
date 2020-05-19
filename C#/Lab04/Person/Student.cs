using System;

public class Student: Person
{
    private string program;
    public Student(string program)
    {
        this.program = program;
    }
    public Student(string program, string d, int e, string f) : base(d, e, f)
    {
        this.program = program;
    }

}
