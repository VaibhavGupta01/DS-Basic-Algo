package com.dsa.LinkedList;

public class LL_Manager {

	LL_node head = null;
	
	public void createLL(int n){
		if(head == null) {
			int count=0;
			LL_node current = head;
			
			for (int i=0; i < n; i++) {
				LL_node newNode = new LL_node();
				newNode.data = count;
				
				if(i==0) {
					current = newNode;
					head = current;
				}else {
					current.nextNode = newNode;
					current = current.nextNode;
				}
				
				count++;
			}
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
			System.out.println("NODE DATA IS : " + current.data);
			current = current.nextNode;
		}
		
		System.out.println("--- END--- \n\n");
	}
	
	
	public static void main(String[] args) {
		
		
	}
}