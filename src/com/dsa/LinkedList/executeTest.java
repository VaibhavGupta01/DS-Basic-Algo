package com.dsa.LinkedList;

public class executeTest {


	public static void main(String[] args) {

		LL_Service ll_service = new LL_Service();
		
		ll_service.createLL(5);
		
		System.out.println("PRINTING THE LIST :  \n");
		
		ll_service.printList();
		
		ll_service.insertAtLocation(3, 10);
		ll_service.printList();
		
		ll_service.insertAtLocation(5, 100);
		ll_service.printList();
	}

}