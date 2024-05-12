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
	int middle(){
		
		if head.next==null{
			return head.next;
		}
		
		Node fast=head;
		Node slow=head;
		
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow.data;		
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
		ll.insert(50);
        ll.display();
		System.out.println(ll.middle());
		
    }
}