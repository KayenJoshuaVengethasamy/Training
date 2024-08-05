using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Arrays
{
    internal class Arrays
    {
        static void Main(string[] args)
        {
            string[] customers = new string[5];
            customers[0] = "Kayen";
            customers[1] = "Joshua";
            customers[2] = "Vengethasamy";
            customers[3] = "KJV";
            customers[4] = "Software";

            for (int i = 0; i < customers.Length; i++)
            {
                Console.WriteLine("Customer number " + i + "'s name is : " + customers[i]);
            }
        }
    }
}