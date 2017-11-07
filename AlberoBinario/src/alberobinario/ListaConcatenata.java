package alberobinario;

public class ListaConcatenata<T> {
	private NodoConc testa, coda;
	public ListaConcatenata(){
		testa=new NodoConc<>(null, null);
	}
	public ListaConcatenata(T[] array){
		for(int i=0; i<array.length; i++){
			NodoConc daAggiungere=new NodoConc(array[i], null);
                        if(size()==0)
                            testa=coda=daAggiungere;
                        else{
                            coda.next=daAggiungere;
                            coda=daAggiungere;
                        }
		}
	}
	@Override
	public String toString(){
		NodoConc<T> t=testa;
                String a=(String) t.info;
                t=t.next;
		for(int i=1; i<size(); i++){
			a=a+", "+t.info;
			t=t.next;
		}
                String finale="["+a+"]";
		return finale;
	}
	public int size(){
		if(testa == null) return 0;
		int i = 0;
		NodoConc temp = testa;
		while(!temp.equals(coda)) {
			temp = temp.next;
			i++;
		}
		return ++i;
	}
        public void addHead(T elem){
            NodoConc daAggiungere=new NodoConc(elem, null);
            if(testa==null){
                testa=coda=daAggiungere;
            }
            else{
                daAggiungere.next=testa;
                testa=daAggiungere;
            }
        }
        public void addTail(T elem){
            NodoConc daAggiungere=new NodoConc(elem, null);
            if(coda==null)
                testa=coda=daAggiungere;
            else{
                coda.next=daAggiungere;
                coda=daAggiungere;
            }
        }
	public void removeHead(){
            if(testa!=null){
                testa=testa.next;
            }
        }
        public void removeTail(){
            NodoConc temp=testa;
            if(testa==null){
                System.out.println("La lista è vuota");
            }
            while(temp.next.next!=null){
                temp=temp.next;
            } 
            coda=temp;
            coda.next=null;
            temp=null;
        }
        public T get(int n){
            NodoConc<T> temp=testa;
            if(testa==null)
                System.out.println("La lista è vuota");
            else{
                for(int i=0; i<n; i++){
                    temp=temp.next;
                }  
            }
            return temp.info;
        }
        public void set(int n, T x){
            int i;
            NodoConc<T> temp=testa;
            if(testa==null)
                System.out.println("La lista è vuota");
            else{
                for(i=0; i<n; i++){
                    temp=temp.next;
                }
                temp.info=x;    
            }
        }
        public void add(int n, T x){
            NodoConc temp=testa;
            NodoConc daAggiungere=new NodoConc(x, null);
            if(n<=0)
                addHead(x);
            else{
                for(int i=0; i<(n-1); i++){
                    temp=temp.next;
                }
                daAggiungere.next=temp.next;
                temp.next=daAggiungere;
                temp=null;
            }
        }
        public void remove(int n){
            NodoConc temp;
            if(n==0) {
                temp=testa;
                removeHead();
            }
            if(n==size()-1) {
                temp=coda;
                removeTail();
            }
            temp = testa;
            for(int i=0; i<size(); i++) {
                if(i==(n-1)) {
                    NodoConc toRemove=temp.next;
                    temp.next=toRemove.next;
                } else 
                    temp=temp.next;
            }
        }
		public void listToString(){
		NodoConc<T> temp = testa;
		while(temp != null){
			System.out.print(temp.info.toString() + " ");
			temp = temp.next;
		}
                System.out.println("");
	}
}