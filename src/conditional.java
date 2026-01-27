//📀Level 1: Basic If–Else
//
//Check whether a number is positive or negative.
/*
import java.util.Scanner;
public class conditional {
    public  static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER = ");
        int a=sc.nextInt();

        if(a>0){
            System.out.println("POSITIVE ");
        }else if(a<0){
            System.out.println("NEGATIVE");

        }else{
            System.out.println("ZERO");
        }sc.close();
    }


}
*/


//📀Check whether a number is even or odd.

/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER NUMBER = ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }sc.close();
    }
}*/


//📀Read a number and check if it is
// greater than 100

      /*  import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" ENTER ANY NUMBER");
        int num=sc.nextInt();
        if(num>100){
            System.out.println("greater than 100");

        }
        else {
            System.out.println("NOT");
        }sc.close();

    }
}*/

//📀Check whether a person is eligible to vote (age ≥ 18).

/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR AGE = ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("ELIGIBLE TO VOTE");
        }else{
            System.out.println("NOT ELIGIBLE TO VOTE");
        }sc.close();
    }
}*/


//📀Check whether a character is a vowel or consonant.

/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY ALPHABET");
        char ch=sc.next().charAt(0);
        if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')){

        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||
        ch=='A'||ch=='I'|| ch=='O'||ch=='U'){

            System.out.println("VOWEL");
        }

        else {
            System.out.println("CONSONENT");

            sc.close();
        }

        }

        else{
                System.out.println("not a alphabet");
            }
        }

    }
*/


/*
📀Level 2: If–Else If Ladder

Read two numbers and print the greater number.*/

import java.util.Scanner;
/*
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY  TWO NUMBERS = ");
         int a=sc.nextInt();
         int  b=sc.nextInt();

         if(a>b){
             System.out.println("GREATER NUMBER = "+a);

         }else if (a<b){
             System.out.println("GREATER NUMBER = "+b);
         }

         else{
             System.out.println("GIVEN NUMBERS ARE EQUAL");
             sc.close();
         }

    }
}*/

//📀Read three numbers and find the largest of three.

/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]aargs){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY THREE NUMBERS= ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b&&a>c){
            System.out.println("LARGEST NUMBER = "+a);
        }else if(b>a&&b>c){
            System.out.println("LARGEST NUMBER="+b);

        }else{
            System.out.println("LARGEST NUMBER="+c);
        }sc.close();
    }
}*/

/*
  📀Read marks and print the grade:

        ≥ 90 → A

≥ 75 → B

≥ 60 → C

≥ 35 → D

else → Fail*/

/*
import  java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER MARKS");
        int marks=sc.nextInt();
        if(marks<0 || marks>100){
            System.out.println("INVALID MARKS");
        }
        else if(marks>=90){
            System.out.println("A GRADE");

        }else if (marks>=75){
            System.out.println("B GRADE");
        }else if (marks>=60){
            System.out.println("C GRADE");
        }else if(marks>=35){
            System.out.println("D GRADE");
        }else {
            System.out.println("FAIL");
        }sc.close();
    }
}
*/


//📀Check whether a year is a leap year.

/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YEAR");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("leap year");
        }else if(year%100==0){
            System.out.println("not a leap year");
        }else if(year%400==0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }sc.close();

        }
    }
*/

//📀Read a number (1–7) and print the day of the week.

/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter day");
        int day=sc.nextInt();
        switch (day){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
            break;
            case  3:
                System.out.println("WEDNESDAY");
            break;
            case 4:
                System.out.println("THURSDAY");
            break;
            case 5:
                System.out.println("FRIDAY");
            break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("invalid");
        }
    }
}*/



//📀Check whether a number is a multiple of 5.

/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER = ");
        int a=sc.nextInt();
        if(a%5==0){
            System.out.println("this number is multiple of 5");
        }else{
            System.out.println(" not multiple of 5");
        }sc.close();
    }
}*/

//📀Find the absolute value of a number without using built-in functions.

/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER= ");
        int a=sc.nextInt();

        if(a<0)
        {
            a=-a;
            System.out.println("absolute value= "+a);
        }
        sc.close();
    }
}

*/

//📀Check whether a number is a 3-digit number.

/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER = ");
        int a=sc.nextInt();
        if(a<=999 &&a>=100)
        {
            System.out.println(" 3-digit number");
        }else{
            System.out.println("not 3-digit number");
        }sc.close();
    }
}*/


//📀Check whether a number is divisible by both 3 and 5.

/*import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int a=sc.nextInt();
        if(a%3==0&&a%5==0){
            System.out.println("this number is divisible by both 3 and 5");
        }else {
            System.out.println("this number is not divisible by both 3 and 5");
        }sc.close();
    }
}*/

//📀Check whether a character is uppercase, lowercase, digit, or special character.

/*import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY CHARACTER");
        char ch=sc.next().charAt(0);

             if(ch>='A' && ch<='Z'){
                System.out.println("UPPER CASE");

            }else if(ch>='a'&& ch<='z'){
                System.out.println("LOWER CASE");
            }else if (ch>='0' && ch<='9'){
            System.out.println("digit");
        }else {
            System.out.println("special character");
        }sc.close();
        }
    }*/


//📀Check whether a triangle is valid (sum of any two sides > third).

/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a+b)>c &&((b+c)>a)&&((c+a)>b)){
            System.out.println("it is triangle");
        }else{
            System.out.println("not a triangle");
        }sc.close();

    }
}*/


