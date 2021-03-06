﻿using System;

namespace Firstly
{
    abstract class Product
    {
        int id;
        string name;
        double price;
        string producer;

        public Product(int id, string name, double price, string producer)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.producer = producer;
        }
        public int ID
        {
            get { return id; }
            set { id=value; }
        }
        public string Name
        {
            get { return name; }
            set { name =value; }
        }
        public double Price
        {
            get { return price; }
            set { price = value; }
        }
        public string Producer
        {
            get { return producer; }
            set { producer = value; }
        }

        public abstract double computeTax();
        
    }
}
