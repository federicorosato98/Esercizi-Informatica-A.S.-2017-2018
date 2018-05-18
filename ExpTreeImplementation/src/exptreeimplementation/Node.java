package exptreeimplementation;

/**
 *
 * @author federico.rosato
 */
public class Node {
	
	char info;
	Node left, right;
	
	public Node(char info){
		this.info = info;
		this.left = null;
		this.right = null;
	}
}
