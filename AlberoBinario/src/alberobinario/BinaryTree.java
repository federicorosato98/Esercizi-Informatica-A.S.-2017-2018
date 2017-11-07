package alberobinario;
import java.util.Iterator;

public class BinaryTree<T> implements Iterator{
	public NodoAlbero<T> origin;
	public ListaConcatenata<T> l=new ListaConcatenata<>();
	public BinaryTree(){
		this.origin=null;
	}
	public boolean isEmpty(){
		return origin == null;
	}
	public void addLeft(T elem){
		if(isEmpty())
			origin=new NodoAlbero(elem, null, null);
		else{
			NodoAlbero temp = origin;
			while(temp.left != null){
				temp = temp.left;
			}
			if(temp.left == null)
				temp.left = new NodoAlbero(elem, null, null);
		}
	}
	public void addRight(T elem){
		if(isEmpty())
			origin=new NodoAlbero(elem, null, null);
		else{
			NodoAlbero temp = origin;
			while(temp.right != null){
				temp = temp.right;
			}
			if(temp.right == null)
				temp.right = new NodoAlbero(elem, null, null);
		}
	}
	public void visitaSimmetrica(NodoAlbero nodo){
		if(nodo!=null){
			visitaSimmetrica(nodo.left);
			l.addTail((T)nodo.info);
			visitaSimmetrica(nodo.right);
		}
	}

	@Override
	public boolean hasNext() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Object next() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
}
