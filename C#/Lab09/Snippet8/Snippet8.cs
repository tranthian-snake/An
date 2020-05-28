﻿using System;
using System.Collections;
using System.Collections.Generic;

namespace Snippet8
{
    class General<T, U>
    {
        T _valOne;
        U _valTwo;
        public void AcceptValues(T item)
        {
            _valOne = item;
        }
        public void AcceptValues(U item)
        {
            _valTwo = item;
        }
        public void Display()
        {
            Console.WriteLine(_valOne + "\t" + _valTwo);
        }
    }
    class MethodOverload
    {
        static void Main(string[] args)
        {
            General<int, string> objGenOne = new General<int, string>();
            objGenOne.AcceptValues(10);
            objGenOne.AcceptValues("Smith");
            Console.WriteLine("ID \t Name \t Designation \t Salary");
            objGenOne.Display();

            General<string, float> objGenTwo = new General<string, float>();
            objGenTwo.AcceptValues("Mechanic");
            objGenTwo.AcceptValues(2500);
            Console.Write("\t");
            objGenTwo.Display();
            Console.WriteLine();
        }
    }
}
