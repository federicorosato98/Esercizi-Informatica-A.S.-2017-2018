package expressiontree;

/**
 * @author federico.rosato / pistollato.marco
 * @param <T>
 */

public class ExpressionTree{
	
	public static void main(String[] args) {
		Pila<String> pila = new Pila<>();
		pila.inToPost("(5+4)*6");
	}
	
}
