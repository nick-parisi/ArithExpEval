import java.util.Iterator;
import java.util.Map;


public class Minus extends Operator {
	private ArithmeticExpression arg1, arg2;
	
	public Minus(ArithmeticExpression arg1, ArithmeticExpression arg2) {
		super();
		this.arg1 = arg1; this.arg2 = arg2;
		super.operands.add(arg1); super.operands.add(arg2);
		
	}

	public int evaluate(Map<String, Integer> m) {
		return arg1.evaluate(m) - arg2.evaluate(m);
	}
	
	public Iterator<ArithmeticExpression> iterator() { return new ArithmeticExpressionIterator(this); }
	
	@Override
	public void add(ArithmeticExpression exp) { throw new UnsupportedOperationException(); }
	
	public String toString() {
		return "(" + arg1 + "-" + arg2 + ")";
	}
	
	
	

}
