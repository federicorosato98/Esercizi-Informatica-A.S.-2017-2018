package dictionarybst;

/**
 *
 * @author federico.rosato
 */
public class Node<E>{
	public String word;
	public String desc;
	public Node<E> left;
	public Node<E> right;
	
	public Node(String info, String desc){
		this.word = info;
		this.desc = desc;
	}
}
