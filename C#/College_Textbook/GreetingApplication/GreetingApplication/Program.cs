namespace GreetingApplication
{
    class Program
    {
        static void Main (string[] args)
        {
           string userName;

            Console.Write("Please enter your name : ");
            userName = Console.ReadLine();
            
            Console.WriteLine("Greetings " + userName);
            Console.ReadLine();
        }
    }
}