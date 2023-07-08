/* //Implementation of Queue Using Array
public class QueueClass {
    static class Queue{
        static int arr[];//static to use it in other dunctions
        static int size;
        static int rear = -1; // no need to define front as it is defined already by default
        Queue(int size){
            arr = new int[size];
            this.size = size;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //Enqueue
        public static void add(int data){
                 if(rear == size-1){ //rear reached at last index
                    System.out.println("Full Queue");
                    return;
                 }
                 rear++;
                 arr[rear] = data;
        }
        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);//object of queue class
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/
/*public class QueueClass {//implementing circular queue using array
    static class Queue{
        static int arr[];//static to use it in other dunctions
        static int size;
        static int front = -1;
        static int rear = -1; 
        Queue(int size){
            arr = new int[size];
            this.size = size;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            return(rear+1)%size==front;
        }
        //Enqueue
        public static void add(int data){
                 if(isFull()){ //rear reached at last index
                    System.out.println("Full Queue");
                    return;
                 }
                 //1st element add
                 if(front == -1){
                    front = 0;
                 }
                 rear=(rear+1)%size;
                 arr[rear] = data;
        }
        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front];
            //single element condition
           if(rear == front){
            rear = front = -1;
           } else {
            front = (front+1)%size;
           }
            return result;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);//object of queue class
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/
/*  public class QueueClass {//implementing queue using linked list
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
       
        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //Enqueue
        public static void add(int data){
                 Node newNode = new Node(data);
                 if(isEmpty()){
                    tail = head = newNode;
                    return;
                 }
                 tail.next = newNode;
                 tail=newNode;
        }
        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();//object of queue class
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/
/*import java.util.*; //implementing queue using java collection framework

 public class QueueClass {
    public static void main(String[] args) {
        //Queue<Integer> q = new LinkedList<>();//here linkedlist is class Queue is interface  //interface ke objects nahi ban rahe
        Queue<Integer> q = new ArrayDeque<>(); //only cache difference in memory cones in ArraDeque vs LinkedList
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}*/
//Question - Implement Queue using 2 stacks to convert lifo of stack to fifo of queue
//It could be the two cases either Push operation takes O(n) time or pop operation(hence peek as well) takes O(n) time  we will go with former here
import java.util.*;
public class QueueClass {
   static class Queue {
       static Stack<Integer> s1 = new Stack<>();
       static Stack<Integer> s2 = new Stack<>();


       public static boolean isEmpty() {
           return s1.isEmpty();
       }


       public static void add(int data) {
           while(!s1.isEmpty()) {
               s2.push(s1.pop());
           }
           s1.push(data);
           while(!s2.isEmpty()) {
               s1.push(s2.pop());
           }
       }


       public static int remove() {
           return s1.pop();
       }


       public static int peek() {
           return s1.peek();
       }
   }
   public static void main(String args[]) {
       Queue q = new Queue();
       q.add(1);
       q.add(2);
       q.add(3);
       while(!q.isEmpty()) {
           System.out.println(q.peek());
           q.remove();
       }
   }
}
