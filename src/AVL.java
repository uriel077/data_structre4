public class AVL<T> {
	AVLNode<T> root;
	
	public void insert(int key, T data){
		AVLNode<T> locForNode=findLocForNode(key);
		AVLNode<T> newNode =new AVLNode<T>(key, data);
		if(locForNode==null)
			root=newNode;
		else if(locForNode.getKey()>=key)
			locForNode.left=newNode;
		else
			locForNode.right=newNode;
		rebalance(newNode);
	}
	public void rebalance(AVLNode<T> node){
		updateHeight(node);
		if (node==null)
			return;
		if(Math.abs(getBalance(node))<1)
			rebalance(node.getFather());


	}
	public int getBalance(AVLNode<T> node){
		return node==null?0:height(node.left)-height(node.right);
	}

	public AVLNode<T> findLocForNode(int key){
		AVLNode<T> parent=root;
		AVLNode<T> son=root;
		if(root==null)
		{
			return null;
		}
		do {
			parent=son;
			if(parent.getKey()>=key)
				son=parent.getLeftChild();
			else
				son=parent.getRightChild();

		}while (son!=null);
		return parent;
	}

	public int height(AVLNode<T> node)
	{
		return node==null?-1:node.getHeight();
	}
	public void updateHeight(AVLNode<T> node){
		node.setHeight(Math.max(height(node.getRightChild()),height(node.getLeftChild())));
	}
	public T search(int key){
		return recSearch(key,root);
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

