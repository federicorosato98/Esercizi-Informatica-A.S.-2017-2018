package pile_code_con_nodi;

public class Coda<T> {
    public NodoConc<T> testa;
    public NodoConc<T> coda;
    public int dim; 
    
    public Coda(){
        this.testa = null;
        this.coda = null;
		this.dim = 0;
    }
       
    //isEmpty
    public boolean isEmpty() {
        return testa == null;
    }
    
    //enqueue(x)
    public void enqueue(T item) {
            NodoConc<T> oldlast = coda;
            coda = new NodoConc(item, null);
			coda.info = item;
			coda.next = null;
		if(isEmpty())
			testa = coda;
		else
			oldlast.next = coda;
        dim++;
    }
    
    //dequeue
    public T dequeue() {
        T item = testa.info;
        testa = testa.next;
        dim--;
        if (isEmpty()) coda = null; 
        
        return item;
    }
   
    //front
    public T front(){
        return testa.info;
    }
}
