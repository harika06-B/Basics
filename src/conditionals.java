
//1️.Check whether a number is positive, negative, or zero1️.


/*import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER : ");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("positive");
        }else if(a<0){
            System.out.println("Negative");
        }else{
            System.out.println("zero");
        }sc.close();
    }

}*/

//2️.Check whether a number is even or odd
/*import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER = ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("it is a even number");
        }else{
            System.out.println("it is odd number");
        }sc.close();
    }
}*/

//3️.Check whether a person is eligible to vote
/*import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR AGE = ");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }sc.close();
    }
}*/

//4️.Check whether a number is divisible by 5 and 11
/*
import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER");
        int num=sc.nextInt();
        if((num%5==0)&&(num%11==0)){
            System.out.println("the number is divisible by both 5 and 11 ");
        }else{
            System.out.println("the number is not divisible by both 5 and 11");
        }sc.close();
    }
}*/
//5️.Find the largest of two numbers
/*import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1ST NUMBER = ");
        int num1=sc.nextInt();
        System.out.println("ENTER 2ND NUMBER = ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println(" num1 is largest number ");
        }else if(num1<num2){
            System.out.println(" num2 is largest number ");
        }else{
            System.out.println("two numbers are equal");
        }sc.close();
    }
}*/
/*
//6️. Find the largest of three numbers

import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER 1ST NUMBER = ");
        int num1 = sc.nextInt();
        System.out.println("ENTER 2ND NUMBER = ");
        int num2 = sc.nextInt();
        System.out.println("ENTER 3RD NUMBER = ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 is the largest number");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("num2 is the largest number");
        } else {
            System.out.println("num3 is the largest number");
        }

        sc.close();
    }
}
*/
//7️.Check whether a year is a leap year
/*import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any year : ");
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println("it is a leap year ");
        } else if  (year%100==0){
            System.out.println("it not a leap year");
        }else if(year%4==0){
            System.out.println("it is leap year");
        }else{
            System.out.println("it is not a leap year");
        }sc.close();
    }
}*/
//8.Check whether a character is vowel or consonant
/*import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY CHARCTER : ");
        char ch=sc.next().charAt(0);
        if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z')){
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                System.out.println("VOWEL");

            }else {
                System.out.println("CONSONENT");
            }


        }else{
            System.out.println("NOT A ALPHABET");
        }sc.close();
    }
}*/
//9️.Check whether a number is 2-digit or 3-digit
/*//9️.Check whether a number is 2-digit or 3-digit
import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number : ");
        int a=sc.nextInt();
        if((a>=10&&a<=99)||(a<=-10&&a>=-99)){
            System.out.println("it is a 2-digit number");

        }else if((a>=100&&a<=999)||(a<=-100&&a>=-999)){
            System.out.println("it is a 3-digit number");
        }else{
            System.out.println(" it is not a 2 or 3-digit number");
        }sc.close();
    }
}*/
//🔟 Check whether a number is divisible by 3, 5, or both
/*import java.util.Scanner;
public class conditionals {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number : ");
        int a = sc.nextInt();
        if(a%3==0&&a%5==0){
            System.out.println("it is divisible by both 3 & 5");

            }else if(a%3==0) {
            System.out.println(" it is divisible by 3");
        }
        else if(a%5==0){
            System.out.println(" it is divisible by 5");
        }else{
            System.out.println(" it is not dividible by 3 & 5");
        }sc.close();

    }}*/
//11.Grading system
//•	Marks ≥ 90 → A
//•	≥ 75 → B
//•	≥ 60 → C
//•	Else → Fail


/*
import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter ur marks : ");
        int marks=sc.nextInt();if(marks<0||marks>100){
            System.out.println("invalid marks");

        }
         else if(marks>=90){
            System.out.println("A");
        }else if(marks>=75){
            System.out.println("B");
        }else if(marks>=60){
            System.out.println("C");
        }else{
            System.out.println("Fail");
        }sc.close();
    }
}*/
//12 Electricity bill problem
//•	Units ≤ 100 → ₹1/unit
//•	≤ 200 → ₹2/unit
//•	200 → ₹3/unit

/*import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter units");
        int units=sc.nextInt();
        int bill;
        if(units<=100){
            bill=units*1;
        }else if(units<=200){
            bill=units*2;
        }else {
            bill=units*3;

    }
        System.out.println("electricity bill : "+bill);
        sc.close();
}
}*/
//13.Salary calculation
//•	Salary ≥ 50,000 → Tax 10%
//•	≥ 30,000 → Tax 5%
//•	Else → No tax
/*import java.util.Scanner;
public class conditionals {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur salary : ");
        int salary=sc.nextInt();
        int tax;
        if(salary>=50000){
            tax=salary*10/100;
            System.out.println("TAX :  "+tax);
        }else if(salary>=30000){
            tax=salary*5/100;
            System.out.println("Tax ="+tax);

        }else {
            System.out.println("no tax");

        }sc.close();



    }
}*/
//14 Print day name using day number (1–7)

