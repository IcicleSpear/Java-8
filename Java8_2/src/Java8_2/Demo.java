package Java8_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		 
        users.add(new User(1, "Amit", 50000.0));
        users.add(new User(2, "Priya", 60000.0));
        users.add(new User(3, "Rahul", 55000.0));
        users.add(new User(4, "Sneha", 70000.0));
        users.add(new User(5, "Vikram", 48000.0));
        users.add(new User(6, "Pooja", 62000.0));
        users.add(new User(7, "Rohit", 75000.0));
        users.add(new User(8, "Neha", 58000.0));
        users.add(new User(9, "Ankit", 54000.0));
        users.add(new User(10, "Kiran", 67000.0));
        
        users.stream().forEach((u)->System.out.println(u.toString()));
        
        users.stream().filter((e)->e.getSalary()>65000).forEach((u)->System.out.println(u.toString()));
        
        List<String> namesWithP = users.stream().map((u)->u.getName())
        		.filter(name -> name.startsWith("P"))
        		.collect(Collectors.toList());
            System.out.println(namesWithP);
            
      
        List<User> salary= users.stream()
                .filter(u -> u.getSalary() > 60000)
                .collect(Collectors.toList());
                salary.forEach(u -> System.out.println(u.getName() + ": " + u.getSalary()));
                
        List<String> upper = users.stream()
                  .map(u -> u.getName().toUpperCase())
                  .collect(Collectors.toList());
                  System.out.println(upper);
                  
        Map<Integer, String> mpp = users.stream()
                    .collect(Collectors.toMap(User::getUid, User::getName));
                    System.out.println(mpp);
        
        
       Collections.sort(users,(u1,u2)->u1.getSalary().compareTo(u2.getSalary()));
        
        users.stream().forEach((e)->System.out.println(e.toString()));
        
         System.out.println(users.stream().max((u1, u2) -> Double.compare(u1.getSalary(), u2.getSalary())));
         System.out.println(users.stream().min((u1, u2) -> Double.compare(u1.getSalary(), u2.getSalary())));
         
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter employee name: ");
         String name = sc.nextLine();
         
         System.out.println(
        		    users.stream()
        		         .filter(u -> u.getName().equalsIgnoreCase(name))
        		         .findFirst()
        		         .map(u -> "Salary of " + name + " is: " + u.getSalary())
        		         .orElse("Employee not found!")
        		);
         
	}

}
