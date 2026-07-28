package com.demo;
import java.util.*;

public class NewFile {
		public static void main(String [] args) {
			List<Integer> l1=new ArrayList<>();
			l1.add(1);
			l1.add(76);
			l1.add(71);
			l1.add(7);
			l1.add(70);
			l1.add(71);
			System.out.println(l1);
			l1.stream().map(i->i/2).forEach(s -> System.out.println(s));
		}

	}


