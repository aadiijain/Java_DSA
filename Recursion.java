import java.util.Scanner;
import java.util.HashSet;
import java.util.*;
public class Recursion {
    /*public static void recursivePrint(int n){
        if (n==6){
            return;
        }
        else{
            System.out.println(n);
            recursivePrint(n+1); //recursion
        }
    }
    public static void recSum(int i,int n, int sum){
      if(i==n){
        sum = sum + i;
        System.out.println(sum);
        return;
      }
      sum = sum + i;
      recSum(i+1, n, sum);
       System.out.println(i);
    }
    public static int recFac(int n){
      if(n == 1 || n == 0){
        return 1;
      }
      int factNMinus1 = recFac(n-1);
      int factN = n*factNMinus1;
      return factN;
    }
    public static void recFib(int a, int b, int n){
       if(n==0)
       {
        return;
       }
       int c = a + b;
       System.out.println(c);
       recFib(b, c, n-1);
    }
    public static int recPower(int x,int n){
      if (n==0){
        return 1;
      }
      else if(x==0){
        return 0;
      }
      int xpownminus1 = recPower(x, n-1);
      int xpown = x*xpownminus1;
      return xpown;
    }
    public static int recPower(int x,int n){
      if (n==0){
        return 1;
      }
      else if(x==0){
        return 0;
      }
      if(n%2==0){
        return recPower(x, n/2)*recPower(x, n/2);
      }
      else{
        return recPower(x, n/2)*recPower(x, n/2)*x;
      }
    }
    public static void towerOfHanoi(int n,String source,String helper,String destination){
       if(n==1){
       System.out.println("Transfer Disk "+n+" from "+source+" to "+destination);
       return;
       }
       towerOfHanoi(n-1, source, destination,helper); //Time Complexity = O(2^n)
       System.out.println("Transfer Disk "+n+" from "+source+" to "+destination);
       towerOfHanoi(n-1, helper, source, destination);
    }
    public static void printReverse(String str,int index){ //Time Complexity = O(n)
      if(index==0){
        System.out.println(str.charAt(index));
        return;
      }
      System.out.print(str.charAt(index));
      printReverse(str, index-1);
    }
    // First and last occurence of a character in a string
    public static int firstOccurence = -1; //creating static variables in java
    public static int lastOccurence = -1;
    public static void findFirstAndLastOccurence(String str, int index, char element){
      if(index==str.length()){
        System.out.println(firstOccurence);
        System.out.println(lastOccurence);
        return;
      }
      char currentCharacter = str.charAt(index);
      if(currentCharacter == element){
        if(firstOccurence == -1){
          firstOccurence = index;
        } else {
          lastOccurence = index;
        }
      }
      findFirstAndLastOccurence(str,index+1,element);

    }
    public static boolean isSorted(int array[], int index){ //time complexity O[n]
      if(index == array.length-1){
        return true;
      }
      if(array[index]<array[index+1]){
        return isSorted(array, index+1);
      }else{
        return false;
      }
    }
    public static void moveAllXBackwards(String str, int index, int count, String newString){ //time complexity = O(n) where n = string length
      if(index == str.length()){
        for(int i=1;i<=count;i++){
          newString = newString + 'x';
        }
        System.out.println(newString);
        return;
      }
      char currentCharacter = str.charAt(index);
      if(currentCharacter=='x'){
        count = count + 1;
        moveAllXBackwards(str, index+1, count, newString);
      }else{
        newString= newString+currentCharacter;
        moveAllXBackwards(str, index+1, count, newString);
      }
    }
    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str, int index, String newStr){
      if(index == str.length()){
        System.out.println(newStr);
        return;
      }
      char currentCharacter = str.charAt(index);
      if(map[currentCharacter-'a']){
        removeDuplicate(str, index+1, newStr);
      }else{
        newStr += currentCharacter;
        map[currentCharacter-'a']=true;
        removeDuplicate(str, index+1, newStr);
      }
    }
    //IMPORTANT QUESTION ------ PRINT SUBSEQUENCE OF A STRING i.e. CHARACTERS OCCURING OR NOT BUT IN SAME ORDER
    public static void subSequence(String str,int index, String newString ){ //Time Complexity = O(2^n) where n = length of string
      if(index == str.length()){
        System.out.println(newString);
        return;
      }
      char currentCharacter=str.charAt(index);
      subSequence(str, index+1, newString+currentCharacter);
      subSequence(str, index+1, newString);
    }
    //Using Hashset to print unique subsequence
    public static void subSequence(String str,int index, String newString, HashSet<String> set){ //Time Complexity = O(2^n) where n = length of string
      if(index == str.length()){
        if(set.contains(newString)){
          return;
        }else{
          System.out.println(newString);
          set.add(newString);
          return;
        }
      }
      char currentCharacter=str.charAt(index);
      subSequence(str, index+1, newString+currentCharacter,set);
      subSequence(str, index+1, newString,set);
    }
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"}; //mappping done as per question
    public static void printCombination(String str,int index, String combination){
      if(index == str.length()){
      System.out.println(combination);
      return;
    }
    char currentCharacter = str.charAt(index);
    String mapping = keypad[currentCharacter-'0'];
    for(int i = 0;i<mapping.length();i++){
      printCombination(str, index+1, combination+mapping.charAt(i));
    }
  }
  public static void permutationOfAString(String str, String permutation){//Time Complexity = O(n!)
    if(str.length()==0){
      System.out.println(permutation);
      return;
    }
    for(int i=0;i<str.length();i++){
      char currentCharacter=str.charAt(i);
      String newStr=str.substring(0, i)+str.substring(i+1,str.length());
      permutationOfAString(newStr, permutation+currentCharacter);
    }
  }
  public static int countPathsOfAMaze(int i,int j,int n,int m){//condition that we can only move rightwards and downwards
    if(i==n||j==m){ //boundary condition
      return 0;
    }
    if(i == n-1 && j == m-1){ //destination condition
      return 1;
    }
    int downPaths = countPathsOfAMaze(i+1, j, n, m);
    int rightPaths = countPathsOfAMaze(i, j+1, n, m);
    return downPaths+rightPaths;
  }
  //PLACE TILES OF SIZE 1Xm IN A FLOOR OF SIZE nXm
  public static int placeTiles(int n,int m){
    if(n==m){
      return 2; //two ways
    }
    if(n<m){
      return 1;//one way
    }
    int verticalPlacements = placeTiles(n-m, m);
    int horizontalPlacements = placeTiles(n-1,m);
    return verticalPlacements+horizontalPlacements;
  }
  public static int callGuests(int n){
    if(n<=1){
      return 1;
    }
    int singleWay = callGuests(n-1); 
    int pairWay= (n-1)*callGuests(n-2); //finding a pair out of
    return singleWay+pairWay;
  }*/
  //subsets of a set of first n natural numbers
  public static void printSubset(ArrayList<Integer> subset){//Time complexity O(2^n)
    for(int i=0;i<subset.size();i++){
      System.out.print(subset.get(i)+" ");
    }
    System.out.println();
  }
  public static void findSubsets(int n,ArrayList<Integer> subset){
    if(n==0){
      printSubset(subset);
      return;
    }
    subset.add(n);
    findSubsets(n-1, subset);
    subset.remove(subset.size()-1);
    findSubsets(n-1, subset);
  }

