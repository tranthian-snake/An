using System;

namespace Snippet2
{
    class Book
    {
        string bookName;
        double bookPrice;
        public void Input(string bookName, double bookPrice)
        {
            this.bookName = bookName;
            this.bookPrice = bookPrice;
        }
        public string Print()
        {
            return bookName + ": " + bookPrice;
        }
        static void Main(string[] args)
        {
            Book b1 = new Book();
            b1.Input("Khoa hoc va xa hoi", 34.46);
            Console.WriteLine(b1.Print());
        }
    }
}
