package com.demo;

import java.util.Arrays;
import java.util.List;

public class Shankar {

	 public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(10,5,20,15,16,12,30);
	    list.stream().filter(x-> x%2 ==0).forEach(p->System.out.println(p));
	  }
}
