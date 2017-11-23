package de.hhu.stups.springhello.pojos;

public class SequenceGenerator {

	private NumberGenerator generator;

	public SequenceGenerator(NumberGenerator generator) {
		this.generator = generator;
	}

	public int[] getSequence(int size) {
		int[] res = new int[size];
		for (int i = 0; i < res.length; i++) {
			res[i] = generator.nextNumber();
		}
		return res;
	}

}
