package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int IS_EMPTY = -1;
	public static final int CAPACITY = 12;
	public static final int IS_FULL = CAPACITY - 1;
	public static final int RETURN_VALUE = -1;
	private final int[] numbers = new int[CAPACITY];

	public int current = IS_EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++current] = in;
	}

	public boolean callCheck() {
		return current == IS_EMPTY;
	}

	public boolean isFull() {
		return current == IS_FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return RETURN_VALUE;
		return numbers[current];
	}

	public int countOut() {
		if (callCheck())
			return RETURN_VALUE;
		return numbers[current--];
	}

}
