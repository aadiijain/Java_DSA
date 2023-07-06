import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
       ArrayList<Integer> Alist = new ArrayList<>(); 
       //Add an Element one after the other
       Alist.add(0);
       Alist.add(2);
       Alist.add(3);
       Alist.add(5);
       Alist.add(4);
       System.out.println(Alist);
       // Get an Element
       System.out.println(Alist.get(2));
       //Add an Element in between
       Alist.add(1,1);
       System.out.println(Alist);
       //Set an already existing element
       Alist.set(0, -1);
       System.out.println(Alist);
       //Remove an Element
       Alist.remove(0);
       System.out.println(Alist);
       //Size of the ArrayList
       System.out.println(Alist.size());
       //Loops in Arraylist
       for(int i=0;i<Alist.size();i++){
        System.out.println(Alist.get(i));
       }
       //Sorting
       Collections.sort(Alist); //Collection is class with sort function
       System.out.println(Alist);
    }
}
