using System;

namespace Snippet6
{
    class Animal
    {
        public Animal() {
            Console.WriteLine("Animal constructor without parameters");
        }
        public Animal(String name) {
            Console.WriteLine("Animal constructor with a string parameter");
        }

    }
}
