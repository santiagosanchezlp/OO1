package ar.edu.unlp.info.oo1.ejercicio16_FilteredSet;

import java.util.HashMap;
import java.util.HashSet;

public class EvenNumberSet<Integer> extends HashSet<Integer>{
	
	public EvenNumberSet() {
		map = new HashMap<>();
	}
	
	public void add(int number) {
		if (number % 2 == 0) {
			map.super.add(number);
		}
			
	}
}
