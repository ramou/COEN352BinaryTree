package coen;

public class Driver {

	public static void main(String[] args) {
		Tree t = new Tree();
		Node n1 = new Node(10);
		Node n2 = new Node(56);
		Node n3 = new Node(4);
		t.setRoot(n2);
		n2.setLeft(n3);
		n3.setRight(n1);
		
		t.getRoot().postorder();

	}

}
