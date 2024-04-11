

import java.io.*;
//This code checks whether or not a number is even or odd
public class even_odd_site {
    public static void main(String[] args) throws IOException {
        //Creates a file BufferedWriter fill with contents of "numbers.html"
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));
        file.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n");
        file.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        //For loop that iterates through numbers 1 through 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
            //If loop checks for remainder by using the equation "i" mod 2. If returns 0 the number is even
                file.write("<tr><td>" + i + "</td><td></td></tr>\n");
            }
            //Else the number must be odd
            else {
                file.write("<tr><td></td><td>" + i + "</td></tr>\n");
            }
        }
        
        file.write("</table>\n</body>\n</html>");
        file.close();
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
