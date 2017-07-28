package SPOJ.Classical;
import java.util.*;
 class ONP {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			String s = sc.next();
			String postfix = InfixToPostfix(s);
			System.out.println(postfix);
			t--;
		}
	}
	static String InfixToPostfix(String s){
		char[] exp = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		Stack st = new Stack();
		for(int i=0; i<exp.length; i++){
			
			if(exp[i] == ' ' || exp[i] == ',') continue;
			
			else if(isOperand(exp[i]))
				sb.append(exp[i]);
			else if(isOperator(exp[i])){
				while(!st.isEmpty() && !isOpenParen((char)st.peek()) && hasHigherPrece((char)st.peek(),exp[i])){
					sb.append((char)st.peek());
					st.pop();
				}
				st.push(exp[i]);
			}
			else if(isOpenParen(exp[i]))
				st.push(exp[i]);
			else if(isCloseParen(exp[i])){
				while(!st.empty() && !isOpenParen((char)st.peek())){
					sb.append((char)st.peek());
					st.pop();
				}
				st.pop();
			}
		}
		while(!st.empty()){
			sb.append((char)st.peek());
			st.pop();
		}	
		return sb.toString();
	}
	static boolean isOperand(char c){
		if(c>=0 && c<=9) return true;
		if(c>='a' && c<='z') return true;
		if(c>='A' && c<='Z') return true;
		return false;
	}
	
	static boolean isOperator(char c){
		if(c=='+' || c=='-' || c=='/' || c=='*' || c=='^' ) return true;
		return false;
	}
	
	static boolean isOpenParen(char c){
		if(c=='(' || c=='{' || c=='[') return true;
		return false;
	}
	
	static boolean isCloseParen(char c){
		if(c==')' || c=='}' || c==']') return true;
		return false;
	}
	
	static boolean hasHigherPrece(char op1, char op2){
		int op1Weight = GetOperatorWeight(op1);
		int op2Weight = GetOperatorWeight(op2);
 
		if(op1Weight == op2Weight)
		{
			if(IsRightAssociative(op1)) return false;
			else return true;
		}
		return op1Weight > op2Weight ?  true: false;
	}
	
	static int GetOperatorWeight(char op){
		switch(op){
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}
	
	static boolean IsRightAssociative(char op)
	{
		if(op == '^') return true;
		return false;
	}
}
