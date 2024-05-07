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
            Node tmp=head;
            while(tmp.next!=null){
                tmp=tmp.next;
            }
            tmp.next=newNode;
        }
    }
    void display(){
        Node tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data +"-->");
            tmp=tmp.next;
        }
    }
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.insert(10);
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.display();

    }
}