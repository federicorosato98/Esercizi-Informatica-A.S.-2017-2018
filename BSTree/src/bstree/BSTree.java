package bstree;

/**
 *
 * @author federico.rosato
 */
public class BSTree {

	public static void main(String[] args) {
		Tree<Integer> albero = new Tree();
		
		albero.add(7);
		albero.add(3);
		albero.add(8);
		albero.add(2);
		albero.add(1);
		albero.add(6);
	
		albero.visit(albero.root);
	}
	
}
