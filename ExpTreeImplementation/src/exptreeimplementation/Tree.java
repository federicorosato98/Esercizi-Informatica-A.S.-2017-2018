package exptreeimplementation;

/**
 *
 * @author federico.rosato
 */
public class Tree {
	
	boolean isOperator(char c){
		boolean isOp = false;
		
		if(c == '+' || c == '-' || c == '*' || c == '/'){
			isOp = true;
		}
			return isOp;
	}
	
	boolean isValue(char c){
		return c >= '0' && c <= '9';
	}
}
