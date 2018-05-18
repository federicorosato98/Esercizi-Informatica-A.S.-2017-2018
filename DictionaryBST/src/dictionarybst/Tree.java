package dictionarybst;

/**
 *
 * @author federico.rosato
 */
public class Tree<E extends Comparable<E>> {

	public Node<E> root;
	
	public Tree(){
		this.root = null;
	}
	
//	public void add(E item){
//		if(root == null)
//			root = new Node(item);
//		
//		Node<E> temp = root;
//	
//		while(!item.equals(temp.word)){
//			
//			if(item.compareTo(temp.word)<0)
//				
//				if(temp.left != null)
//					temp = temp.left;
//				else{
//					temp.left = new Node(item);
//				}
//			else				
//				if(temp.right != null)
//					temp = temp.right;
//				else{
//					temp.right = new Node(item);
//				}				
//		}
//	}
	
	public void addWord(Node<E> item){
		if(root == null)
			root = item;
		
		Node<E> temp = root;
		
		while(!item.word.equals(temp.word)){
			
			if(item.word.compareTo(temp.word)<0)
				
				if(temp.left != null)
					temp = temp.left;
				else{
					temp.left = item;
				}
			else				
				
				if(temp.right != null)
					temp = temp.right;
				else{
					temp.right = item;
				}				
			}
		}
	
	public void visit(Node nodo){
		
		if(nodo!=null){			
			visit(nodo.left);
			visit(nodo.right);
			System.out.print(nodo.word + " ");
		}
	}

	public void find(String word){
		
		Node<E> temp = root;
		word = '"' + word + '"';
		
		while(!word.equals(temp.word)){
			
			if(word.compareTo(temp.word)<0){				
				if(temp.left != null)
					temp = temp.left;
			}
			else{  								
				if(temp.right != null)
					temp = temp.right;				
			}
		}
		System.out.println(temp.desc);
	}
}


	


