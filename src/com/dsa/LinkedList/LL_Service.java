package com.dsa.LinkedList;

public class LL_Service {

	LL_node head = null;
	
	public void createLL(int n){
		if(head == null) {
			LL_node current = head;
			
			for (int count=1; count <= n; count++) {
				LL_node newNode = new LL_node();
				newNode.data = count;
				
				if(count==0) {
					current = newNode;
					head = current;
				}else {
					current.nextNode = newNode;
					current = current.nextNode;
				}
			}
		}else{
			System.out.println("Linked List already present. New List not created.");
		}
	}
	
	public void insertAtLocation(int loc, int data){
		int currentPos = 2;
		LL_node current = head;
		
		while(currentPos < loc && current != null) {
			current = current.nextNode;
			currentPos++;
		}
		
		if(currentPos == loc) {
			LL_node newNode = new LL_node();
			newNode.data = data;
			
			newNode.nextNode = current.nextNode;
			current.nextNode = newNode;
		}
	}
	
	public void printList(){
		LL_node current = head;
		while(current != null) {
			System.out.printf("""
					NODE DATA IS : %s%n""", current.data);
			current = current.nextNode;
		}
		
		System.out.println("--- END--- \n\n");
	}
}