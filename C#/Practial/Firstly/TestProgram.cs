using System;
using System.Collections.Generic;
using System.Security.Cryptography.X509Certificates;
using System.Text;

namespace Firstly
{
    class TestProgram
    {
        Product[] arrayProduct = new Product[6];
        double sum;
        public void Run()
        {
            for(int i=0; i<3; i++)
            {
                Console.Write("Enter book id: ");
                int id = Console.Read();
                Console.Write("Enter book name: ");
                string name = Console.ReadLine();
                Console.Write("Enter book price: ");
                double price= Console.Read();
                Console.Write("Enter book producer: ");
                string producer= Console.ReadLine();
                Book book = new Book(id, name, price, producer);
                arrayProduct[i] = book;
                sum = sum + price;
            }
            for (int i = 3; i < 6; i++)
            {
                Console.Write("Enter mobile phone id: ");
                int id = Console.Read();
                Console.Write("Enter mobile phone name: ");
                string name = Console.ReadLine();
                Console.Write("Enter mobile phone price: ");
                double price = Console.Read();
                Console.Write("Enter mobile phone producer: ");
                string producer = Console.ReadLine();
               MobilePhone mobilePhone = new MobilePhone(id, name, price, producer);
                arrayProduct[i] = mobilePhone;
                sum = sum + price;
            }
            Console.WriteLine(arrayProduct);
            Console.WriteLine("compute total tax of books and mobile phones is: " + sum);
        }

        static void Main(string[] args)
        {
            TestProgram t = new TestProgram();
            t.Run();
        }
    }
}
