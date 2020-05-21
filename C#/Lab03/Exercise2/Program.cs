using System;
class Program{
    public static void Main()
    {
        Employee e1 = new Employee("Tran", "Hai", "HN", 2, 3000 );
        Console.WriteLine(e1);
        Console.WriteLine("Bonus is: "+ e1.CalculateBonus(50));
        Console.WriteLine(e1.ToString());
        Console.ReadLine();
    }
}
