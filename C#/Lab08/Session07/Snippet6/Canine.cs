using System;

namespace Snippet6
{
    class Canine : Animal
    {
        //base() takes a string value called “Lion” 
        public Canine() : base("Lion") {
            Console.WriteLine("Derived Canine");
        }
    }
}
