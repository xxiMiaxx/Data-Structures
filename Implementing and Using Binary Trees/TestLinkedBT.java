public class TestLinkedBT {
	public static BT<Integer> buildTestTree() {
		BT<Integer> tree = new LinkedBT<Integer>();
      tree.insert(1, Relative.Root);
      tree.insert(2, Relative.LeftChild);
      tree.insert(4, Relative.RightChild);
      tree.find(Relative.Root);
      tree.insert(3, Relative.RightChild);
      tree.insert(5, Relative.LeftChild);
      tree.insert(8, Relative.RightChild);
      tree.find(Relative.Parent);
      tree.insert(7, Relative.LeftChild);
      tree.find(Relative.Parent); //5
      tree.find(Relative.Parent);//3
      tree.insert(6, Relative.RightChild);
      //======testing depth========
      // tree.find(Relative.Parent);
//       tree.find(Relative.LeftChild);
//       tree.find(Relative.RightChild);
      return tree; // Change this
	}
   
}
