using System;
class BusnessEmployee : Employee
{
    public BusnessEmployee(String name) : base(name, 50000) { }
    public double bonusBudget = 1000;

    public override String employeeStatus()
    {
        return this.toString() + " with a budget of " + this.bonusBudget;
    }
}
