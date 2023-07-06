import java.util.*;
public class Patterns {
    public static void main(String args[]){
        /* 
        //making of 4X5 rectangle
    for (int i=1;i<=4;i++) //outer loop for 4 vertical stars
    {
        for(int j=1;j<=4;j++)
        {
         System.out.print("*");//inner loop for 5 horizontal stars
        }
     System.out.println("*");
    }
} 
Scanner sc=new Scanner(System.in);
System.out.println("Enter length of rectangle");
int l=sc.nextInt();
System.out.println("Enter breadth of rectangle");

int b=sc.nextInt();
for (int i=1;i<=l;i++) //outer loop for 4 vertical stars
    {
        for(int j=1;j<=b-1;j++)
        {
         System.out.print("*");//inner loop for 5 horizontal stars
        }
     System.out.println("*");
    }
    Scanner sc=new Scanner(System.in);
System.out.println("Enter length of rectangle");
int l=sc.nextInt();
System.out.println("Enter breadth of rectangle");
//building a hollow rectangle
int b=sc.nextInt();
for (int i=1;i<=l;i++) //outer loop 
    {
        for(int j=1;j<=b;j++)
        {
            if (i==1||j==1||i==l||j==b){
         System.out.print("*");//inner loop
            }
            else{
                System.out.print(" ");
            }
        }
     System.out.println();
    }
    //building a right angled triange/semi pyramid
    *
    **
    ***
    ****
    Scanner sc=new Scanner(System.in);
System.out.println("Enter length of rectangle");
int l=sc.nextInt();
System.out.println("Enter breadth of rectangle");
int b=sc.nextInt();
for (int i=1;i<=l;i++) //outer loop 
    {
        for(int j=1;j<=b;j++)
        {
            if (i==j||i>j){
         System.out.print("*");//inner loop
            }
            else{
                System.out.print(" ");
            }
        }
     System.out.println();
    }
    //alternatively
  Scanner sc=new Scanner(System.in);
System.out.println("Enter length of rectangle");
int l=sc.nextInt();
System.out.println("Enter breadth of rectangle");
int b=sc.nextInt();
for (int i=1;i<=l;i++) //outer loop 
    {
        for(int j=1;j<=i;j++)
        {
         System.out.print("*");
        }
     System.out.println();
    }  
    //inverted half pyrammid
      Scanner sc=new Scanner(System.in);
System.out.println("Enter length of rectangle");
int l=sc.nextInt();
System.out.println("Enter breadth of rectangle");
int b=sc.nextInt();
for (int i=l;i>=1;i--) //outer loop 
    {
        for(int j=1;j<=i;j++)
        {
         System.out.print("*");
        }
     System.out.println();
    }  
    //inverted half pyrammid rotated by 180 degrees
        Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();

for (int i=1;i<=n;i++) //outer loop 
    {
        for(int j=1;j<=n-i;j++)
        {
         System.out.print(" ");
        }

        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
     System.out.println();
    }
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
int n=sc.nextInt();

for (int i=1;i<=n;i++) //outer loop 
    {
        for(int j=1;j<=i;j++)
        {
         System.out.print(j);
        }
     System.out.println();
    } 
      Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
int n=sc.nextInt();

for (int i=1;i<=n;i++) //outer loop 
    {
        for(int j=1;j<=n-i+1;j++)
        {
         System.out.print(j);
        }
     System.out.println();
    } 
    //floyd's triangle
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
int n=sc.nextInt();
int number=1;

for (int i=1;i<=n;i++){
    for (int j=1;j<=i;j++)
    {
        System.out.print(number+" ");
        number++;
    }
    System.out.println();
}
  Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
int n=sc.nextInt();


for (int i=1;i<=n;i++){
    for (int j=1;j<=i;j++)
    {
        int s=i+j;
        if(s%2==0){
        System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
    System.out.println();
}



//Advanced Patterns

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*"); 
    }
    int spaces = 2*(n-i);
    for(int j=1;j<=spaces;j++){
        System.out.print(" ");
    }

    for(int j=1; j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*"); 
    }
    int spaces = 2*(n-i);
    for(int j=1;j<=spaces;j++){
        System.out.print(" ");
    }

    for(int j=1; j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
} 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=n;j++){
        System.out.print("*");
    }
    System.out.println();
} */
/*Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print(i + " ");
    }
    System.out.println();
}
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++)
    {
        System.out.print(" ");
    }
    for(int j=i;j>=1;j--){
        System.out.print(j);
    }
    for(int j=2;j<=i;j++){
        System.out.print(j);
    }
    System.out.println();
}*/
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i=n;i>=1;i--){
    for(int j=1;j<=n-i;j++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}
}
}
