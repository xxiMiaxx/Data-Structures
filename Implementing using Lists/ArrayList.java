public class ArrayList<T> implements List<T>{
   private int maxsize;
   private int size;
   private int current;
   private T[] nodes;
   
   
   public ArrayList(int n){
     maxsize = n;
     size= 0; 
      current = -1;
      nodes = (T[]) new Object[n];
   
   }
   public boolean full(){
   return size == maxsize;
   }
   public boolean empty(){
   return size==0;
   }
   public boolean last(){
   return current == size-1;//cause size points to the node after the last filled one
   
   }
   public void findFirst(){
   current =0;
   }
   public void findNext(){
   current++;
   }
   
   	public T retrieve(){
      return nodes[current];
      }

	public void update (T val) {
		nodes[current] = val;
	}

	public void insert (T val) {
   
		for (int i = size-1; i > current; --i) {
			nodes[i+1] = nodes[i];
		}
      
		current++;
		nodes[current] = val;
		size++;
	}
   
	public void remove () {
		for (int i = current + 1; i < size; i++) {
			nodes[i-1] = nodes[i];
		}
		size--;
		if (size == 0)
			current = -1;
		else if (current == size)
			current = 0;
	}
   
    public int length(){
       int len = size;
      return len;
   }
    public boolean swap(){
   boolean flag;
   
   if(current == 0)
   flag = false;
   else {
   
   T tmp=null;
   int prev=0;
   
   for( int i = 0; i < current; i++){
      tmp = nodes[i];
      prev = i;}
      
      nodes[prev]= nodes[current];
      nodes[current]=tmp;
      flag = true;
   
   }
   return flag;
  } 
  
  public void findIth(int i){
  
  if(size==1){
  current = 0;}
  else{
  current = 0;
   for(int j=0; j<i; j++)
      current++;
  
  }
  }
   
}



