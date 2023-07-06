import java.util.*;
import javax.swing.text.Position;
public class BitManupulation {
    public static void main(String args[]){
        //get bit set bit clear bit and update bit operation
        //position of bits calculated from right to left
        //bitmasking is process of bit manipulation using  a new number called as but mask
        //getbit operation
        int n = 5; // 5 :- 0101
        int i = 2;
        int bitMask = 1<<i;
        if((bitMask&n)==0){
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit is 1");
        }
        //set bit operation
        int n2 = 5; // 5 :- 0101
        int i2 = 1;
        int bitMask2 = 1<<i2;
        int newBit = bitMask2|n2;
        System.out.println(newBit);
        //clear bit operation
        int n3 = 5; // 5 :- 0101
        int i3 = 2; //any position you want to clear
        int bitMask3 = 1<<i3;
        int notBitMask3 = ~(bitMask3);
        int newBit3 = notBitMask3&n3;
        System.out.println(newBit3);
        //update bit
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int updateOperation = sc.nextInt();
        int Position = sc.nextInt();
        int bitMask4=1<<Position;
        if (updateOperation == 0){                             //clear operation
            int notBitMask=~(bitMask4);
            int newnumber = notBitMask|number;
            System.out.println(newnumber);
        }
        else{                                                //set operation
            int newnumber = bitMask4|number;
            System.out.println(newnumber);
        }
        }
}