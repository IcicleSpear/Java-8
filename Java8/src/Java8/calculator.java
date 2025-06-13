package Java8;

@FunctionalInterface

public interface calculator {
	
	public int cal(int a,int b);
	
	default void description() {
        System.out.println("This calculator performs a calculation on two integers.");
    }

}
