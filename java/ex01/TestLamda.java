package ex01;

import java.util.Comparator;

import java8.data.domain.Pizza;

public class TestLamda {

	public static void main(String[] args) {
		
		Comparator<Pizza> c = new Comparator<Pizza>() {

			@Override
			public int compare(Pizza o1, Pizza o2) {
				return o1.getPrice().compareTo(o2.getPrice());
			}
		};
		
		Comparator<Pizza> c2 = (Pizza o1, Pizza o2) -> {
				
				return o1.getPrice().compareTo(o2.getPrice());
		};
		
		Comparator<Pizza> c3 = (Pizza o1, Pizza o2) ->
			
			 o1.getPrice().compareTo(o2.getPrice());
			 
		Comparator<Pizza> c4 = ( o1, o2) ->
				 o1.getPrice().compareTo(o2.getPrice());
	}
}
