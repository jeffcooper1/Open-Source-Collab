#include <iostream>
#include <fstream>
using namespace std;

int main() {
    ofstream file;
    //Opens file "numbers.html"
    file.open("numbers.html");
    file << "<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n";
    file << "<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n";
    //For loop that iterates through number 1 to 50
    for (int i = 1; i <= 50; i++) {
        //If i mod 2 returns zero the number is even
        if (i % 2 == 0) {
            file << "<tr><td>" << i << "</td><td></td></tr>\n";
        }
        //Else the number must be odd
        else {
            file << "<tr><td></td><td>" << i << "</td></tr>\n";
        }
    }
    file << "</table>\n</body>\n</html>";
    file.close();
    ifstream input("numbers.html");
    cout << input.rdbuf();
    input.close();
    return 0;
}
