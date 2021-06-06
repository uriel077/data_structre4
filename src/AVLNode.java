
public class AVLNode<T> {
	public AVLNode<T> left;
	public AVLNode<T> right;
	private AVLNode<T> parent;
	private int key=0;
	private T data;
	private int height;

	public AVLNode(int key, T data) {
		this.key=key;
		this.data=data;
	}

	public AVLNode<T> getLeftChild(){
		return left;
	}
	
	public AVLNode<T> getRightChild(){
		return right;
	}
	
	public AVLNode<T> getFather(){
		return parent;
	}
	
	public int getKey(){
		return key;
	}
	
	public T getData(){
		return data;
	}
	
	@Override
	public String toString() {
		String s = "";
		
		if (getLeftChild() != null){
			s+="(";
			s+=getLeftChild().toString();
			s+=")";
		}
		s+=getKey();
		
		if (getRightChild() != null){
			s+="(";
			s+=getRightChild().toString();
			s+=")";
		}
		
		return s;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}

