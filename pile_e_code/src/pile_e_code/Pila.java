package pile_e_code;

/**
 *
 * @author federico.rosato
 */
public class Pila {
	
	public char[] pila;
	private int n;
	private int top = -1;
	private boolean isFull;
	private boolean isEmpty;
	
	public Pila(int n){
		this.n = n;
		pila = new char[n];
	}

	public void push(char c){
		if(top < n-1){
			top++;
			pila[top] = c;
		}else System.out.println("La pila è piena");
	}

	public char top(){
		return pila[top];
	}
	
	public char pop(){
		char temp = pila[top];
		top--;
		return temp;
	}
	
	public void print(){
		if(top != -1)
			for(int i = 0; i<= top; i++)
                            System.out.print(pila[i]+" ");
	}
	
	public boolean isEmpty(){
		if(top == -1)
			isEmpty = true;
		else 
			isEmpty = false;
		
		return isEmpty;
	}

	public boolean isFull(){
		if(top == n-1)
			isFull = true;
		else
			isFull = false;
		return isFull;
	}
}
