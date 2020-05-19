using System;
public class Faculty : Employee
{
    private DateTime officehours;
    private int rank;

    public Faculty(DateTime officehours, int rank)
    {
        this.officehours = officehours;
        this.rank = rank;
    }
    public Faculty(DateTime o, int r, string a, int b, DateTime c): base(a, b, c)
    {
        this.officehours = o;
        this.rank = r;
    }
    public override double CalculateBonus()
    {
        return 1000 + 0.05 * Salary;
    }

    public override double CalculateVacation()
    {
        throw new NotImplementedException();
    }
}
