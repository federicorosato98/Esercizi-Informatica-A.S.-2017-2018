/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaconcatenata;

/**
 *
 * @author federico.rosato
 */
public class NodoConc<E> {
	
	public E info;
	public NodoConc<E> next;
	
	public NodoConc(E info, NodoConc<E> next){
		this.info = info;
		this.next = next;
	}
}
