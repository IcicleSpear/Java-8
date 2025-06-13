package Java8_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		/*String arr[]= {"apple","  banana ","  grapes  ","mango  ","  cherry"};
		Arrays.stream(arr).forEach((i)->System.out.print(i+" "));
		
		Arrays.stream(arr).filter((i)->i.startsWith("a")).forEach((i)->System.out.println(i));
		
		Arrays.stream(arr).forEach((name)->System.out.println(name.trim()));*/
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
        int[] salaries = new int[10];

        System.out.println("Enter salaries of 10 members:");

        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = sc.nextInt();
        }

        System.out.println("Salaries greater than 5000:");
        Arrays.stream(salaries).filter(sal -> sal > 5000).forEach((i)->System.out.println(i));

        sc.close();*/
		
		 List<String> users = new ArrayList<>();
	        users.add("ASha");
	        users.add("Pooja");
	        users.add("kavita");
	        users.add("deepa");

	        List<String> updateduser = users.stream()
	            .filter(i -> Character.isUpperCase(i.charAt(0)))
	            .collect(Collectors.toList());

	        System.out.println(updateduser);
        
		
   	 	

	}

}
