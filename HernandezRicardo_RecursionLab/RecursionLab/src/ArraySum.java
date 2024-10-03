/**
 * @author Ricardo Hernandez
 */
public class ArraySum {
	public int sumOfArray(Integer[] a, int index) {
		
		int accumulator = 0;
		/*
		 * Base case: Occurs when index = 0 because that means
		 * that all elements have been summed
		 * In this case, the method should stop
		 */
		/*if(index == 0) {
			accumulator = a[index];
		}*/
		/*
		 * Recursive case: Occurs when index = 0, elements still
		 * need to be summed
		 * In this case, the method should call itself recursively with
		 * index - 1
		 */
		/*
		else {
			accumulator = a[index] + sumOfArray(a, index - 1);
		}
		*/
		accumulator = (index == 0 ? a[index] : a[index] + sumOfArray(a, index -1));
		return accumulator;
	}
}
