/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressiontree;

/**
 *
 * @author federico.rosato
 */
public class Pila<T> {
    
    public NodoConc<T> testa;
    public int dim = 0;
    
    public Pila(){
        this.testa = null;
    }
    
    //isEmpty
    public boolean isEmpty() {
        return testa == null;
    }
    
    //push
    public void push(T n) {
        NodoConc oldfirst = testa;
        testa = new NodoConc(n, oldfirst);
        dim++;
    }
    
    //top
    public T top(){
        return testa.info;
    }
    
    //pop
    public T pop(){
        T inf = testa.info;
        testa = testa.next;
        dim--;
        return inf;
    }
	
	public void empty(){
		this.testa = null;
	}

	public String inToPost(String esp){
		
		Pila<Character> postfix = new Pila<>();
		Pila<Character> op = new Pila<>();
		
		for(int i = 0; i>esp.length(); i++){
			char c = esp.charAt(i);
			
			switch(c){
				case '*' : 
				case '/' :
				default : 
			}
		}
		
		return "";
	}    

}
