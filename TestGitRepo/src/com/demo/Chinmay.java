package com.demo;

import java.util.List;

public class Chinmay {

	public static void main(String[] args) {
		List<Integer> list = List.of(2,5,6,9,8,3,4);
		
		list.stream().filter(x->x%2==0).forEach(s->System.out.println(s));
	}

}
