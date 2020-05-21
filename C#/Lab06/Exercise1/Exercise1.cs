using System;
using Customer;
using Order;
namespace Customer
{
    class Customers
    {
        public string name;
        public void getName()
        {
            Console.WriteLine("Enter customer name :");
            name = Console.ReadLine();
        }
    }
}
namespace Order
{
    class GroceryItems
    {
        public void Ord_grocery()
        {
            Customers cus1 = new Customers();
            cus1.getName();
            Console.WriteLine("Hello {0}", cus1.name);
            Console.WriteLine("You have ordered grocery items");
        }
    }
    class BakeryProducts
    {
        public void Ord_bakery()
        {
            Customers cus2 = new Customers();
            cus2.getName();
            Console.WriteLine("Hello {0}", cus2.name);
            Console.WriteLine("You have ordered bakery products");
        }
    }
}
class OrderTest
{
    public static void Main()
    {
        string choice;
        Console.WriteLine("What would you like to order? 1-Grocery Items, 2- Bakery Products");
        choice = Console.ReadLine();
        if (choice == "1")
        {
            GroceryItems grocery = new GroceryItems();
            grocery.Ord_grocery();
        }
        else
        {
            if (choice == "2")
            {
                BakeryProducts bakery = new BakeryProducts();
                bakery.Ord_bakery();
            }
            else
            {
                Console.WriteLine("Enter either 1 or 2");
            }
        }
        Console.ReadLine();
    }
}