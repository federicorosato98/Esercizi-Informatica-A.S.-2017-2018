package pile_e_code;

/**
 * @author federico.rosato
 */
public class Coda {
	
	public char coda[];
	private int n;
	private int last = -1;
	private boolean isEmpty;
	private boolean isFull;
	
	public Coda(int n){
		this.n = n;
		coda = new char[n];
	}
	
	public void enqueue(char c){
		if(last < n){
		last++;
		coda[last] = c;
		}
	}
	
	public char front(){
		return coda[0];
	}
	
	public void dequeue(){
		for(int i = 0; i < last; i++){
			coda[i] = coda[i+1];
		}
		last--;
	}
	
	public void print(){
		if(last != -1)
			for(int i = 0; i<= last; i++)
				System.out.print(coda[i]+" ");
	}	
	
	public boolean isEmpty(){
		if(last == -1)
			isEmpty = true;
		else 
			isEmpty = false;
		
		return isEmpty;
	}

	public boolean isFull(){
		if(last == n-1)
			isFull = true;
		else
			isFull = false;
		return isFull;
	}
}
