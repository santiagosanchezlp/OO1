package ar.edu.unlp.info.oo1.ejercicio16_FilteredSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EvenNumberSet<Integer> implements Set<Integer>{
	private Set<Integer> evenSet;
	
	public EvenNumberSet() {
		evenSet = new HashSet<>();
	}
	
	@Override
	public boolean add(Integer number) {
		if ((int) number % 2 == 0) {
			return evenSet.add(number);
		}
		return false;
	}


	@Override
	public boolean addAll(Collection<? extends Integer> arg0) {
        if (arg0.stream().anyMatch(num-> (int) num % 2 == 1))
        	return false;
        return evenSet.addAll(arg0);
	}

	@Override
	public void clear() {
		evenSet.clear();
		
	}

	@Override
	public boolean contains(Object arg0) {
		return evenSet.contains(arg0);
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		return evenSet.containsAll(arg0);
	}

	@Override
	public boolean isEmpty() {
		return evenSet.isEmpty();
	}

	@Override
	public Iterator<Integer> iterator() {
		return evenSet.iterator();
	}

	@Override
	public boolean remove(Object arg0) {
		evenSet.remove(arg0);
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		evenSet.removeAll(arg0);
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		return evenSet.retainAll(arg0);
	}

	@Override
	public int size() {
		return evenSet.size();
	}

	@Override
	public Object[] toArray() {
		return evenSet.toArray();
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		return evenSet.toArray(arg0);
	}
}
