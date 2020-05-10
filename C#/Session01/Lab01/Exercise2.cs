using System;
using System.ComponentModel.DataAnnotations;

class Exercise2
    {
        static void Main(string[] args)
        {
        int number1;
        int number2;
        int number3;
        number1 = 1;
        number2 = 18;
        number3 = 9;

        int max;
        if(number1 > number2)
        {
            if(number1> number3)
            {
                max = number1;
                Console.WriteLine("Maximun number from three integer is: " + max);
            }
            else
            {
                max = number3;
                Console.WriteLine("Maximun number from three integer is: " + max);
            }
        }
        else
        {
            if(number2> number3)
            {
                max = number2;
                Console.WriteLine("Maximun number from three integer is: " + max);
            }
            else
            {
                max = number3;
                Console.WriteLine("Maximun number from three integer is: " + max);
            }
        }
        Console.ReadLine();
    }
    }
