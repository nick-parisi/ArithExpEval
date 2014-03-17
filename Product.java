import java.util.Iterator;
import java.util.Map;


public class Product extends Operator {
	
	public Product() {
		super();
	}

	public int evaluate(Map<String, Integer> m) {
		int total = 1;
		for (ArithmeticExpression exp : operands) {
			total = total * exp.evaluate(m);
		}
		return total;
	}
	
	public Iterator<ArithmeticExpression> iterator() { return new ArithmeticExpressionIterator(this); }
	
	public String toString() {
		String str = "(";
		Iterator<ArithmeticExpression> iter = operands.iterator();
		while (iter.hasNext()) {
			str = str + iter.next();
			if (iter.hasNext()) {
				str = str + "*";
			}
			else {
				str = str + ")";
			}
		}
		return str;
	}
	
}
