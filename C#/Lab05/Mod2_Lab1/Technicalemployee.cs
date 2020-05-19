using System;
class Technicalemployee: Employee
 {
    public Technicalemployee(String name): base(name, 75000) {}
    public int successfulCheckIns = 5;

    public override String employeeStatus()
    {
        return this.toString() + " has " + this.successfulCheckIns + " successful check ins";
    }
}