class StackLinkedList<T>{
    Node top;
    
    class Node{
        T data;
        Node next;
        
        Node(T val){
            this.data=val;
            this.next=null;
        }
    }
    
    StackLinkedList(){
        top=null;
    }
    
    void push(T val){
        Node newNode = new Node(val);
        newNode.next=top;
        top=newNode;
    }
    
    void pop(){
        if(top==null){
            throw new IndexOutOfBoundsException("stack is empty");
        }
        top=top.next;
    }
    
    void display(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		StackLinkedList<Integer> s = new StackLinkedList<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		s.pop();
		s.pop();
		System.out.println();
		s.display();
	}
}














