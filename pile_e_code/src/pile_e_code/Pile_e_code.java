package pile_e_code;
/**
 * @author federico.rosato
 */
import java.util.*;
public class Pile_e_code {
	
	public static void esercizio3(){
		Scanner input = new Scanner(System.in);
                boolean palindromo = true;
                System.out.println("Inserisci una parola e verifico se è un palindromo.");
                 String word = input.nextLine();
                 char[] letters = word.toCharArray();
                 Pila stack = new Pila(letters.length);
                
                 for(int i = 0; i<letters.length; i++)
                    stack.push(letters[i]);
                 
                 char[] reverse = new char[letters.length];
                 
                 for(int i = 0; i<reverse.length; i++){
                    reverse[i] = stack.pop();
                    if(reverse[i]!=letters[i])
                        palindromo = false;
                 }
                 
                 System.out.println("Palindomo: " + palindromo);               
	}

        public static void esercizio4(){
            Coda Q = new Coda(5);
                Q.enqueue('a');
                Q.enqueue('b');
                Q.enqueue('c');
                Q.enqueue('d');
                Q.enqueue('e');
            
            System.out.print("Coda Q iniziale: "); Q.print();
            Pila S = new Pila(Q.coda.length);
            
            for(int i = 0; i<Q.coda.length; i++){
                S.push(Q.front());
                Q.dequeue();
            }
            
            for(int i = 0; i<Q.coda.length; i++){
                Q.enqueue(S.pop());
            }
            System.out.print("\nCoda Q invertita: "); Q.print();
        }
        
        public static void main(String[] args) {
		esercizio4();
	}
	
}
