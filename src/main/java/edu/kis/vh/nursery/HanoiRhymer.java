package edu.kis.vh.nursery;


/**
 * Checks rejected rhymes
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	/**
	 * @return total current sum of rejected rhymers
	 */
	int reportRejected() {
		return totalRejected;
	}


	/**
	 * @param in is written to the current array index of the class DefaultCountingOutRhymer
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
//zle byly 5 i 12-15
//klawisze alt + strzalki w bok poruszaja sie po otwartych kartach