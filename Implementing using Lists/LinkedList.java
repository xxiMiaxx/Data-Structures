public class LinkedList<T> implements List<T>{
   private Node<T> head;
   private Node<T> current;



   public LinkedList(){
    head = current = null;
   
   }
   
   public boolean empty(){ 
      return head == null;
}
   public boolean last(){
      return current.next==null;
   }
   
   public boolean full(){
   return false;}
   
   public void findFirst(){
      current = head;
   }
   public void findNext(){
      current = current.next;
   }
   public T retrieve(){
      return current.data;
   }
   public void update(T val){
      current.data = val;
   }
   public void insert(T val){
   
      Node<T> tmp;
      
      if(empty()){
      current = head = new Node<T>(val);
      }else {
   
         tmp = current.next;//saved the next pos so we dont lose the rest of the list in the memory
         current.next= new Node<T>(val);
         current = current.next;
         current.next = tmp;
         
   }
   }
   public void remove(){
      if(current==head){
      head = head.next;
      }else{
      
         Node<T> tmp=head;
         
         while(tmp.next!= current)
            tmp=tmp.next;
      
      tmp.next= current.next;
      
      
      
      }
      if(current.next==null)
      current = head;
      else
      current= current.next; // we can move forward and go to the next node but we cant go back
   
   
   
   
   }
   
   public int length(){
       int len=0;
       if(head==null)
       return len;
       
       
       Node<T> tmp = head;
       while(tmp.next != null){
       tmp = tmp.next;
       len++;
       }
       tmp = tmp.next;
       len++;
      return len;
   }
   
   public boolean swap(){
   boolean flag;
   
   if(current == head)
      flag=false;
      
      else{
      Node<T> prev=head;
      T tmp;
   while(prev.next!=current)
   prev=prev.next;
   
   tmp=prev.data;
   prev.data=current.data;
   current.data= tmp;
   flag= true;
   }
   return flag;
   }

public void findIth(int i){
   
   
   if(head.next==null){//one node
      current= head;
   }else{
   current= head;
   for(int j=0; j<i; j++)
      current=current.next;
}


}


}