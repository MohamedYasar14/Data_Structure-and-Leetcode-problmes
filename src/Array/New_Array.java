package Array;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class New_Array {
     public static void main(String args[]) throws NumberFormatException, IOException {
       Array1 a=new Array1(5);
       int ch;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       do {
    	   System.out.println("Enter Number 1 for Insert: ");
    	   System.out.println("Enter Number 2 for Delete: ");
    	   System.out.println("Enter Number 3 for Search: ");
    	   System.out.println("Enter Number 4 for AccessElement: ");
    	   System.out.println("Enter Number 5 for UpdateElement: ");
    	   ch=Integer.parseInt(br.readLine());
    	   switch(ch) {
    	   case 1:
    	      System.out.print("Enter the index to insert: ");
    	      int index=Integer.parseInt(br.readLine());
    	      System.out.print("Enter the element to insert: ");
    	      int element=Integer.parseInt(br.readLine());
    	      a.insert(index, element);
    	   break;
    	   case 2:
    		  System.out.print("Enter the index to delete: ");
    		  int index1=Integer.parseInt(br.readLine());
    		  a.delete(index1);
    	   break;
    	   case 3:
    		   System.out.print("Enter the Element to search: ");
    		   int element1=Integer.parseInt(br.readLine());
    		   a.search(element1);
           break;
    	   
    	   case 4:
    		   System.out.print("Enter the index to Access: ");
    		   int index2=Integer.parseInt(br.readLine());
    		   System.out.println(a.get(index2));
    	   break;  
    	   
    	   case 5:
    		  System.out.print("Enter the index to update: ");
     	      int index3=Integer.parseInt(br.readLine());
     	      System.out.print("Enter the element to update: ");
     	      int element4=Integer.parseInt(br.readLine());
     	      a.set(index3, element4);
    	      break;
    	   }
    	   
    	  a.display();
       }while(ch<6);
     }
}

class Array1{
	private int capacity;
	private int size;
	private int[] arr;
	
	public Array1(int capacity) 
	{
		this.capacity=capacity;
	    arr=new int[capacity];
	    size=0;
    }
	public boolean insert(int index,int element) {
	
		if(index<0) {System.out.println("Insert: Invalid index ,Index Must be greater than Zero");return false; }
		if(size>=capacity) {System.out.println("Insert: Invalid size,Size Must be Lesthan capacity");return false;}
		if(index>size) {System.out.println("Insert: Invalid index,Index Must be Lessthan Size");return false;}
	    for(int j=size;j>index;j--) {
	    	arr[j]=arr[j-1];
	    }
	    arr[index]=element;
	    size++;
		return true;
	}
   public void display() {
	   for(int i=0;i<size;i++) {System.out.print(arr[i]+" ");}System.out.println();System.out.println("-------------------");
	   for(int i=0;i<arr.length;i++) {System.out.print(arr[i]+" ");}System.out.println();
	   
   }
   public int get(int index) {
	   if(index>=size) {System.out.println("Insert: Invalid index,Index Must be Lessthan Size");return -99999;}
	   if(index<0) {System.out.println("Insert: Invalid index ,Index Must be greater than Zero");return -99999; }
	   
	   return arr[index];
   }
   public int set(int index, int element) {
	   if(index>=size) {System.out.println("Insert: Invalid index,Index Must be Lessthan Size");return -99999;}
	   if(index<0) {System.out.println("Insert: Invalid index ,Index Must be greater than Zero");return -99999; }
	   
	   
	   return arr[index]=element;
   }
   public boolean delete(int index) {
	   if (size<index) {System.out.println("Delete: Invalid index,Index Must be Lessthan Size");return false;}
	   for(int j=index;j<size-1;j++) {
		  arr[j]=arr[j+1];
		}
	  size--;
		   
	   
	   return true;
   }
  public void search(int element) {
	  int flag=0;
	  int i;
	  for( i=0;i<size;i++) {
		  if(arr[i]==element) { flag=1;break;}
	  }
	 // String i;
	System.out.println(flag==1?"found at "+i:"not found");
  }
}
