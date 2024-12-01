class helloworld{ // ! class name should always match the name of the file

        // ! Java is case sensitive

    public static void main(String args[]){

        System.out.println("Hello World!"); // * This prints the test inside (ignore x: as kept by the compiler)
        
        // * The ln part in println is used to go to the newline, else the next output line will just print in the same line

        System.out.print("This is print only line.");

        System.out.println("Yes it does!");

        System.out.println(1+1);

        // ! Comments in Java

        // * Mathematical operations and no. can just be printed in Java

        /* This is Java's multiline comment */

        // ! Variables in Java

        /*String - stores text, such as "Hello". String values are surrounded by double quotes

        int - stores integers (whole numbers), without decimals, such as 123 or -123

        float - stores floating point numbers, with decimals, such as 19.99 or -19.99

        double - stores floating point numbers, with decimals, but more space

        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes

        boolean - stores values with two states: true or false */

        int a = 5;

        float b;

        b = 1.1f; // * Use f for float data type

        char c = 'c'; // * Use '' for char data type 

        String name = "LOL"; // * "" for string data type

        final int abc = 5; // ! this turns abc into a constant value whose value can't be changed during the program's execution

        System.out.println(name + a); // * In python, we would have to print two different data types together, but in Java we use + and no space is there b/w the two data types!
    }
}