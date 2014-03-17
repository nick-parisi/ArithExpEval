import java.util.Iterator;
import java.util.Map;


public class Number implements ArithmeticExpression {
	private int number;
	
	public Number(int number) { this.number = number; }
	
	public int getNumber() { return number; }
	
	public String toString() { /*return "(" + number + ")";*/ return "" + number; }
	
	public int evaluate(Map<String, Integer> m) { return number; }
	
	public Iterator<ArithmeticExpression> iterator() { return new ArithmeticExpressionIterator(this); }
}
