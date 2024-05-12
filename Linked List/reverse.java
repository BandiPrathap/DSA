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
	void reverse(){
		Node prev=null;
		Node curr=head;
		Node next=null;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;			
		}
		head=prev;		
	}
    void display(){
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data +"-->");
            tmp=tmp.next;
        }
		System.out.println();
    }       
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(20);
		ll.insert(30);
        ll.insert(40);
        ll.display();
		ll.reverse();
		System.out.println("Reverse a Linked List");
		ll.display();
    }
}