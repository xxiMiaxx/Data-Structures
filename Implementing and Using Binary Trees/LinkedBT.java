public class LinkedBT<T> implements BT<T>{

   BTNode<T> root, current;
   
   public LinkedBT(){
   root = current = null;
   
   }

   public boolean empty(){
   return root == null;
   }
   
   public boolean full(){
   return false;
   }
   
   public T retrieve(){
   return current.data;
   }

   public void update(T val){
   current.data = val;
   
   }

   public boolean insert(T val, Relative rel){
   
      switch(rel){
   
         case Root:
            if(!empty()) return false;
            current = root = new BTNode<T>(val);
            return true;
            
         case Parent:
            return false;
            
         case RightChild:
            if(current.right != null)
               return false;
            current.right = new BTNode<T>(val);
            current = current.right;
            return true;
            
         case LeftChild:
            if(current.left != null)
               return false;
            current.left = new BTNode<T>(val);
            current = current.left;
            return true;
         default:
         return false;
      }
   }
   
   public void deleteSub(){
   
   if(current == root)
   current = root = null;
   else {
      
      BTNode<T> p = current;
      find(Relative.Parent);
      
      if(current.left == p)
         current.left = null;
      else 
         current.right = null;
         
      current = root;
   
   }
   
   }
   
   public boolean find(Relative rel){
      switch(rel){
         case Root:
         current =root;
         return true;
         
         case Parent:
         if(current == root) return false;
         current = findParent(current, root);
         return true;
         
         case RightChild:
         if( current.right == null) return false;
         current = current.right;
         return true;
         
         case LeftChild:
         if(current.left == null) return false;
         current = current.left;
         return true;
         
         default: return false;
      }
   }
   
   private BTNode<T> findParent(BTNode<T> p, BTNode<T> t){
   
      if(t == null)
         return null;
         
      if(t.left == null && t.right == null)
         return null;
         
      else if(t.right == p || t.left == p)
         return t;
         
   else {
      BTNode<T> q= findParent(p, t.left);
         if(q!= null)
            return q;
            
            else 
            return findParent(p, t.right);
   
   
   
   }
   
   
   
   }
   
   public int depth(){
   int d=0;
   
      BTNode<T> q = current;
      while(q!=root){
      q= findParent(q,root);
      d++;
      }
      return d;
   }
}