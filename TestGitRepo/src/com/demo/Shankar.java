package com.demo;

<<<<<<< HEAD
import java.util.Arrays;
=======
import java.util.ArrayList;
>>>>>>> branch 'master_Shankar' of https://github.com/textrahul98-glitch/testGit
import java.util.List;

public class Shankar {

<<<<<<< HEAD
	 public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(10,5,20,15,16,12,30);
	    list.stream().filter(x-> x%2 ==0).forEach(p->System.out.println(p));
	  }
=======
	public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			list.add(12);
			list.add(20);
			list.add(37);
			list.add(15);
			list.add(5);
			list.add(42);
			System.out.println("Original list : " +list);
			list.stream().filter(x->x%2==0).forEach(p->System.out.println(p));
	}
>>>>>>> branch 'master_Shankar' of https://github.com/textrahul98-glitch/testGit
}
