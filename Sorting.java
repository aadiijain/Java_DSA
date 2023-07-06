import java.util.*;
public class Sorting {
  public static void printArray(int array[]){
    for(int i=0;i<array.length;i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
    public static void main (String args[]){
      //Bubble Sort
      //worst case time complexity = O(n^2)
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter length of array");
      int n = sc.nextInt();
      int array[] = new int[n];
      for (int i=0; i <= n-1; i++){
          System.out.println(" Enter Number");
          array[i] = sc.nextInt();
      }
      /*for (int i=0;i<array.length-1;i++){
        for(int j=0;j<array.length-1-i;j++){
          if(array[j]>array[j+1]){
            int temp = array[j];
            array[j]=array[j+1];
            array[j+1]=temp;
          }         
        }
         printArray(array);
      }
      //SELECTION SORT
      //time complexity = O(n^2)
      for(int i = 0; i<array.length-1;i++){
           int smallest = i;
           for(int j=i+1; j<array.length;j++){
            if(array[smallest]>array[j]){
              smallest=j;
            }
               
           }
           int temp = array[smallest];
            array[smallest]=array[i];
            array[i]=temp;   
           printArray(array);
      }*/
      //INSERTION SORT
      //Time Complexity = O(nlogn)
      for(int i=1;i<array.length;i++){
        int current = array[i];
        int j = i-1;
        while(j >= 0 && current < array[j]){
          array[j+1]=array[j];
          j--;
        }
        array[j+1]=current;
      }
      printArray(array);
    }
}
