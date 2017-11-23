package de.hhu.stups.springhello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import de.hhu.stups.springhello.pojos.SequenceGenerator;

public class Hello1 {

	public static void main(String[] args) {

		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
			SequenceGenerator gen = context.getBean(SequenceGenerator.class);

			int[] sequence = gen.getSequence(10);
			for (int element : sequence) {
				System.out.println(element);
			}
		}
	}
}
