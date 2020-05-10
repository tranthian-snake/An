using System;
    class Program
    {
    static void Main(string[] args)
    {
        int number;
        do
        {
            Console.Write("Enter n(between 1 and 7): ");
            number = Convert.ToInt32(Console.ReadLine());
        } while (number < 1 || number > 7);
        switch (number) {

            case 1:
                Console.WriteLine("Monday");
                break;
            case 2:
                Console.WriteLine("Tuesday");
                break;
            case 3:
                Console.WriteLine("Wednesday");
                break;
            case 4:
                Console.WriteLine("Thursday");
                break;
            case 5:
                Console.WriteLine("Friday");
                break;
            case 6:
                Console.WriteLine("Saturday");
                break;
            case 7:
                Console.WriteLine("Sunday");
                break;

        }
        Console.ReadLine();
    }
    }
