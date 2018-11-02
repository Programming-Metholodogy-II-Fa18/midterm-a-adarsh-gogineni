package Problem2;

public class Data {
	
	public class Node{
		int data;
		Node next;
	}
	Node head;
	
	public Data(){
		head = null;
	}
	
	public void add(int a){
		Node last = new Node();
		last.data = a;
		last.next = null;
		if(head == null){
			head = last;
		}else{
		Node n = head;
		while(n.next!=null){
			n = n.next;
		}
		n.next = last;
		}
	}
	
	public int remove(){
		int temp = head.data;
		head = head.next;
		return temp;
	}
	public int getValue(int i){
		int temp = 0;
		int counter = 1;
		Node n = head;
		while(n!=null && counter <i){
			n = n.next;
			counter++;
		}
		temp = n.data;
		return temp;
		
	}
	
	public void print(){
		Node n = head;
		while(n!= null){
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
}
