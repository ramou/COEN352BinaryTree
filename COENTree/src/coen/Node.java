package coen;

public class Node {
	int value;

	Node left;
	Node right;
	

	
	public Node(int v, Node left, Node right) {
		super();
		this.left = left;
		this.right = right;
		this.value = v;
	}
	
	public Node(int v) {
		this(v, null, null);
	}
	
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
	public void inorder() {
		if(left != null) left.inorder();
		System.out.print(value + " ");
		if(right != null) right.inorder();
	}
	
	public void preorder() {
		System.out.print(value + " ");
		if(left != null) left.preorder();
		if(right != null) right.preorder();
	}
	
	public void postorder() {
		if(left != null) left.postorder();
		if(right != null) right.postorder();
		System.out.print(value + " ");
	}
	
}