//📀Find whether a number is prime or not (using conditions only).

//📀Find profit or loss based on cost price and selling price.
/*
import java .util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("GIVE COST PRICE");
        int cp=sc.nextInt();
        System.out.println("GIVE SELLING PRICE");
        int sp=sc.nextInt();


        if(sp>cp){
            int profit=sp-cp;
            System.out.println("PROFIT= " +profit);
        }else {
            int loss=cp-sp;
            System.out.println("LOSS = " +loss);
        }sc.close();
    }

}*/


//📀Determine the type of triangle (Equilateral, Isosceles, Scalene).
/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("give any 3 values = " );
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(((a+b>c))&&((b+c)>a)&&((c+a)>b)){
            System.out.println("yes it is triangle");

               if((a==b)&&(b==c)){
            System.out.println("equilateral triangle");
        }
               else if((a==b)||(b==c)||(c==a)){
            System.out.println("isosceles triangle");
        }
               else{
            System.out.println("scalene triangle");
        }
    }
    else{
            System.out.println("not a triangle");
        }sc.close();
        }}
*/


//📀Check whether a number is perfect square.

/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number = " );
        int a=sc.nextInt();
        int b=(int) Math.sqrt(a);
if(b*b==a){
    System.out.println("perfect square ");

}else{
    System.out.println("not a perfect square");
}sc.close();
    }
}*/

//📀Find the second largest of three numbers.


/*
import java.util.Scanner;
public class conditional{


public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER ANY THREE NUMBERS");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if((a>b&&a<c)||(a>c&&a<b)){
        System.out.println(" second largest num ="+a);

    }else if((b>c&&b<a)||(b<c&&b>a)){
        System.out.println("second largest num="+b);
    }else if((c>a&&c<b)||(c>b&&c<a)){
        System.out.println("second largest num="+c);
    }else{
        System.out.println("give numbers are equal");
    }sc.close();
}}
*/

//📀📀📀Check whether a number is Armstrong.

/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  a 3 digit number");
        int num=sc.nextInt();

        int original=num;
        int d1=num%10;
        int d2=(num/10)%10;
        int d3=num/100;

        int sum=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
        if(sum == original){
            System.out.println("it is a Armstrong number");

        }else{
            System.out.println("not a Armstrong number");
        }sc.close();

    }
}
*/


/*
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3-digit number:");
        int num = sc.nextInt();

        int original = num;

        // Extract digits
        int d1 = num % 10;        // last digit
        int d2 = (num / 10) % 10; // middle digit
        int d3 = num / 100;       // first digit

        // Sum of cubes
        int sum = (d1*d1*d1) + (d2*d2*d2) + (d3*d3*d3);

        // Conditional check
        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        sc.close();
    }
}
*/


/*
📀📀📀Electricity bill calculation:

Units ≤100 → ₹1/unit

101–200 → ₹2/unit

200 → ₹3/unit*/


/*
import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter units");
        int units=sc.nextInt();
        int bill;
        if(units<=100 ){
       bill=units*1;

        }else if(units<=200){
            bill=(100*1)+(units-100)*2;

        }else{
            bill=(100*1)+(100*2)+(units-200)*3;
        }
        System.out.println("electricity bill = "+bill);
        sc.close();
    }
}


*/


//📀📀📀Find roots of a quadratic equation.


/*
import java.util.Scanner;
public class conditional {
  public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("give 3 values");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        if(a==0) {
            System.out.println("not a quadratic equation");
        }else{
            int D=b*b-4*a*c;
                 if (D>0){
            double r1=(-b+Math.sqrt(D))/(2.0*a);
            double r2=(-b-Math.sqrt(D))/(2.0*a);
            System.out.println("two real roots");
            System.out.println("root 1 = "+r1);
            System.out.println("root 2 = "+r2);

                   }else if(D==0){
            double r1=-b/(2.0*a);
            System.out.println("one real root");
            System.out.println("root r1= "+r1);
                     }else {
                     System.out.println("no real root");
                 }
        }sc.close();
    }
}
*/


//📀📀📀ATM withdrawal:
//
//Amount must be multiple of 100
//
//Minimum balance ₹500

/*
import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter balance amount:");
        int balanceAmount = sc.nextInt();

        System.out.println("Enter withdraw amount:");
        int withdrawAmount = sc.nextInt();

        if (withdrawAmount % 100 == 0) {

            if (balanceAmount - withdrawAmount >= 500) {
                balanceAmount = balanceAmount - withdrawAmount;
                System.out.println("Withdrawal successful");
                System.out.println("Remaining balance: ₹" + balanceAmount);
            } else {
                System.out.println("Insufficient balance. Minimum required ₹500");
            }

        } else {
            System.out.println("Invalid amount. Amount must be multiple of 100.");
        }

        sc.close();
    }
}
*/


//📀📀📀Find BMI category using height & weight.


import java.util.Scanner;
public class conditional {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter height in meters =");
        double height=sc.nextDouble();

        System.out.println("enter weight in kgs = ");
        double weight=sc.nextDouble();

        double BMI=weight/(height*height);
        System.out.println("BMI VALUE = "+BMI);

        if(BMI<18.5){
            System.out.println("Category: Underweight");

             } else if (BMI >= 18.5 && BMI < 25) {
             System.out.println("Category: Normal");

             } else if (BMI >= 25 && BMI < 30) {
             System.out.println("Category: Overweight");

            } else {
            System.out.println("Category: Obese");
            }sc.close();
    }
}

