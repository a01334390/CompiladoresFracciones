
import java.util.*;

class Fraction {
	private int num;
	private int denom;
	
	public Fraction(int num, int denom) {
		this.num = num;
		this.denom = denom;
	}

	public int getNum() {
		return num;
	}

	public int getDenom() {
		return denom;
	}
	
	@Override public String toString() {
		return Integer.toString(num)+"%"+Integer.toString(denom);
	}
}

public class MiListener extends HelloBaseListener {
	Stack<Fraction> pila = new Stack<>();
	
    @Override public void exitProg(HelloParser.ProgContext ctx){
        if(pila.size() !=0){
            System.out.println(pila.pop());
        }
    }
    
	@Override public void exitFraction(HelloParser.FractionContext ctx) { 
		 Fraction f = new Fraction(Integer.parseInt(ctx.getChild(0).getText()),Integer.parseInt(ctx.getChild(2).getText()));
		 pila.add(f);
	}
    
    @Override public void exitExpr(HelloParser.ExprContext ctx) {
    	if(ctx.getChildCount() == 3) {
    		Fraction a2 = pila.pop();
    		Fraction a1 = pila.pop();
    		Fraction r;
    		int a = a1.getNum();
    		int b = a1.getDenom();
    		int c = a2.getNum();
    		int d = a2.getDenom();
    		if(ctx.getChild(1).getText().contentEquals("+")) {
    			r = new Fraction(
    			((a*d) + (c*b)) , (b*d)
    			
    		);
    		} else {
    			r = new Fraction(
    					((a*d) - (c*b)) , (b*d));
    		}
    		pila.push(r);
    		
    	}
    }
    
    @Override public void exitTerm(HelloParser.TermContext ctx){
    	if(ctx.getChildCount() == 3) {
    		Fraction a1 = pila.pop();
    		Fraction a2 = pila.pop();
    		Fraction r;
    		int a = a1.getNum();
    		int b = a1.getDenom();
    		int c = a2.getNum();
    		int d = a2.getDenom();
    		if(ctx.getChild(1).getText().contentEquals("*")) {
    			r = new Fraction(
    					(a*c) , (b*d)
    			
    		);
    		} else {
    			r = new Fraction(
    					(a*d) , (b*c));
    		}
    		pila.push(r);
    		
    	} 
    }
}
