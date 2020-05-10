using System;
    class Exercise1
    {
        static void Main(string[] args)
        {
            var e1 = new { name = "Above", address= "Ha Noi", phone=190000000 };
            Console.WriteLine("name = {0}\naddress = {1}\nphone = {2}", e1.name, e1.address, e1.phone);
            Console.ReadLine();
        }
    }
