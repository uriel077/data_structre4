public class AVL<T> {
	AVLNode<T> root;
	
	public void insert(int key, T data){
		// TODO
	}

	public T search(int key){

		return null;
	}
	public T recSearch(int key,AVLNode<T> node)
	{
		if(node==null)
			return null;
		if(key== node.getKey())
			return node.getData();
		if(key<= node.getKey())
			return recSearch(key,node.getLeftChild());
		return recSearch(key,node.getRightChild());

	}

	public AVLNode<T> getRoot(){
		return root;
	}
}

