//LEVEL 1 – VERY BASIC (Foundation Strong)


//🌟1.	Print numbers from 1 to 10
/*public class loops {
    public  static void main(String[]args){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}*/


//🌟2.	Print numbers from 10 to 1
/*public class loops {
    public static void main(String[]args){
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }
    }
}*/


//3.🌟	Print numbers from 1 to N
/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        for(int a=1;a<=n;a++){
            System.out.println(a);
        }sc.close();
    }
}*/

//4.🌟	Print even numbers from 1 to 20
/*public class loops{
    public static void main(String[]args){
        for(int a=1;a<=20;a++){
            if(a%2==0){
                System.out.println(a);
            }
        }
    }
}*/

//5.🌟Print odd numbers from 1 to 20
/*public class loops {
    public static void main(String[]args){
        for(int a=1;a<=20;a++){
            if(a%2!=0){
                System.out.println(a);
            }
        }
    }
}*/

//6.	🌟Print multiples of 3 from 1 to 50
/*public class loops {
    public static void main(String[]args){
        for(int a=1;a<=50;a++){
            if(a%3==0){
                System.out.println(a);
            }
        }
    }
}*/

//7.🌟	Print first N natural numbers
/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number : ");
        int n=sc.nextInt();
        for(int a=1;a<=n;a++){
            System.out.println(a);
        }sc.close();
    }
}*/

//8.🌟	Print first N even numbers
/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter any number : ");
        int n=sc.nextInt();
        for(int a=1;a<=n;a++){

                System.out.println(a*2);
            }sc.close();
        }

    }
*/

//9.🌟	Print first N odd numbers
/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter any number : ");
        int n=sc.nextInt();
        for(int a=1;a<=n;a++){
            System.out.println(a*2-1);
        }sc.close();
    }
}*/

//10.🌟	Count numbers from 1 to 100
/*
public class loops {
    public static void main(String[]args){
        int count=0;
        for(int a=1;a<=100;a++){
            count++;}
            System.out.println(count);
        }
    }
*/


//🟢 LEVEL 2 – BASIC LOGIC

//11.🌟	Sum of first N natural numbers

/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number : ");
        int n=sc.nextInt();
        int sum=0;
        for(int a=1;a<=n; a++){
            sum=sum+a;

        }sc.close();
        System.out.println("sum of n natural numbers = "+sum);

    }
}
*/

//12.🌟	Sum of even numbers between 1 and N
/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number : ");
        int n=sc.nextInt();
        int sum=0;
        for(int a=1;a<=n;a++){
            if(a%2==0){
                System.out.println(a);
                sum=sum+a;
        }
    }
        System.out.println("sum of even numbers between 1 and n = "+sum);
        sc.close();
}
}*/


//13.🌟Sum of odd numbers between 1 and N
/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number = ");
        int n=sc.nextInt();
        int sum=0;
        for(int a=1;a<=n;a++){
            if(a%2!=0){
                System.out.println(a);
                sum=sum+a;
            }
        }
        System.out.println("sum of odd numbers between 1 and n = "+sum);
        sc.close();
    }
}*/

//14.🌟Print multiplication table of a number
/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number = ");
        int n=sc.nextInt();
        System.out.println("multiplicatioon of table "+n);

        for(int a=1;a<=10;a++){

            System.out.println( n +"x"+a+"="+n*a);

        }sc.close();
    }
}*/

//15.🌟Print tables from 1 to 10

/*public class loops {
    public static void main(String[]args){
        for (int n=1;n<=10;n++){
            System.out.println("table of "+n);
            for(int a=1;a<=10;a++){

            System.out.println(n+"X"+a+"="+(n*a));

        }
            System.out.println();
        }
    }
}*/

//16.🌟Count even numbers between 1 and N
/*import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("entre any number = ");
        int n=sc.nextInt();
        int count=0;
        for(int a=1;a<=n;a++){
        if(a%2==0){
            System.out.println(a);
            count++;
        }
        }
        System.out.println("total even numbers  "+ count);
        sc.close();
    }
}*/

//17.🌟	Count odd numbers between 1 and N
/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any number = ");
        int n=sc.nextInt();
        int count=0;
        for(int a=1;a<=n;a++){
            if(a%2!=0){
                System.out.println(a);
                count++;

            }
        } System.out.println("total count of odd numbers between 1 to " +n + "="+   (count) );
        sc.close();
    }
}

*/


//18.🌟Find factorial of a number

/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter any number = ");
        int n=sc.nextInt();
        int fact=1;
        for(int a=1;a<=n;a++){
             fact=fact*a;

        }
        System.out.println("factorial of a given number = " + fact);
        sc.close();
    }
}
*/


//19.🌟	Find power (a^b) using loop
/*import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base value = ");
        int a=sc.nextInt();
        System.out.println("enter power value = ");
        int b=sc.nextInt();
        int  result=1;
        int i=1;

        while (i<=b){
            result=result*a;
            i++;

        }
        System.out.println(result);
        sc.close();
    }
}*/

//20.🌟Print numbers divisible by 5 and 7 between 1 and 200
/*
public class loops {
    public static void main(String[]args){
        for(int a=1;a<=200;a++){
            if((a%5==0)&&(a%7==0)){
                System.out.println(a);
            }
        }

    }
}*/


//🟡 LEVEL 3 – NUMBER BASED LOGIC (IMPORTANT 🔥)//

//21.	Count number of digits in a number


/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number =  ");
        int n=sc.nextInt();
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        System.out.println("total count in a digit = " +count);
        sc.close();
    }
}*/

//22.🌟Reverse a number

/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any number = ");
        int n=sc.nextInt();
        int rev=0;
        while (n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        } System.out.println(rev );
        sc.close();
    }
}

*/

//23.🌟Find sum of digits
/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number = ");
        int n=sc.nextInt();
        n=Math.abs(n);
        int sum=0;
        while (n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;

        }System.out.println(sum);

    }
}
*/

//24.🌟	Find product of digits

/*
import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number = ");
        int  n=sc.nextInt();
        n=Math.abs(n);
        if(n==0){
            System.out.println(0);
        }else{
        int product=1;
        while (n>0){
            int digit=n%10;
            product=product*digit;
            n=n/10;
        }
        System.out.println(product);

    }sc.close();
}}
*/

//25.🌟	Check palindrome number
/*import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any number = ");
        int n=sc.nextInt();

        n=Math.abs(n);
        int original = n;

        int rev=0;
        while (n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        }
        System.out.println(rev);

        if(original==rev){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }sc.close();
    }
}*/

//26.🌟	Check Armstrong number
/*import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number = ");
        int n = sc.nextInt();
        n = Math.abs(n);
        int original = n;

        int count = 0;
        int temp = n;

        if (n == 0) {
            System.out.println("armstrong ");
        } else {


            while (temp > 0) {
                count++;
                temp = temp / 10;

            }
            int sum = 0;
            temp = original;

            while (temp > 0) {

                int digit = temp % 10;
                int power = (int) Math.pow(digit, count);
                sum = sum + power;
                temp = temp / 10;

            }
            if (original == sum) {
                System.out.println("armstrong");
            } else {
                System.out.println("not armstrong");
            }
            sc.close();


        }

    }
}*/


//27.🌟Print Armstrong numbers between 1 and 1000

public class loops {
    public static void main(String[]args){
       for(int n=1;n<=1000;n++){

           int count=0;
           int sum=0;
           while (n>0){
               count++;

               int digit=n%10;
               int power=(int)Math.pow(digit,count);
               sum=sum+power;
               n=n/10;
               System.out.printl;


           }
       }

    }
}



