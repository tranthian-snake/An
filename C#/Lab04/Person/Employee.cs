using System;
   public abstract class Employee: Person
{
    protected string department;
    protected int salary;
    protected DateTime datehired;


    public Employee(string department, int salary, DateTime datehired)
    {
        this.department = department;
        this.salary = salary;
        this.datehired = datehired;
    }
    public Employee(){} 
    public Employee(string a, int b, DateTime c, string d, int e, string f ) : base(d, e, f)
    {
        this.department = a;
        this.salary = b;
        this.datehired = c;
    }
    public string Department
    {

        get { return department; }
        set { department = value; }
    }
    public int Salary
    {
        get { return salary; }
        set { salary = value; }
    }
    public DateTime Datehired
    {

        get { return datehired; }
        set { datehired = value; }
    }

    public abstract double CalculateBonus();
    // Abstract method
    public abstract double CalculateVacation();
}
