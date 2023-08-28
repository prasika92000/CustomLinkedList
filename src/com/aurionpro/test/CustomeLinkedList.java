package com.aurionpro.test;

import java.util.LinkedList;
import java.util.ListIterator;

public class CustomeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> list1 = new LinkedList<String>();
	        System.out.println("Addition Operation on linked list : ");
	        list1.add("10");
	        list1.add("20");
	        list1.add("30");
	        list1.add("40");
	        list1.add("50");
	        list1.addFirst("Adding at first position : "+"101");
	        list1.addLast("Adding at last position : "+"999");
	        list1.add(3, "At middle position : 555");
//	        System.out.println(list);
	        for (String x : list1) {
	    		 System.out.println(x);
	  }
	        System.out.println("*******************************************************");
	        
	        System.out.println("Iteration :");
	        ListIterator<String> iterator = list1.listIterator();
	        while (iterator.hasNext()) {
	            System.out.print(iterator.next() + "\n");
	        }
	       
	        System.out.println("*******************************************************");
	        System.out.println(" Updation of linked list : ");
	        list1.set(2, "250");
	        System.out.println(list1 +"\n");
	       
	        System.out.println("*******************************************************");
	        System.out.println("Deletion operation in linked list : ");
	        list1.remove("40");
	        list1.remove(3);
	        list1.removeFirst();
	        list1.removeLast();
	        System.out.println(list1);
	}

}
