using System;

namespace Animal
{
    class Dog : Animal
    {
        public void Eat() { }
        public void Main(string[] args)
        {
            Dog objDog = new Dog();
            objDog.Eat();
            base.Eat();
        }
    }
}
