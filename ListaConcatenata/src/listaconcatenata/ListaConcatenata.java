package listaconcatenata;
import java.util.*;

/**
 *
 * @author federico.rosato
 */
public class ListaConcatenata {

	public static void main(String[] args) {
		//Esercizio 4
                Scanner input = new Scanner(System.in);
                System.out.print("Inserisci una stringa: ");
                String v = input.nextLine();
                String[] a = new String[v.length()];
                
                for(int i = 0; i<v.length(); i++){
                    a[i] = String.valueOf(v.charAt(i));
                }
                
                ListaConc lista = new ListaConc(a);
		//spazi tra un carattere e l' altro perchè nel metodo listToString() ogni elemento viene printato con uno spazio al seguito
                lista.listToString();
                
                System.out.println("metodo size: " + lista.size());
                System.out.println("metodo add di 'X' in posizione 1: ");
                    lista.add(1, "x");
                    lista.listToString();
                System.out.println("metodo addHead con 'A': ");
                    lista.addHead("A");
                    lista.listToString();                    
                System.out.println("metodo addTail con 'Z': ");
                    lista.addTail("Z");
                    lista.listToString();
                System.out.println("metodo get dell' elemento in posizione 2: " + lista.get(2));
                System.out.println("metodo remove dell' elemento in posizione 2: ");
                    lista.remove(2);
                    lista.listToString();                
                System.out.println("metodo removeHead: ");
                    lista.removeHead();
                    lista.listToString();
                System.out.println("metodo removeTail: ");
                    lista.removeTail();
                    lista.listToString();
                System.out.println("metodo get dell' elemento in posizione 3: " + lista.get(3));

                
        }
	
}
