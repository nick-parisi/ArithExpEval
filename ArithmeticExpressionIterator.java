
import java.util.Iterator;
import java.util.Stack;


public class ArithmeticExpressionIterator implements Iterator<ArithmeticExpression> {
	ArithmeticExpression e;
	Stack<ArithmeticExpression> chars;
	
	
	public ArithmeticExpressionIterator(ArithmeticExpression e) {
		this.e = e;
		chars = new Stack<ArithmeticExpression>();
		chars.push(e);
		build(e);
		
	}
	
	private void build(ArithmeticExpression exp) {
		if (exp instanceof Operator) {
			Operator op = (Operator)exp;
			for (ArithmeticExpression ex : op.operands) {
				chars.push(ex);
				build(ex);
			}
		}
	}

	@Override
	public boolean hasNext() {
		return (chars.isEmpty()) ? false : true;
	}

	@Override
	public ArithmeticExpression next() {
		if (hasNext()) {
			ArithmeticExpression exp = chars.pop();
			return exp;
		}
		else { throw new StackOverflowError(); }
		
	}

	@Override
	public void remove() { throw new UnsupportedOperationException(); }

}
