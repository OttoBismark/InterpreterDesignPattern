
public class AndExpression implements Expression {


	private Expression left = null;
	private Expression right = null;
	
	
	public AndExpression(Expression left, Expression right)
	{
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean interpreter(String context) {
		return left.interpreter(context) && right.interpreter(context);
	}

}
