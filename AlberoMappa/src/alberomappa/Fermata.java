/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberomappa;

/**
 *
 * @author federico.rosato
 */
public class Fermata<E>{
	public String stop;
	public int latit;
	public int longit;
	public Fermata<E> left;
	public Fermata<E> right;
	
	public Fermata(String stop, int latit, int longit){
		this.stop = stop;
		this.latit = latit;
		this.longit = longit;
	}	
}
