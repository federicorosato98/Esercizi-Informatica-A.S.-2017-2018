package alberobinario;

public class NodoAlbero<T> {
	public T info;
	public NodoAlbero left;
	public NodoAlbero right;
	public NodoAlbero(T info, NodoAlbero left, NodoAlbero right){
		this.info=info;
		this.left=left;
		this.right=right;
	}
}
