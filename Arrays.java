import java.net.SocketTimeoutException;
import java.util.*;
public class Arrays {
    public static void main(String args[]){
      /*   int marks[]=new int[3];
        marks[0]=80;
        marks[1]=90;
        marks[2]=100;
        //System.out.println(marks[0]);
        for(int i=0;i<=2;i++){
            System.out.println(marks[i]);
        }
    int marks2[]={75,85,95};//another way of representing arrays
    for(int j=0;j<=2;j++){
            System.out.println(marks2[j]);
        } 
    
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Size");
      int sizeOfArray=sc.nextInt();
       int array1[]=new int[sizeOfArray];
       for(int i=0;i<sizeOfArray;i++){
        System.out.println("Enter Number");
        array1[i]=sc.nextInt();
       }
       System.out.println("array is");
       for(int i=0;i<array1.length;i++){
        System.out.println(array1[i]);
       }
       System.out.println("enter number to be searched");
       int searchThis=sc.nextInt();
       for(int i=0;i<array1.length;i++){       //search from 0 index to size of array - 1 index because indexing in java starts from 0
        if(array1[i]==searchThis){
            System.out.println(i);
        }  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        System.out.println("Enter col");
        int col=sc.nextInt();
        int twodarray[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.println("Enter num");
            twodarray[i][j]=sc.nextInt();
            }
        } 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(twodarray[i][j] + " ");
            }
            System.out.println();
        }*/  
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        System.out.println("Enter col");
        int col=sc.nextInt();
        int twodarray[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.println("Enter num");
            twodarray[i][j]=sc.nextInt();
            }
        } 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(twodarray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("enter number to be searched");
        int x = sc.nextInt();
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (x==twodarray[i][j]){
                    System.out.println("found at "+ i + j);
                }
            }
        }
       }
    }
    

 