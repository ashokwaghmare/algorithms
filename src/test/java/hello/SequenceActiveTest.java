package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class SequenceActiveTest {

	private SequenceActive sequenceActive = new SequenceActive();

	/*@Test
	public void greeterSaysHello() {
		assertThat(sequenceActive.sayHello(), containsString("Hello"));
	}*/

	@Test
	public void generateForSeqOneElem() {
		//int[] input = {1, 0, 0, 0, 0, 1, 0, 0};
		//int[] output= {0, 1, 0, 0, 1, 0, 1, 0};
		int[] input = {1};
		int[] output = {0};
		assertArrayEquals(sequenceActive.getForOneADay(input) , output);
	}

	@Test
	public void generateForSeqTwo() {
		//int[] input = {1, 0, 0, 0, 0, 1, 0, 0};
		//int[] output= {0, 1, 0, 0, 1, 0, 1, 0};
		int[] input = {1, 0};
		int[] output = {0, 1};
		assertArrayEquals(sequenceActive.getForOneADay(input) , output);
	}

	@Test
	public void generateForSeqMultiple() {
		//int[] input = {1, 0, 0, 0, 0, 1, 0, 0};
		//int[] output= {0, 1, 0, 0, 1, 0, 1, 0};
		int[] input = {1, 0, 0, 0};
		int[] output = {0, 1, 0, 0};
		assertArrayEquals(sequenceActive.getForOneADay(input) , output);
	}

	@Test
	public void generateForSeqMultipleMore() {
		int[] input = {1, 0, 0, 0, 0, 1, 0, 0};
		int[] output= {0, 1, 0, 0, 1, 0, 1, 0};
		assertArrayEquals(sequenceActive.getForOneADay(input) , output);
	}

}
