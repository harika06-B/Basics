//🌟/*
/*
Level 1 – Basic Input

1️⃣ Read an integer and print it

Input: 10
Output: You entered 10
*/


/*
import java.util.Scanner;
public class input {
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
        System.out.println("you entered "+a);
    }
}*/



/*🌟2️⃣ Read two integers and print their sum

Input: 5 7
Output: Sum = 12*/

/*
import java.util.Scanner;
public class input{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println( "sum ="+ (a+b));
        sc.close();
    }
}*/


 /* 🌟Read a float and print it

Input: 3.5
Output: 3.5*/

/*
import java.util.Scanner;
public class input {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float a= sc.nextFloat();
        System.out.println(a);
        sc.close();
    }

}*/


/*
Read a character and print its ASCII value

Input: A
Output: 65
*/


/*
import java.util.Scanner;
public class input {
    public static void main(String[]args){


    Scanner sc=new Scanner(System.in);
    char ch= sc.next().charAt(0);
    int a=(int)ch;
        System.out.println(a);
        sc.close();


}}*/


/*
🌟 Next Practice Problem
Check whether a character is a VOWEL or CONSONANT*/


import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
                    || ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                System.out.println("VOWEL");
            } else {
                System.out.println("CONSONANT");
            }

        } else {
            System.out.println("Not an alphabet");
        }

        sc.close();
    }
}


