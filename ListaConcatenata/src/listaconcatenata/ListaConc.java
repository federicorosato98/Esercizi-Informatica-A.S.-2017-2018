package listaconcatenata;

/**
 *
 * @author federico.rosato
 */
public class ListaConc<E>{
	
	private NodoConc<E> testa;
	private NodoConc<E> coda;
	private int size;

	public ListaConc(){		
		this.testa = null;
		this.coda = null;
		this.size = 0;
	}
	
	public ListaConc(E[] v){
		this.testa = new NodoConc<>(v[0], null);
		NodoConc<E> temp = testa;
		size = 1;
		
		for(int i = 1; i<v.length; i++){
			temp.next = new NodoConc<>(v[i], null);
			temp = temp.next;
			size++;	
			if(i == v.length-1) this.coda = new NodoConc<>(v[v.length-1], null);
		}
	}
	
	
	public int size(){
		return this.size;
	}

        public void addHead(E info){
		testa = new NodoConc<>(info, testa);
                size++;
	}

        public void removeHead(){
                testa = testa.next;
                size--;
        }
	
        public void addTail(E info){
                NodoConc temp = testa;
                
                while(temp.next != null)
                    temp = temp.next;
                
                temp.next = new NodoConc<>(info, null);
                coda = temp;
                size++;
	}
        
        public void removeTail(){
                NodoConc curr = testa;
                NodoConc prev = null;
                
                while(curr.next != null){
                    prev = curr;
                    curr = curr.next;
                }
                prev.next = curr.next;
                coda = prev;
                size--;
        }
        
        //get(int n)
        public E get(int n){
            NodoConc<E> temp = testa;
            for(int i = 0; i<n; i++){
                temp = temp.next;
            }
            return temp.info;
        }
        
        //set(int n, E x)
        public void set(int n, E x){
            NodoConc<E> temp = testa;
            for(int i = 0; i<n; i++){
                temp = temp.next;
            }
            temp.info = x;    
        }
        
        //add
        public void add(int n, E x){
            if(size == 0){
                testa = new NodoConc<>(x, null);
                size++;
                return;
            }    
            
            NodoConc<E> temp = testa;
            for(int i = 0; i<n-1; i++){
                temp = temp.next;
            }
            temp.next = new NodoConc<>(x, temp.next); 
            size++;
        }
        
        //remove
        public void remove(int n){
                NodoConc curr = testa;
                NodoConc prev = null;
               
                if(n == 0){
                    testa = testa.next;
                    return;
                }
                
                for(int i = 0; i<n; i++){
                    prev = curr;
                    curr = curr.next;
                }
                prev.next = curr.next;
                coda = prev;
                size--;
        }
        
	public void listToString(){
		NodoConc<E> temp = testa;
		while(temp != null){
			System.out.print(temp.info.toString() + " ");
			temp = temp.next;
		}
                System.out.println("");
	}
        
        
	
}
