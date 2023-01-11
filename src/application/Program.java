package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer>list = new HashSet<>();

		System.out.print("How many Students in the course A? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			list.add(id);	
			
		}
		
		System.out.print("How many Students in the course B? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			list.add(id);	
			
		}
		System.out.print("How many Students in the course C? ");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			list.add(id);	
			
		}
		
		System.out.println("Total Students: " + list.size());


		sc.close();

	}

}
