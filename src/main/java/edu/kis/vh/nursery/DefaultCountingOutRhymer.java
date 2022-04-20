package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int isEmpty = -1;
	public static final int arraySize = 12;
	public static final int isFull = arraySize - 1;
	private final int[] numbers = new int[arraySize];

	public int initial = isEmpty;

	public void countIn(int in) {
		if (!isFull())
			numbers[++initial] = in;
	}

	public boolean callCheck() {
		return initial == isEmpty;
	}

	public boolean isFull() {
		return initial == isFull;
	}

	protected int peekaboo() {
		if (callCheck())
			return isEmpty;
		return numbers[initial];
	}

	public int countOut() {
		if (callCheck())
			return isEmpty;
		return numbers[initial--];
	}

}