/*import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr any number : ");
        int num=sc.nextInt();

        switch (num){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednwsday");
                break;
            case 4:
                System.out.println("thursady");
                break;
            case 5:
                System.out.println("friday ");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid day");;
        }sc.close();
    }
}*/
//. Calculator using switch (+, -, *, /)
/*import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" give 1st number : ");
        int a=sc.nextInt();
        System.out.println("give 2nd number : ");
        int b=sc.nextInt();
        System.out.println("select operation +, -, *, /");
        char c=sc.next().charAt(0);
        switch(c){
            case '+':
                System.out.println("result: "+(a+b));
                break;
            case '-':
                System.out.println("result :"+(a-b));
                break;
            case '*':
                System.out.println("result : "+(a*b));
                break;
            case '/':
                if(b!=0)
            System.out.println("result : "+(a/b));
            break;
            default:
                System.out.println(  " result : invalid operator");


        }sc.close();
    }
}*/
//16.ATM menu program
//1 → Balance
//2 → Withdraw
//3 → Deposit
//4 → Exit

/*
import java.util.Scanner;
public class conditionals {
    public static void mian(String[]args){
        Scanner sc=new Scanner(System.in);
        int balance=100000;


        System.out.println("------ATM MENU-----");
        System.out.println("1.Balance");
        System.out.println("2.withdraw");
        System.out.println("3.deposit");
        System.out.println("4.exit");

        System.out.println("enter your choice");
        int choice=sc.nextInt();
        int amount;
        switch(choice){
            case 1:

                System.out.println("Balance"+balance);

                break;
            case 2:
                System.out.println("enter withdraw amount");
                 amount=sc.nextInt();
                if(amount<=balance) {

                    System.out.println("withdraw succesfully");
                    balance = balance - amount;
                    System.out.println("remaing balance : " + balance);
                }
                else{
                    System.out.println(" insufficient amount");
                }
break;
            case 3:
                System.out.println("enter deposit amount");
                amount=sc.nextInt();
                balance=balance+amount;
                System.out.println("succesfully deposit");
                System.out.println("remaing balance : "+balance);


break;
            case 4:
                System.out.println("thanks for using ATM");
                break;
            default:
                System.out.println("invalid choice");


        }sc.close();

    }
}*/
/*import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;   // Initial balance
        int choice;
        int amount;

        System.out.println("----- ATM MENU -----");
        System.out.println("1. Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                // Balance
                System.out.println("Your Balance is: ₹" + balance);
                break;

            case 2:
                // Withdraw
                System.out.print("Enter withdraw amount: ");
                amount = sc.nextInt();

                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Withdraw successful!");
                    System.out.println("Remaining Balance: ₹" + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;

            case 3:
                // Deposit
                System.out.print("Enter deposit amount: ");
                amount = sc.nextInt();

                balance = balance + amount;
                System.out.println("Deposit successful!");
                System.out.println("Updated Balance: ₹" + balance);
                break;

            case 4:
                // Exit
                System.out.println("Thank you for using ATM!");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}*/
//17.Profit or Loss (CP, SP input)
/*import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter cost price : ");
        int cp=sc.nextInt();
        System.out.println("enter selling price : ");
        int sp= sc.nextInt();
        int price;

        if(sp>cp){
            System.out.println("profit");
            price=sp-cp;
            System.out.println("profit amount : "+price);

        }else if(cp>sp)
        {
            System.out.println("loss");
            price=cp-sp;
            System.out.println("loss amount : "+price);
        }else {

            System.out.println("no profit no loss");
        }

        sc.close();
    }
}*/
//1️8Triangle validity (sum of angles = 180)(Equilateral, (Equilateral, Isosceles, Scalene)., Scalene).

import java.util.Scanner;
public class conditionals {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st angle : ");
        int a=sc.nextInt();
        System.out.println("enter 2nd angle : ");
        int b=sc.nextInt();
        System.out.println("enter 3rd angle : ");
        int c=sc.nextInt();

       int d=a+b+c;
       if(a > 0 && b > 0 && c > 0 &&(d==180)){
           System.out.println("it is triangle");
           if((a==b)&&(b==c)&&(c==a)) {
               System.out.println("Equilateral");
           }else if((a==b)||(b==c)||(c==a)){
               System.out.println("Isosceles");

               }else{
               System.out.println("Scalene");



        }}else{
           System.out.println("it is not a triangle");
       }sc.close();
    }
}