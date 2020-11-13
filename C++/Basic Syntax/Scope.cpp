#include <iostream>

using namespace std;

int g;      ///g sebagai global variable, dapat digunakan dalam fungsi2 yg berbeda2
 

int main()
{
    int a=10, b=20; ///a, b sebagai local variable yang hanya berlaku dalam fungsi tertentu
    int g=a+b;

    cout << g;

    return 0;
    
}