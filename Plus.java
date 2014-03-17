import java.util.Iterator;
import java.util.Map;


public class Plus extends Operator {
	
	public Plus() {
		super();
	}

	public int evaluate(Map<String,Integer> m) {
		int total = 0;
		for (ArithmeticExpression exp : operands) {
			total = total + exp.evaluate(m);
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
				str = str + "+";
			}
			else {
				str = str + ")";
			}
		}
		return str;
	}
	
}
