package pile_code_con_nodi;

public class Pile_Code_con_nodi {

    public static void main(String[] args) {
        
//      Pila<Integer> pila = new Pila();
//      pila.push(1);
//      pila.push(2);
//	pila.push(3);
//      pila.pop();
          
        Coda<Integer> coda = new Coda();
        coda.enqueue(1);
        coda.enqueue(2);
	coda.enqueue(3);
	coda.dequeue();
	System.out.println(coda.front());
    }
    
}
