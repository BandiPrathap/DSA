class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedList{
	Node head;
	LinkedList(){
		head=null;
	}
	
	void insert(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	Node reverse(Node node){
		Node prev=null;
		Node current=node;
		Node next=null;
		while(current.next!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return prev;
	}
	
	boolean isPalindrome(){
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		slow=reverse(slow);
		while(slow!=null &&(slow.data==head.data)){
			head=head.next;
			slow=slow.next;
		}
		return slow!=null;
	}
	
	void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args){
		LinkedList ll=new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(1);
		
		ll.display();
		System.out.println(ll.isPalindrome());
	}
}
		