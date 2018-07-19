import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LongestWordInATextTest {
	LongestWordInAText obj;
	
	@Before
	public void setUp() throws Exception {
		 obj = new LongestWordInAText();
	}

	@Test
	public void testLongWordStrings() {
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Randhinaa","Adaikalam","9"));
		ArrayList<String> actual = obj.longWord("Randhinaa Susai Adaikalam Xavier Prince");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLongWordNull() {
		ArrayList<String> expected = null;
		ArrayList<String> actual = obj.longWord(null);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLongWordEmpty() {
		ArrayList<String> expected = null;
		ArrayList<String> actual = obj.longWord("");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLongWordNumber() {
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("7890","4"));
		ArrayList<String> actual = obj.longWord("123 456 7890");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLongWordMultipleSpaces() {
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("A","B","1"));
		ArrayList<String> actual = obj.longWord("A           B");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLongWordSpace() {
		ArrayList<String> expected = null;
		ArrayList<String> actual = obj.longWord(" ");
		assertEquals(expected, actual);
	}
	@Test
	public void testLongWordPunctuations() {
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("there","5"));
		ArrayList<String> actual = obj.longWord("Hi there!!");
		assertEquals(expected, actual);
	}
	@Test
	public void testLongWordTab() {
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("there","5"));
		ArrayList<String> actual = obj.longWord("Hi	there");
		assertEquals(expected, actual);
	}
	
	@After
	public void tearDown() throws Exception {
		obj = null;
	}
}
