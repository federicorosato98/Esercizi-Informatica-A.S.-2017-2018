package alberobinario;

public class AlberoBinario {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		BinaryTree<Integer> tree=new BinaryTree<>();
		tree.addLeft(0);
		tree.addLeft(1);
		tree.addRight(2);
		tree.visitaSimmetrica(tree.origin);
		tree.l.listToString();
	}
	
}
