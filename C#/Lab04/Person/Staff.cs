using System;

class Staff : Employee
{
    private string title;

    public Staff(string title)
    {
        this.title = title;
    }
    public Staff(string t, string a, int b, DateTime c) : base(a, b, c)
    {
        this.title = t;
    }
    public override double CalculateBonus()
    {
        return 0.06 * Salary;
    }

    public override double CalculateVacation()
    {
        throw new NotImplementedException();
    }
}
