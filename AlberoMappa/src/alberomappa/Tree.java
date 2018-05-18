/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberomappa;
import java.util.*;
import java.io.*;

/**
 *
 * @author federico.rosato
 */
public class Tree<E extends Comparable<E>> {

	public Fermata<E> root;
	private Scanner input = new Scanner("stops.txt");
	private ArrayList<Fermata> list = new ArrayList<Fermata>();
	
	public Tree(){
		this.root = null;
	}
	
//	public void add(E item){
//		if(root == null)
//			root = new Fermata(item);
//		
//		Fermata<E> temp = root;
//	
//		while(!item.equals(temp.info)){
//			
//			if(item.compareTo(temp.info)<0)
//				
//				if(temp.left != null)
//					temp = temp.left;
//				else{
//					temp.left = new Fermata(item);
//				}
//			else				
//				if(temp.right != null)
//					temp = temp.right;
//				else{
//					temp.right = new Fermata(item);
//				}				
//		}
//	}
	
	private void load(){
		input.nextLine();
		list.add(new Fermata()):
	}
	
//	public void visit(Fermata nodo){
//		
//		if(nodo!=null){			
//			visit(nodo.left);
//			visit(nodo.right);
//			System.out.print(nodo.info + " ");
//		}
//	}
	
//	public int compare(){
//	
//	}
}

