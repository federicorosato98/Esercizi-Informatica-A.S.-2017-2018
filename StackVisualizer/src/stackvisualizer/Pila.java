package stackvisualizer;


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
    public void push(int n) {
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
    

}

class NodoConc<T> {
        
        public T info;
        public NodoConc<T> next;
        
        public NodoConc(T info, NodoConc<T> next){
            this.info = info;
            this.next = next;
        }

}
