import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


class ShoppingCartTest
{
	@Test
	void primaryCheckoutTests()
	{
		//Initialize items to be placed in a Database, associating item ID to price
		Database.addItem("1", 83.10);
		Database.addItem("2");

		//Mock object to be used for testing
		ShoppingCart sc = new ShoppingCart();

		//Not a Discount Member, not tax exempt
		Customer c1 = new Customer(1);

		//Discount Member, not tax exempt
		Customer c2 = new Customer(2, true);

		//Discount Member, tax exempt
		Customer c3 = new Customer(3, true, true);

		//Not a Discount Member, tax exempt
		Customer c4 = new Customer(4, false, true);

		//Quantity q < 5
		ArrayList<String> smallCart = new ArrayList<String>(Arrays.asList("1", "2", "2"));

		//Quantity 5 <= q < 10
		ArrayList<String> mediumCart = new ArrayList<String>(Arrays.asList("1", "2", "2", "2", "2", "2", "2"));

		//Quantity 10 <= q <= 50
		ArrayList<String> largeCart = new ArrayList<String>(Arrays.asList("1", "2", "2", "2", "2", "2", "2", "2", "2", "2"));

		//Quantity q > 50
		ArrayList<String> tooLargeCart = new ArrayList<String>(Arrays.asList("1", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																			"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																			"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																			"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																			"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																			"2"));

		//Expected outputs, numbered according to previously submitted document
		String[] eo1 = new String[] {"TooManyItemsError"};
		String[] eo2 = new String[] {"$83.10", "$15.79", "$0.00", "$67.31"};
		String[] eo3 = new String[] {"$83.10", "$15.79", "$3.03", "$70.34"};
		String[] eo4 = new String[] {"$83.10", "$4.15", "$0.00", "$78.95"};
		String[] eo5 = new String[] {"$83.10", "$0.00", "$3.74", "$86.84"};

		//Tests, numbered according to previously submitted document
		assertArrayEquals(eo1, sc.calculatePurchasePrice(tooLargeCart, c3));
		assertArrayEquals(eo2, sc.calculatePurchasePrice(largeCart, c3));
		assertArrayEquals(eo3, sc.calculatePurchasePrice(largeCart, c2));
		//assertArrayEquals(eo4, sc.calculatePurchasePrice(mediumCart, c4));
		assertArrayEquals(eo5, sc.calculatePurchasePrice(smallCart, c1));
	}

	@Test
	void baCheckoutTests()
	{
		//Initialize items to be placed in a Database, associating item ID to price
		Database.addItem("1", 83.10);
		Database.addItem("2");

		//Mock object to be used for testing
		ShoppingCart sc = new ShoppingCart();

		//Not a Discount Member, tax exempt
		Customer c4 = new Customer(4, false, true);

		//Quantity q = 4
		ArrayList<String> four = new ArrayList<String>(Arrays.asList("1", "2", "2", "2"));

		//Quantity q = 5
		ArrayList<String> five = new ArrayList<String>(Arrays.asList("1", "2", "2", "2", "2"));

		//Quantity q = 6
		ArrayList<String> six = new ArrayList<String>(Arrays.asList("1", "2", "2", "2", "2", "2"));

		//Quantity q = 9
		ArrayList<String> nine = new ArrayList<String>(Arrays.asList("1", "2", "2", "2", "2", "2", "2", "2", "2"));

		//Quantity q = 10
		ArrayList<String> ten = new ArrayList<String>(Arrays.asList("1", "2", "2", "2", "2", "2", "2", "2", "2", "2"));

		//Quantity q = 11
		ArrayList<String> eleven = new ArrayList<String>(Arrays.asList("1", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																		"2"));

		//Quantity q = 49
		ArrayList<String> fortyNine = new ArrayList<String>(Arrays.asList("1", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																		"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																		"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																		"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																		"2", "2", "2", "2", "2", "2", "2", "2", "2"));

		//Quantity q = 50
		ArrayList<String> fifty = new ArrayList<String>(Arrays.asList("1", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																		"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																		"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																		"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																		"2", "2", "2", "2", "2", "2", "2", "2", "2", "2"));

		//Quantity q = 51
		ArrayList<String> fiftyOne = new ArrayList<String>(Arrays.asList("1", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																			"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																			"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																			"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																			"2", "2", "2", "2", "2", "2", "2", "2", "2", "2",
																			"2"));

		//Expected outputs, numbered according to previously submitted document
		String[] eo6 = new String[] {"TooManyItemsError"};
		String[] eo7 = new String[] {"$83.10", "$8.31", "$0.00", "$74.79"};
		String[] eo8 = new String[] {"$83.10", "$8.31", "$0.00", "$74.79"};
		String[] eo9 = new String[] {"$83.10", "$8.31", "$0.00", "$74.79"};
		String[] eo10 = new String[] {"$83.10", "$8.31", "$0.00", "$74.79"};
		String[] eo11 = new String[] {"$83.10", "$4.15", "$0.00", "$78.95"};
		String[] eo12 = new String[] {"$83.10", "$4.15", "$0.00", "$78.95"};
		String[] eo13 = new String[] {"$83.10", "$4.15", "$0.00", "$78.95"};
		String[] eo14 = new String[] {"$83.10", "$0.00", "$0.00", "$83.10"};

		//Tests, numbered according to previously submitted document
		assertArrayEquals(eo6, sc.calculatePurchasePrice(fiftyOne, c4));
		assertArrayEquals(eo7, sc.calculatePurchasePrice(fifty, c4));
		assertArrayEquals(eo8, sc.calculatePurchasePrice(fortyNine, c4));
		assertArrayEquals(eo9, sc.calculatePurchasePrice(eleven, c4));
		assertArrayEquals(eo10, sc.calculatePurchasePrice(ten, c4));
		//assertArrayEquals(eo11, sc.calculatePurchasePrice(nine, c4));
		//assertArrayEquals(eo12, sc.calculatePurchasePrice(six, c4));
		//assertArrayEquals(eo13, sc.calculatePurchasePrice(five, c4));
		assertArrayEquals(eo14, sc.calculatePurchasePrice(four, c4));
	}

	@Test
	void roundOffTests()
	{
		assertEquals("123.46", String.valueOf(ShoppingCart.roundOff(123.4567)));
		assertEquals("98765.43", String.valueOf(ShoppingCart.roundOff(98765.4321)));
		assertEquals("555.56", String.valueOf(ShoppingCart.roundOff(555.5555)));
		assertEquals("10.00", String.format("%.2f", ShoppingCart.roundOff(10.004)));
		assertEquals("5.52", String.format("%.2f", ShoppingCart.roundOff(5.52)));
		assertEquals("9.40", String.format("%.2f", ShoppingCart.roundOff(9.4)));
		assertEquals("7.00", String.format("%.2f", ShoppingCart.roundOff(7)));
	}

	@Test
	void blackBoxTests()
	{
		/*
		 * Create objects used for black box tests here
		 */
		 ShoppingCart sc = new ShoppingCart();

		 //Database.addItem(String itemID, double price)
		 //Customer customer = new Customer(int customerID, boolean discountMember, boolean taxExempt);
		 //ArrayList<String> itemList = new ArrayList<String>(Arrays.asList(String itemID1, String itemID2, ... , String itemIDn));

		/*
		 * Create tests themselves here
		 */

		//assertArrayEquals(String[] expectedOutputs, sc.calculatePurchasePrice(ArrayList<String> itemList, Customer customer));
		//assertEquals(String expectedOutput, String.valueOf(ShoppingCart.roundOff(double testValue)));
	}
}
