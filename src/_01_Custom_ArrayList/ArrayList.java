package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	private T array[];

	public ArrayList() {
		array = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {

		return array[loc];
	}

	public void add(T val) {
		T array4 [] = (T[]) new Object[array.length+1];
		for (int x = 0; x<array.length; x++) {
			array4[x] = array[x];
		}
		array4[array4.length-1] = val;
		array = array4;

	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T array2[] = (T[]) new Object[array.length+1];
		for (int x = 0; x < loc; x++) {
			array2[x] = array[x];
		}
		array2[loc] = val;
		for (int x = loc; x < array.length; x++) {
			array2[x + 1] = array[x];
		}
		array = array2;
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T array3[] = (T[]) new Object[array.length-1];
		
		for (int x = 0; x<loc; x++) {
		array3[x] = array[x];
	}
		for (int x = loc+1; x<array.length; x++) {
			array3[x-1] = array[x];
		}
		array = array3;
}
	public boolean contains(T val) {
		boolean contains = false;
for (int x = 0; x<array.length; x++) {
	if (array[x] == val) {
		contains = true;
	}
}
		return contains;
	}

	public int size() {
		
		return array.length;
	}
}