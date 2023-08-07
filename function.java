//import java.util.*;
public class function {
    /*public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        System.out.println("enter your name=");
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        printMyName(name);
    }
    */

    // SUm of two numbers

    /* public static int calculate(int x, int y){
        int sum=x+y;
        return sum;
        
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
                System.out.println("enter the  first number");

        int x=sc.nextInt();
                System.out.println("enter the second number");

        int y=sc.nextInt();
        int sum=calculate(x,y);
        System.out.println("sum of two number is="+sum);
    }
    

    // product of two numbers

    public static int calculate(int x, int y){
        int multiply=x*y;
        return multiply;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
                System.out.println("enter the  first number");

        int x=sc.nextInt();
                System.out.println("enter the second number");

        int y=sc.nextInt();
        int multiply=calculate(x,y);
        System.out.println("multiply of two number is="+multiply);

    }
    */

    // factorial of number
    public static int factorial(int n){
        int fact=1;
        for(int i=n; i>=1; i--);{
            fact=fact*n;
        }
        System.out.println(fact);
        return fact;
    }
}

   /* 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        factorial(n);
    
    } 
    */








    