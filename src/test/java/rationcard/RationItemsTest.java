package rationcard;

import static org.junit.Assert.*;

import org.junit.Test;

public class RationItemsTest {

	@Test
	public void test() {
		String name = "wheat";
		String price = RationItems.weight(name);
		assertEquals("5 kg", price);
	}
	
	@Test
	public void test1() {
		String name = "rice";
		String price = RationItems.weight(name);
		assertEquals("10 kg", price);
	}
}
