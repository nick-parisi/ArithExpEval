import java.util.Map;


public interface ArithmeticExpression extends Iterable<ArithmeticExpression> {
	public String toString();
	public int evaluate(Map<String,Integer> m);
}
