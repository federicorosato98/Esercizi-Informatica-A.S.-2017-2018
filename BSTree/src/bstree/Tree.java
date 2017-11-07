package bstree;

/**
 *
 * @author federico.rosato
 * @param <E>
 */
public class Tree<E extends Comparable<E>> {

	public Node<E> root;
	
	public Tree(){
		this.root = null;
	}
	
	public void add(E item){
		if(root == null)
			root = new Node(item);
		
		Node<E> temp = root;
	
		while(!item.equals(temp.info)){
			
			if(item.compareTo(temp.info)<0)
				
				if(temp.left != null)
					temp = temp.left;
				else{
					temp.left = new Node(item);
				}
			else				
				if(temp.right != null)
					temp = temp.right;
				else{
					temp.right = new Node(item);
				}				
		}
	}
	
	public void visit(Node nodo){
		
		if(nodo!=null){			
			visit(nodo.left);
			visit(nodo.right);
			System.out.print(nodo.info + " ");
		}
	}
}
