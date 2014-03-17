import java.util.*;


public abstract class Operator implements ArithmeticExpression {
	protected List<ArithmeticExpression> operands = new ArrayList<ArithmeticExpression>();
	
	protected Operator() {};
	
	public void add(ArithmeticExpression exp){
		operands.add(exp);
	}
	
	
}
