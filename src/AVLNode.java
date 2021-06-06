
public class AVLNode<T> {
	private AVLNode<T> left;
	private AVLNode<T> right;
	private AVLNode<T> parent;
	private int key=0;
	private T data;
	
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
}

