import java.util.Scanner;

public class Functions {

   
    /*public static int sumOfOdd(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i % 2 != 0){
            sum = sum + i;
            } 
        }
       return sum;
    }
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
public static int addition(int a,int b){
   int sum = a + b;
   return sum;
}

public static int multiply(int a,int b){
    int mul=a*b;
    return mul;
}

public static int factorial(int n){
    int factorial=1;
    for(int i=n;i>=1;i--) {
        factorial=factorial*i;
       
    }
    
     return factorial;
}/* */
public static  void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0;
int b=1;

 for(int i=2;i<=n;i++){
    System.out.print(b+" ");
         int temp = b;
         b = a + b;
         a = temp;
 }

        System.out.println();
}
}
    
/* System.out.println("enter n");
int n = sc.nextInt();
System.out.println("sum is "+ sumOfOdd(n));
System.out.println("enter name");
String name=sc.nextLine();
printMyName(name);
System.out.println("enter n1");
int a = sc.nextInt();
System.out.println("enter n2");
int b = sc.nextInt();
int sum = addition(a, b);
System.out.println("sum is" + sum );
int mul=multiply(a, b);
System.out.println("multiplication is"+ mul);
System.out.println("enter number");
int n = sc.nextInt();
System.out.println("factotial of number is"+factorial(n));
*/

