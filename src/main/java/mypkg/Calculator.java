package mypkg;

public class Calculator {
	public int sum(int a,int b) {
		return (a+b);
		
	}
	public int sub(int a,int b) {
		return (a-b);
		
	}
	public int mult(int a,int b) {
		return (a*b);
	
				
	}
	public int div(int a,int b) {
		return (a/b);
	}

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		System.out.println(obj.sum(4,2));
		System.out.println(obj.sub(4,2));
		System.out.println(obj.mult(4,2));
		System.out.println(obj.div(4,2));
	}

}