    public static void main(String[] args){
    /*  int n = 1;
     recursivePrint(n);*/
     Scanner sc = new Scanner(System.in);
    // System.out.println("enter n");
    /* int n = sc.nextInt();
    recSum(1,n,0);
    int n = sc.nextInt();
    int ans = recFac(n);
    System.out.println(ans);
    int n = sc.nextInt();
    int a = 0;
    int b = 1;
    System.out.println(a);
    System.out.println(b);
    recFib(a, b, n-2);
    System.out.println("enter x");
    int x = sc.nextInt();
    System.out.println("enter n");
    int n = sc.nextInt();
    int ans = recPower(x, n);
    System.out.println(ans);
    System.out.println("enter x");
    int x = sc.nextInt();
    System.out.println("enter n");
    int n = sc.nextInt();
    int ans = recPower(x, n);
    System.out.println(ans); 
    System.out.println("enter n");
    int n = sc.nextInt();
    towerOfHanoi(n, "S", "H", "D");
    String str = sc.nextLine();
    int index=str.length();
    printReverse(str,index-1);
    System.out.println("enter str");
    String str = sc.nextLine();
    System.out.println("enter element");
    char element = sc.next().charAt(0);
    findFirstAndLastOccurence(str,0,element);
    System.out.println("Enter array length");
    int n = sc.nextInt();
    int array[] = new int[n];
    for(int i = 0;i<=array.length-1;i++){
      System.out.println("enter element");
      array[i]=sc.nextInt();
    }
    System.out.println(isSorted(array, 0));
    System.out.println("enter string");
    String str = sc.nextLine();
    moveAllXBackwards(str, 0, 0, "");
    System.out.println("enter str");
    String str = sc.nextLine();
    removeDuplicate(str, 0,"");
    System.out.println("enter string");
    String str = sc.nextLine();
    subSequence(str, 0,"");
    System.out.println("enter string");
    String str = sc.nextLine();
    HashSet<String> set = new HashSet<>();
    subSequence(str, 0,"",set);
    System.out.println("Enter");
    String str = sc.nextLine();
    printCombination(str, 0, "");
    System.out.println("enter string");
    String str = sc.nextLine();
    permutationOfAString(str,"");
    System.out.println("enter n,m");
    int n = sc.nextInt();
    int m = sc.nextInt();
    int totalPaths = countPathsOfAMaze(0, 0, n, m);
    System.out.println(totalPaths)
    System.out.println("enter n,m");
    int n = sc.nextInt();
    int m = sc.nextInt();
    System.out.println(placeTiles(n, m));
    System.out.println("enter n ");
    int n = sc.nextInt();
    System.out.println(callGuests(n));*/
    int n = sc.nextInt();
    ArrayList<Integer> subset = new ArrayList<>();
    findSubsets(n, subset);
    }
}
