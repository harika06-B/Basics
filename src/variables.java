//Problem 1: Print Local, Instance, Static Variables
//
//Write a Java program to print all three types of variables.
//
//Expected Output Example:
//
//Local: 10
//Instance: 100
//Static: 200


//public class variables {
//
// int a=100;
//    static int b=200;
//    void show(){
//        int c=10;
//        System.out.println("local : "+c);
//        System.out.println("instance : "+a);
//        System.out.println("static : "+b);
//    } public static void main(String[]args){
//        variables v=new variables();
//        v.show();
//    }
//}




//1. Print all types of variables
//
//Create a class with:
//
//one instance variable
//
//one static variable
//
//one local variable
//Print them inside a method.


//public class variables{
//    int a=10;
//    static int b=20;
//     void show(){
//         int c=30;
//         System.out.println("localvar= "+c);
//         System.out.println("instancevar= "+a);
//         System.out.println("staticvar= "+b);
//     }
//     public static void main(String[]args){
//         variables v=new variables();
//         v.show();
//     }
//}



//2. Swap two variables (using third variable)


/*public class variables {

    public static void main(String[] args) {

        int a = 12, b = 20;

        int temp = a;   // save a
        a = b;          // assign b to a
        b = temp;       // assign temp to b

        System.out.println(a + " " + b);
    }
}*/



//3. Swap without third variable


/*
public class variables {
    public static void main(String[] args) {
        int a = 10, b = 12;

        a = a + b;   // a = 22
        b = a - b;   // b = 10
        a = a - b;   // a = 12

        System.out.println(a + " " + b); // 12 10
    }
}
*/


//Sum of two instance variables // //Create two instance variables x and y. //Print their sum using a method.




/*public class variables {

    int a = 10;   // instance variable
    int b = 14;   // instance variable

    void show() { // instance method
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        variables v = new variables(); // object creation
        v.show();                      // calling instance method
    }
}*/

//5. Default values of instance variables
//
//Create int, double, char, boolean instance variables.
//Print them without initializing to check default values.

/*
public class variables {
    int a;
    double b;
    char ch;
    boolean is;

     void show(){
         System.out.println(a+" "+b+" "+ch+" "+is+" ");
     }
    public static void main(String[]args){
         variables v=new variables();
         v.show();

    }
}
*/


//5. Default values of instance variables
//
//Create int, double, char, boolean instance variables.
//Print them without initializing to check default values.

//public class variables {
//    int a;
//    double b;
//    char ch;
//    boolean is;
//
//    void show(){
//        System.out.println(a+" "+b+" "+ch+" "+is+" ");
//    }
//    public static void main(String[]args){
//        variables v=new variables();
//        v.show();
//
//    }
//}

//7. Modify static variable wit

/*
public class variables {
    static int a=10;

    public static void main(String[]args){
        variables v=new variables();
        variables v1=new variables();
         v.a=21;
        System.out.println(v.a);
        System.out.println(v1.a);
    }
}

*/



//Level 2 — Medium Problems
//8. Shadowing
//
//Inside a method declare a local variable with the same name as an instance variable.
//Print both using this.



/*
public class variables {
    int a=10;

    void show(){
        int a=20;
        System.out.println(a);
        System.out.println(this.a);
    }

     public static  void main( String[]args) {
     variables v=new variables();
     v.show();

    }

}*/



//9. Static vs Instance Count Create: static int count Increase it inside constructor. Print how many objects were created.


/*
public class variables {
    static int   a =0;
  variables() {
      a++;
  }
  public static void main(String[]args)
  {
 new variables();
new variables();
new variables();
      System.out.println("object created="+ a);
      }

  }



*/
/*
10. Area of rectangle using instance variables

Instance variables: length and width
Method: calculateArea()
Return the area.*/


/*
public class variables {
    int a=20;
    int b=10;

    void show(){
        System.out.println(a*b);
    }
    public static void main(){
        variables v=new variables();
        variables v1=new variables();
        v.show();

    }
}*/

/*11. Final variable

Create a final variable PI = 3.14
Try to change it (observe error).*/


//2. Calculate total marks
//Instance variables:
//math
//science
//english
//Print total and average.


/*
public class variables{
    int math= 100;
    int english=80;
    int science=60;

    void show(){
        int  total=math+english+science;
        int avgmarks=total/3;
        System.out.println(avgmarks);
    }
    public static void main(String[]args){
        variables v=new variables();

        v.show();
    }
}
*/




/*
13. Print student details

Instance variables: name, rollNo, marks
Create a method showDetails().*/


/*
public class variables{
    String name="harika";
    int rollno=510;
    int marks=80;

    void showdetails(){
        System.out.println("name ="+name);
        System.out.println("rollno ="+rollno);
        System.out.println("marks ="+marks);
    }public static void main(String[]args){
        variables v=new variables();
        v.showdetails();

    }
}*/


/*14. Use of static blockk

Create:

static variable

static block
Print value before and after changing inside static block*//**/




public class variables {

    static int a = 10;  // static variable

    static {
        System.out.println("before =" + a);
        a = 20; // change value
        System.out.println("after=" + a);
    }

    public static void main(String[] args) {
    }
}


