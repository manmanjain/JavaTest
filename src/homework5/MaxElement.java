package homework5;

public class MaxElement {
	public int[][] intArray;
	public double[][] doubleArray;

	public MaxElement() {

	}

	public MaxElement(int[][] intArray) {
		this.intArray = intArray;
	}

	public MaxElement(double[][] doubleArray) {
		this.doubleArray = doubleArray;
	}

	public int[][] getIntArray() {
		return intArray;
	}

	public int setMaxElement(int[][] array) {

		intArray = array;
		int element = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > element) {
					element = array[i][j];
				}
			}

		}
		return element;

	}

	public double[][] getDoubleArray() {
		return doubleArray;
	}

	public double setMaxElement(double[][] array) {

		doubleArray = array;
		double element = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > element) {
					element = array[i][j];
				}
			}

		}
		return element;

	}

	public static void main(String[] args) {

		MaxElement maxElement = new MaxElement();

		int[][] intArr = { { 1, 6, 3 }, { 9, 5, 2 } };

		double[][] doubleArr = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		

		System.out.println(maxElement.setMaxElement(intArr));
		System.out.println(maxElement.setMaxElement(doubleArr));

	}

}
