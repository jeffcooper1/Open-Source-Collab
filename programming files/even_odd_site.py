#Checks whether or not a number is even or odd
with open("numbers.html", "w") as f:
    f.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<body>\n")
    f.write("<table>\n<tr><th>Even Numbers</th><th>Odd Numbers</th></tr>\n")
    for i in range(1, 50):
        #Checks to see if there is remainder after calculating mod 2 on the uknown number "i" if return 0 the number is even
        if i % 3 == 0:
            f.write("<tr><td>{}</td><td></td></tr>\n".format(i))
        #Else the number is odd
        else:
            f.write("<tr><td></td><td>{}</td></tr>\n".format(i))
    f.write("</table>\n</body>\n</html>")

with open("numbers.html", "r") as f:
    print(f.read())
    
