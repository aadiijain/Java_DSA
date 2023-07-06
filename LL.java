//import java.util.LinkedList; //to directly access all functions instead of creating them
//import java.util.Scanner;
public class LL {
    //  CREATING EVERY FUNCTION FROM SCRATCH
    //Array List has "Insert" time complexity O(n) and "Search" Time Complexity O(1) WHEREAS linkedlist have insert time complexity O(1) but search time complexity O(n) and both have Memory allocated no contiguous. 
    //hence when manipulation operation are more we use linkedlist and when search operation are more we use arraylist
    Node head;
    private int size; //to keep track of size of list

    LL(){  //constructor
        this.size = 0; //initializing with 0
    }
    class Node{
        int data;
        Node next;
        Node(int data){ //Constructor
            this.data = data;
            this.next = null;
            size++; //increasing size with eaxh new node getting created
        }
    }
    //add - at first position
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        //otherwise
        newNode.next=head; //pointing newNode's next towards current head
        head = newNode;//then giving head to new node
    }
    //add - at last position
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }//Otherwise
        Node currNode = head;
        while(currNode.next!= null){ //traversing till the last
            currNode = currNode.next; 
        }
        currNode.next = newNode;     
    }
    //printing a linked list
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println(". NULL reached");
    }
    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        size--; //reduing size each time a node is deleted
        head = head.next; //made the second element as head hence first on taken forever by garbage collector of java
    }
    public void deleteLast(){
        if(head == null){// case of empty list
            System.out.println("empty list");
            return;
        }
        size--; //reduing size each time a node is deleted
        if(head.next == null){//case of single node
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode=lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null; //step to delete last element
    }
     //get size function
     public int getSize(){
        return size;
     }

     //REVERSING A LINKED LIST
     public void reverseIterate(){
         if(head == null||head.next==null){
                    return;
                }
            Node prevNode = head;
            Node currNode = head.next;
            while(currNode!= null){
                Node nextNode = currNode.next;
                currNode.next/*curren node ka next*/ = prevNode;
                //Update
                prevNode=currNode;
                currNode=nextNode;
            }
            head.next = null;
            head = prevNode;
     }

     public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
     }
    public static void main(String[] args) {
        /*LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("this");
        System.out.println(list.getSize());*/
        
        //USING EACH OF ABOVE FUNCTION USING COLLECTION FRAMEWORK DIRECTLY FOR FASTER APPROACH

       /*  LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");
        //list.add( "last by default added in the end if we use just add");
        System.out.println(list);

          list.add(1,"a");
    System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");//using get function to print all elements one after the other
        }   
    System.out.println("null");  */
/*Scanner sc = new Scanner(System.in);
String value = sc.nextLine();
      for(int i=0;i<list.size();i++){
        if(value==list.get(i)){
            System.out.print(i);
        }  
        else {
            System.out.println("not found");
        }
    }*/
    /*list.removeFirst(); 
    System.out.println(list);

    list.removeLast();
    System.out.println(list);

    list.remove(1);
    System.out.println(list);*/

    //REVERSING A LINKED LIST
    LL list = new LL();
    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.printList();

    //list.reverseIterate();
    //list.printList();

    list.head = list.reverseRecursive(list.head);
    list.printList();
   
}
}
