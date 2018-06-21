public class PascalTriangle {
	// Build the part of the Pascal triangle of depth d.
	// Do not change the code of this method.
	public static BT<Integer> buildPascalTri(int d) {
		BT<Integer> pt = new LinkedBT<Integer>();
		pt.insert(1, Relative.Root);
		for (int n = 1; n <= d; n++) {
			for (int r = 0; r <= n; r++) {
				addNR(pt, n, r);
			}
		}
		return pt;
	}
   public static void main(String[]args){
   BT<Integer> ptree = buildPascalTri(4);
   
   
   
   
   }
	// Put the current at the element C(n,r). The element is assumed to exist in the tree.
	public static void findNR(BT<Integer> pt, int n, int r) {
      //=========
      int oldR= r;
      int oldN = n;
                                  pt.find(Relative.Root);
                                  
                                  
              for ( int k = 0 ; k < oldR ; k++ ) { 
              
                 pt.find(Relative.RightChild); 
                 
                   }
            for (int p = 0 ; p < oldN-oldR ; p++ ) {
                           pt.find(Relative.LeftChild);
                
                           }
      // using another method 
      //int depth = pt.depth();
      /*if (n==0 && r==0 ){// node is root
      
      pt.find(Relative.Root);
      return;
      }
      if(n==0 && (r==0||r==1)){//one child
      
      if(r==0)
      pt.find(Relative.LeftChild);
      if(r==1)
      pt.find(Relative.RightChild);
      return;
      
      
      }
      if( n==1 ){ //stopping case
      //pt.find(Relative.Parent);
         if(r==0)// LEFT
            pt.find(Relative.LeftChild);
         else// RIGHT
         pt.find(Relative.RightChild);
      return;
      }
      //C(4,1)
      else {
      //pt.find(Relative.Root);
      //======================
      if(pt.depth()==n){
         pt.find(Relative.Parent);
         int parentlevel = pt.depth();
            if( parentlevel%r == 0)
            pt.find(Relative.LeftChild);
            else
            pt.find(Relative.RightChild);
           
      }
      if (pt.depth()>n){
      pt.find(Relative.Parent);
      findNR(pt,pt.depth(),r);
      }
      
      if(pt.depth()<n){
      pt.find(Relative.LeftChild);
      findNR(pt,pt.depth(),r);
      
      }
      
      }*/
   
	}
	// Add the value C(n,r) to the tree assuming that both C(n-1, r-1) and C(n-1, r) exist.
	public static void addNR(BT<Integer> pt, int n, int r) {
	// adding will be the child of c(n-1,r)
   findNR(pt,0,0);
   if(r==0){
   findNR(pt,n-1,r);
   pt.insert(1,Relative.LeftChild);
   } else if(n==r){
   findNR(pt,n-1,r);
   pt.insert(1,Relative.RightChild);
   
   }else {
   
   findNR(pt,n-1,r-1);
   int y= pt.retrieve();
   
   findNR(pt,n-1,r);
   int x= pt.retrieve();
   int val = x+y;
   pt.insert(val, Relative.LeftChild);
   }
   
   
   
   
   
   }
}
