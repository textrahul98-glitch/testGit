package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Shankar {

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
}
