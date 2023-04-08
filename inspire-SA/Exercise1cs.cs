using namespace System;
using namespace System::IO;

//this program will add two numbers together
int main()
{
    int num1, num2, sum;
    Console::WriteLine("Enter the first number: ");
    num1 = Convert::ToInt32(Console::ReadLine());
    Console::WriteLine("Enter the second number: ");
    num2 = Convert::ToInt32(Console::ReadLine());
    sum = num1 + num2;
    Console::WriteLine("The sum of the two numbers is: " + sum);
    Console::ReadLine();

    //improve the above program to write the result to a file
    StreamWriter sw = new StreamWriter("C:\\Users\\Public\\Documents\\sum.txt");
    sw->WriteLine("The sum of the two numbers is: " + sum);
    sw->Close();
    return 0;
}