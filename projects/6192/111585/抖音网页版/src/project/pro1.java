package project;

import java.util.*;

class set{
	LinkedList<String> list = new LinkedList<String>();
	Scanner sc = new Scanner(System.in);
	int length=sc.nextInt();
	for(int i=0;i<length;i++) {
		String input=sc.nextLine();
		list.add(input);
		
	}
}

public class pro1 {
	
	public static void main(String[] args) {
		set s= new set();
		System.out.print(s.length);
		
	}
}
