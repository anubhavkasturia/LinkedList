import java.util.LinkedList;

public class client{


public static void main(String args[]) throws Exception{
   LinkedListfunc list=new LinkedListfunc();
   // list.addFirst(10);
   // list.addFirst(12);
   // list.addFirst(2);
   list.addLast(20);
   
   // list.getFirst();
   // System.out.println(list.getAt(1));
   // list.removeFirst();
   // list.removeAt(2);
   list.addAt(1, 3);
   list.display();
   

   }  
}  
