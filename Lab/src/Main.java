
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	  
	  public static void main (String[] args) throws java.lang.Exception{
	    
	    MyLinkedList obj = new MyLinkedList();
	    obj.addAtHead(10);
	    obj.addAtHead(7);
	    obj.addAtHead(4);
	    obj.printList();
	    
	    obj.sortedInsert(2);
	    obj.sortedInsert(5);
	    obj.sortedInsert(15);
	    obj.printList();
	    
	  }
	  
	  public static class MyLinkedList {
	    
	      class Node{
	          Node next = null;
	          int val = 0;
	          
	          public Node(int val){
	              this.val = val;
	          }
	      }
	      private Node head;
	      private int size;
	      public MyLinkedList() {
	          this.head = null;
	          this.size = 0;
	      }
	      
	      public Node getNodeAt(int index){
	          Node curr = head;
	          while(index-- > 0){
	              curr = curr.next;
	          }
	          
	          return curr;
	      }
	      
	      public void addAtHead(int val) {
	          Node node = new Node(val);
	          if(this.size == 0){
	              this.head = node;
	          }
	          else{
	              node.next = this.head;
	              this.head = node;
	          }
	          this.size++;
	      }
	      public void sortedInsert(int val) {
	          Node newNode = new Node(val);
	          Node previous = null;
	          Node current = head;
	  
	          while (current != null && val > current.val) {
	              previous = current;
	              current = current.next;
	          }
	  
	          newNode.next = current;
	      if (previous == null)
	          head = newNode;
	      else
	          previous.next = newNode;
	  
	      }
	    public void printList(){
	      Node curr = head;
	      while(curr!=null){
	        System.out.print(curr.val+" ");
	        curr = curr.next;
	      }
	      System.out.println("");
	    }
	      
	  }
	}
	      

