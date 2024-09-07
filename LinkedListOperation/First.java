package com.LinkedListOperation;
import java.util.ArrayList;
public class First {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    Node head;
    ArrayList<Node> listOfSumNodes = new ArrayList<>();

    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public Node sumByListWise(Node temp){
        int sum = 0;
        while(temp!=null && temp.data!=0){
           
                sum +=temp.data;
                temp = temp.next;
            
        }
        if(sum==0)
        return temp;
        Node newNode = new Node(sum);
        listOfSumNodes.add(newNode);
        return temp;
    }
    public void sum(){
      //  int sum = 0;
        if(head==null){
            Node newNode = new Node(0);
           listOfSumNodes.add(newNode);
           return;
        }
        Node temp= head;
        while (temp!=null){
            temp=temp.next;
            temp=sumByListWise(temp);
        }
    }
    public void displaySimpleNode(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void displaySumNode(){
        for(Node node : listOfSumNodes){
            Node temp = node;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            // System.out.println();
        }
    }
   public static void main(String[] args) {
    
    First obj = new First();
    obj.insert(0);
    obj.insert(1);
    obj.insert(2);
    obj.insert(0);
    obj.insert(3);
    obj.insert(3);
    obj.insert(3);
    obj.insert(0);
    obj.insert(4);
    obj.insert(5);
    obj.insert(0);
    System.out.println("Simple Node :");
    obj.displaySimpleNode();
    obj.sum();
    System.out.println("Sum of two 0's in-between sum of Nodes of List :");
    obj.displaySumNode();
    
   } 
}
