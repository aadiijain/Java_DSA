/*import java.util.*;
import java.util.ArrayList;
import java.util.Stack;

public class StackClass {
    /* Implementation of Stack Using LINKED_LIST
    static class Node{
        int data;
        Node next;
        public Node(int data){ //constructor and initialization of data and next
            this.data = data;
            next = null; 
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){ //to check is LinkedList is empty or not
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }*/
    //Implementation of Stack Using ARRAYLIST
    /*static class Stack{ //making this class static to directly use it in main function
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
          if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);  
        }
    }*/
    /* 
    public static void main(String[] args) {
        //Stack s = new Stack();//Implementaion from scratch using linkedlist or array list
        Stack<Integer> s = new Stack<>();//Direct Implementation Using Stack framework
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}    */
/*import java.util.*;
//To push an element at the bottom of a stack
public class StackClass {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtBottom(stack, 4);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}*/

//Reverse a Stack
import java.util.*;
//Code to Reverse a Stack

public class StackClass {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }

    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
