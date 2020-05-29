using System;
using System.Collections.Generic;
using System.Text;

namespace Firstly
{
    class MobilePhone: Product
    {
        public MobilePhone(int id, string name, double price, string producer) : base(id, name, price, producer) { }
        public override double computeTax()
        {
            return (base.Price * 1 / 10);
        }
    }
}
