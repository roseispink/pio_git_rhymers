package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int IS_EMPTY = -1;
	public static final int CAPACITY = 12;
	public static final int IS_FULL = CAPACITY - 1;
	private final int[] numbers = new int[CAPACITY];

	public int INITIAL = IS_EMPTY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++INITIAL] = in;
	}

	public boolean callCheck() {
		return INITIAL == IS_EMPTY;
	}

	public boolean isFull() {
		return INITIAL == IS_FULL;
	}

	protected int peekaboo() {
		if (callCheck())
			return IS_EMPTY;
		return numbers[INITIAL];
	}

	public int countOut() {
		if (callCheck())
			return IS_EMPTY;
		return numbers[INITIAL--];
	}

}
