
/*Practice Questions on Operators
Beginner Level

Add, subtract, multiply, and divide two numbers using arithmetic operators.

Find the remainder when a number is divided by another.

Swap two numbers without using a third variable (using + and -).

Check whether a number is even or odd using %.

Increment a number using pre-increment and post-increment and print both values.*/

/*
public class operators {
    public static void  main(String[]args){
        int  a=12;
        int b=2;
        System.out.println("sum="+(a+b));
        System.out.println("sub="+(a-b));
        System.out.println("multiplicatin="+(a*b));
        System.out.println("division="+(a%b));
    }
}*/

/*public class operators {
    public static void main(String[]args){
        int a=20;
        int  b=2;
        System.out.println("remainder ="+(a%b));
    }
}*/

/*public class operators {
    public static void main(String[]args){
        int a=2;
        int b=4;

        int a=a+b;
        int b=a-b;
        int a=a-b;


    }
}*/
/*
public class operators {
    public static void main(String[] args) {
        int a = 10, b = 12;

        a = a + b;   // a = 22
        b = a - b;   // b = 10
        a = a - b;   // a = 12

        System.out.println(a + " " + b); // 12 10
    }
}*/
//
//Check whether a number is even or odd using %.

/*public class operators {
    public static void main(String[]args){
        int a=12;
        int  b=2;
       int  result=(a%2==0)?a:b;
        System.out.println();
    }
}*/
//Increment a number using pre-increment and post-increment and print both values.
/*public class operators {
    public static void main(String[]args){
        int a=12;
        int b=++a;
        int c=a++;
        System.out.println(b +" "+c);
    }
}*/
/*
public class operators {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int c = 10;

        // Nested ternary to find largest
        int largest = (a >= b) ? ( (a >= c) ? a : c ) : ( (b >= c) ? b : c );

        System.out.println("Largest number among " + a + ", " + b + ", " + c + " is " + largest);
    }
}
*/
//Check if a number is positive, negative, or zero using relational operators.
/*public class operators {
    public static void main(String[]args){
        int a=12;
        String result=(a>0)?"positive0":( (a < 0) ? "Negative" : "Zero" );
        System.out.println(a+" is"+result);


    }
}*/
//Check whether a number is divisible by both 3 and 5 using logical operators.

/*
public class operators {
    public static void main(String[]args){
        int a=12;
        String result=((a%3==0)&&(a%5==0))?"given number are divisible by both 3 and 5 ":"not divisible";
        System.out.println(a+" is  " +result );

    }
}*/
/*
public class operators {
    public static void main(String[] args) {
        int a = 10;

        // Check divisibility by 3 OR 5
        String result = ((a % 3 == 0) || (a % 5 == 0)) ?
                "Divisible by 3 or 5" :
                "Not divisible by 3 or 5";

        System.out.println(a + " is " + result);
    }
}
*/
//Find the largest of two numbers using a ternary operator.
/*
public class operators {
    public static void main(String[]args){
        int a=2;
        int b=10;
        String largest=(a>b)?(a+"  is largest"):(b+" is largest");
        System.out.println(largest);
    }
}*/













import java.util.Scanner;
public class operators {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number : ");
        int num1=sc.nextInt();
        System.out.println("enter 2nd numbere : ");
        int num2=sc.nextInt();
        System.out.println("Choose operation (+, -, *, /, %, ++, --, max): *");
        char op=sc.next().charAt(0);
sc.close();
 int res=(op=='+')?(num1+num2):
         (op=='-')?(num1-num2):
                 (op=='*')?(num1*num2):
                         (op=='/')?(num2!=0? (num1/num2):0):
        (op == '%') ? (num2 != 0 ? (num1 % num2) : 0) :
                (op=='i')?(++num1):
                        (op=='d')?(--num1):
                                (num1>num2)?num1:num2;
        System.out.println("RESULT = "+res);




    }
}