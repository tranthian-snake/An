using System;
class Exercise4
{
    static void Main(string[] args)
    {
        Console.Write("Enter n: ");
        int number = Convert.ToInt32(Console.ReadLine());
        int sult = 0;
        for(int i=1; i<10; i++)
        {
            sult = number * i;
            Console.WriteLine(number +" x "+ i+ " = "+ sult);
        }
        Console.ReadLine();
    }
}