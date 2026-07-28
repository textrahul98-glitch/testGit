package com.demo;

import java.util.Arrays;
import java.util.List;

public class OddEven {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5);
	list.stream().filter(x->x%2==0).forEach(p->System.out.println(p));
	
}
}
