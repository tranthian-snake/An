using System;
   public abstract class Employee: Person
{
    private string department;
    private int salary;
    private DateTime datehired;

    public abstract double CalculateBonus();
    // Abstract method
    public abstract double CalculateVacation();
}
}