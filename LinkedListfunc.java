import java.util.List;

public class LinkedListfunc{
    private class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;


    public void display(){
    Node temp=this.head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}
public void addFirst(int data){
    Node node=new Node();  
    node.data=data;//add
   
    node.next=this.head;
    this.head=node;
    this.size++;
}
// Node node = new Node(); //Create
// node.data = data; // Adding data
// //Link
// node.next = this.head;
// //Update summary 
// this.head = node;
// this.size++;
// }


public void addLast(int data){
   
    Node node=new Node();  
    node.data=data;//add
    if(this.size==0){
        this.head=this.tail=node;
        this.size++;   
    }
    //link
    this.tail.next=node;
    node.next=null;
    //summary
    this.tail=node;
    this.size++;
    
    
   }
   public int getFirst(){
       return head.data;
   }
   
   
   public int getAt(int i)throws Exception{
    if(i>=this.size || i<0){
        throw new Exception("Index out of bounds");

    }else if(this.size==0){
        throw new Exception("Linked List is empty");
    }
        Node node=this.head;
        for(int j=0;j<i;j++){
            node=node.next;
        }
        return node.data;
    

   }
   public Node getNodeAt(int i)throws Exception{
    if(i>=this.size || i<0){
        throw new Exception("Index out of bounds");

    }else if(this.size==0){
        throw new Exception("Linked List is empty");
    }
        Node node=this.head;
        for(int j=0;j<i;j++){
            node=node.next;
        }
        return node;
    

   }

   


    public void removeFirst() throws Exception{
        if(this.size==0){
            throw new Exception("LinkedList is Empty");
        }
        this.head=head.next;
        this.size--;

        
    }
    public void removeLast()throws Exception{
        if(this.size==0){
            throw new Exception("LinkedList is Empty");
        }
        Node newtail=getNodeAt(this.size-2);
        this.tail=newtail;
        tail.next=null;
        this.size--;
    }

    public void addAt(int i,int data)throws Exception{
        if(i==0){
            this.addFirst(data);
        }else if(i==this.size){
            this.addLast(data);
        }
        Node node=new Node();
        node.data=data;
        
        Node before=this.getNodeAt(i-1);
        Node after=before.next;
        before.next=node;
        node.next=after;
        this.size++;

    }
    
    
    
    
    public void removeAt(int i)throws Exception{
        if(i==0){
            removeFirst();
        }else if(i==this.size-1){
            removeLast();
        }
        else if(i>=this.size && i<0){
            throw new Exception("Index out of bounds");
    
        }else if(this.size==0){
            throw new Exception("Linked List is empty");
        }
        Node before=getNodeAt(i-1);
        Node removeit=getNodeAt(i);
        Node after=removeit.next;
        before.next=after;
        this.size--;

    }
    public void reverseDisplay(){
        rd(this.head);
    }
        private static void rd(Node temp) {
            if(temp.next==null){
                return;
            }
            rd(temp.next);
            System.out.println(temp.data);
        }
    
    public void reverseData()throws Exception{
        int left=0;
        int right=this.size-1;
        

        if(left < right){
            
            Node leftNode=getNodeAt(left);
            Node rightNode=getNodeAt(right);
            
            int temp=leftNode.data;
            leftNode.data=rightNode.data;
            rightNode.data=temp;
            left++;
            right--;
        }
        
        
        
    }
    }    