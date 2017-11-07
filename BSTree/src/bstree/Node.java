package bstree;

/**
 *
 * @author federico.rosato
 */
public class Node<E>{
	public E info;
	public Node<E> left;
	public Node<E> right;
	
	public Node(E info){
		this.info = info;
	}
}
