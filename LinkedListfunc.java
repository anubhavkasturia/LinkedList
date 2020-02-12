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
    head=node;
    this.size++;
}


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
    if(i>=this.size && i<0){
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
    if(i>=this.size && i<0){
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

   


    public void removeFirst(){
        Node after=head.next;
        this.head=after;
    }
    public void removeLast()throws Exception{
     Node before=getNodeAt(this.size-2);
     before.next=null;
     
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
        }else if(i==this.size){
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
    }