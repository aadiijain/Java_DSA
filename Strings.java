import java.util.*;
public class Strings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter name");
        //String name=sc.nextLine();
        //System.out.println("Your Name is "+ name);
        //concatenation funtion
        //String a=sc.nextLine();
       // String b=sc.nextLine();
        //String c=a+b;
        //System.out.println(c);
        //System.out.println(c.length());
        //charAT
        /*for(int i=0;i<c.length();i++){
            System.out.println(c.charAt(i));
        }
        if(a.compareTo(b)==0){
            System.out.println("equal");
        }
        else if(a.compareTo(b)>0){
            System.out.println("a>b");
        }
        else{
            System.out.println("a<b");
        }*/

        //substring

      /*  String substrings = c.substring(0, 5);
       String substrings2 =c.substring(8);
       System.out.println(substrings+substrings2);        */


/* 

       //STRING BUILDER
       StringBuilder sb = new StringBuilder("Aadi");
       System.out.println(sb);
       //chat at index 0
       System.out.println(sb.charAt(0));
       //set char at index 0
       sb.setCharAt(0, 'B');
       //insert char at index 0
       sb.insert(0,'A');
       System.out.println(sb);
       //delete 
       sb.delete(1,2);
       System.out.println(sb);
       sb.append("Jain");
       System.out.println(sb);
       System.out.println(sb.length());*/

       StringBuilder sb = new StringBuilder("AadiiJain");
       for(int i=0;i<sb.length()/2;i++){
        int front = i;
        int back = sb.length()-1-i; //9-1-0 9-1-1 and so on..

        char frontChar = sb.charAt(front);
        char backChar =  sb.charAt(back);

        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);

       }
       
        System.out.println(sb);
    }
    
}
