package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int isEmpty = -1;
	public static final int arraySize = 12;
	private final int[] numbers = new int[arraySize];

	public int total = isEmpty;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == isEmpty;
	}

	public boolean isFull() {
		return total == arraySize-1;
	}

	protected int peekaboo() {
		if (callCheck())
			return isEmpty;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return isEmpty;
		return numbers[total--];
	}

}
