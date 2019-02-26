import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class ShoppingCartTest 
{
	@Test
	void primaryCheckoutTests()
	{
		//Expected outputs, numbered according to previously submitted document
		String[] eo1 = new String[] {"TooManyItemsError"};
		String[] eo2 = new String[] {"83.10", "15.79", "0.00", "67.31"};
		String[] eo3 = new String[] {"83.10", "15.79", "3.03", "70.34"};
		String[] eo4 = new String[] {"83.10", "4.15", "0.00", "78.95"};
		String[] eo5 = new String[] {"83.10", "0.00", "3.74", "86.84"};
		
		//Tests, numbered according to previously submitted document
		assertArrayEquals(eo1, sc.calculatePurchasePrice(tooLargeCart, c3));
		assertArrayEquals(eo2, sc.calculatePurchasePrice(largeCart, c3));
		assertArrayEquals(eo3, sc.calculatePurchasePrice(largeCart, c2));
		assertArrayEquals(eo4, sc.calculatePurchasePrice(mediumCart, c4));
		assertArrayEquals(eo5, sc.calculatePurchasePrice(smallCart, c1));
	}
	
	@Test
	void baCheckoutTests()
	{
		//Expected outputs, numbered according to previously submitted document
		String[] eo6 = new String[] {"TooManyItemsError"};
		String[] eo7 = new String[] {"83.10", "8.31", "0.00", "74.79"};
		String[] eo8 = new String[] {"83.10", "8.31", "0.00", "74.79"};
		String[] eo9 = new String[] {"83.10", "8.31", "0.00", "74.79"};
		String[] eo10 = new String[] {"83.10", "8.31", "0.00", "74.79"};
		String[] eo11 = new String[] {"83.10", "4.15", "0.00", "78.95"};
		String[] eo12 = new String[] {"83.10", "4.15", "0.00", "78.95"};
		String[] eo13 = new String[] {"83.10", "4.15", "0.00", "78.95"};
		String[] eo14 = new String[] {"83.10", "0.00", "0.00", "83.10"};
		
		//Tests, numbered according to previously submitted document
		assertArrayEquals(eo6, sc.calculatePurchasePrice(fiftyOne, c4));
		assertArrayEquals(eo7, sc.calculatePurchasePrice(fifty, c4));
		assertArrayEquals(eo8, sc.calculatePurchasePrice(fortyNine, c4));
		assertArrayEquals(eo9, sc.calculatePurchasePrice(eleven, c4));
		assertArrayEquals(eo10, sc.calculatePurchasePrice(ten, c4));
		assertArrayEquals(eo11, sc.calculatePurchasePrice(nine, c4));
		assertArrayEquals(eo12, sc.calculatePurchasePrice(six, c4));
		assertArrayEquals(eo13, sc.calculatePurchasePrice(five, c4));
		assertArrayEquals(eo14, sc.calculatePurchasePrice(four, c4));
	}
	
	@Test
	void roundOffTests()
	{
		assertEquals("123.46", ShoppingCart.roundOff(123.4567));
		assertEquals("98765.43", ShoppingCart.roundOff(98765.4321));
		assertEquals("555.56", ShoppingCart.roundOff(555.5555));
		assertEquals("10.00", ShoppingCart.roundOff(10.004));
		assertEquals("5.52", ShoppingCart.roundOff(5.52));
		assertEquals("9.40", ShoppingCart.roundOff(9.4));
		assertEquals("7.00", ShoppingCart.roundOff(7));
	}
}