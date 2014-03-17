import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ArithmeticExpTester {
	
	public static void main(String args[]) {
		//Create the expression (x * (2+3) - 10) * y for x = 5, y = 2
		//Should equal 30
		
		//Create the variable map
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("x", 5);
		m.put("y", 2);
		
		//Create expression for (2+3)
		Number n1 = new Number(2);
		Number n2 = new Number(3);
		Operator op1 = new Plus();
		op1.add(n1); op1.add(n2);
		
		//Create x*(2+3)
		Variable n3 = new Variable("x");
		Operator op2 = new Product();
		op2.add(n3); op2.add(op1);
		
		//create x*(2+3) - 10
		Number n4 = new Number(10);
		Operator op3 = new Minus(op2, n4);
		
		//create (x*(2+3) - 10) * y
		Variable n5 = new Variable("y");
		Operator op4 = new Product();
		op4.add(op3); op4.add(n5);
		
		System.out.println("Variable values are:");
		Iterator<ArithmeticExpression> it = op4.iterator();
		
		while (it.hasNext()) {
			ArithmeticExpression node = it.next();
			if (node instanceof Variable) {
				Variable var = (Variable)node;
				System.out.println(var + " = " + var.evaluate(m));
			}
		}
		
		System.out.println();
		Iterator<ArithmeticExpression> it2 = op4.iterator();
		
		int max = 0;
		while (it2.hasNext()) {
			ArithmeticExpression node = it2.next();
			if (node instanceof Number) {
				Number n = (Number)node;
				int num = n.getNumber();
				if (num > max) { max = num; }
			}
		}
		
		System.out.println("The largest integer is : " + max);
		
		System.out.println("");
		System.out.println("Expression is:");
		System.out.println(op4.toString());
		System.out.println();
		System.out.println("Evalauted: ");
		System.out.println(op4.evaluate(m));
		
		
		
		
	}
}
