package alberomappa;
/**
 * @author federico.rosato
 */
public class AlberoMappa {

	public static void main(String[] args) {
		Tree<Integer> albero = new Tree();
	
		albero.visit(albero.root);
	}
	
}
