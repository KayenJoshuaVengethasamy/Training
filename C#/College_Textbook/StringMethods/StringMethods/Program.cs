using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StringMethods
{
    public class StringMethods
    {
        static void Main(string[] args)
        {
            // declare the variable
            string testString = "This is a test string";
            // display the original string
            Console.WriteLine("Original String "+testString);
            //convert the string to lower case
            testString = testString.ToLower();
            // display the updated string
            Console.WriteLine("String in lower case: " + testString);
            // display the string in uppercase but do not save it
            Console.WriteLine("String in uppercase: " + testString.ToUpper());
            //does this string start with the word this
            Console.WriteLine("String starts with 'this'" + testString.StartsWith("this"));
            //does this string end with the word this
            Console.WriteLine("String ends with 'this'" + testString.EndsWith("this"));
            //replace all spaces in the string with dashes
            testString = testString.Replace(" ", "-");
            //Display the updated string
            Console.WriteLine("String with dashes instead of spaces: "+testString);
            //pause
            Console.ReadLine();

            double Pi = 3.14159265358979;
            //simple string format
            Console.WriteLine("1. Pi is equal to {0}.", Pi);
            //Specify a format (0.00)
            Console.WriteLine("2. Pi is equal to {0:0.00}", Pi);
            //Exponential format
            Console.WriteLine("3. Pi is equal to {0:E2}", Pi);
            //Multiline items
            Console.WriteLine("4. Pi is equal to {0:0.00}, twice that is {1:0.00}.", Pi, Pi * 2);
            //Console.WriteLine("4. Pi is equal to {0:0.00}, twice that is {1,0.00}.", Pi, Pi * 2);
            //Three items
            Console.WriteLine("5. {0:0.00}, {1:0.00}, {2:0.00}, {3:0.00}", Pi, Pi * 2, Pi*3, Pi*4);
            //pause
            Console.ReadLine() ;

        }
    }
}