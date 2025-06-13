package Java8;

public class Main {

	public static void main(String[] args) {
		
		int a=20,b=13;
		calculator sum=(x,y)->{return x+y;};
		
		int result=sum.cal(a, b);
		System.out.println("The result of the calculation is "+result);
		
		
		
		

	}

}
