package com.dsa.LinkedList;

import java.util.Scanner;

public class executeTest {


	public static void main(String[] args) {

		LL_Manager ll_Manager = new LL_Manager();
		
		ll_Manager.createLL(5);
		
		System.out.println("PRINTING THE LIST :  \n");
		
		ll_Manager.printList();
		
		ll_Manager.insertAtLocation(3, 10);
		ll_Manager.printList();
		
		ll_Manager.insertAtLocation(5, 100);
		ll_Manager.printList();
	}

}
