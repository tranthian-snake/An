﻿using System;
using System.Collections.Generic;

namespace Snippet5
{
    interface IMaths<T>
    {
        T Addition(T valOne, T valTwo);
        T Subtraction(T valOne, T valTwo);
    }
    class Numbers: IMaths<int>
    {
        public int Addition(int valOne, int valTwo)
        {
            return valOne + valTwo;
        }
        public int Subtraction(int valOne, int valTwo)
        {
            if (valOne > valTwo)
            {
                return (valOne - valTwo);
            }
            else
            {
                return (valTwo - valOne);
            }
        static void Main(string[] args)
        {
                int numOne = 23;
                int numTwo = 45;
                Numbers objInterface = new Numbers();
                Console.WriteLine("Addition of two integer values is: ");
                Console.WriteLine(objInterface.Addition(numOne, numTwo));
                Console.WriteLine("Subtraction of two integer values is: ");
                Console.WriteLine(objInterface.Subtraction(numOne, numTwo));
        }
    }
}
