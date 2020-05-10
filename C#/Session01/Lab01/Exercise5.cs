using System;

namespace VietJackCsharp
{
    class TestCsharp
    {
        public static void Main()
        {

            for (int num = 1; num < 21; num++)
            {
                int i;
                double f = 1;
                for (i = 1; i <= num; i++)
                    f = f * i;

                Console.Write("Giai thua cua {0} la: {1}\n", num, f);
            }

            Console.ReadLine();
        }
    }
}