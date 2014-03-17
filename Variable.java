import java.util.Iterator;
import java.util.Map;


public class Variable implements ArithmeticExpression {
	private String var;
	
	public Variable(String var) { this.var = var; }
	
	public int evaluate(Map<String, Integer> m) {
		
		int val = m.get(var);
		
		if (val <= 0 || val > 0) { //Tests if val is an int, since m.get() returns null if key not found
			return val;	
		}
		
		throw new UnsupportedOperationException();
	}
	
	public Iterator<ArithmeticExpression> iterator() { return new ArithmeticExpressionIterator(this); }
	
	public String toString() {
		return var;
	}
	
}
