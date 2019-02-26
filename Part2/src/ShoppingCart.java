import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class ShoppingCart 
{
	ShoppingCart() {}
	
	String[] calculatePurchasePrice(List<String> ProductIDs, Customer customer)
	{
		//Declare variables & values associated with customer
	    boolean discountClubMember = customer.isDiscountMember();
	    boolean taxExempt = customer.isTaxExempt();
	    
	    //Declare variables & values associated with cart
	    double originalPrice = 0;
	    int itemQuantity = ProductIDs.size();
	    double percentTax = .045;
	    double finalPrice = 0;
	    double discountPrice;
	    double netDiscount;
	    double netTax;
		
		//Calculate a total price before any modifications
		for(String product : ProductIDs)
		{
			originalPrice += Database.getItem(product).getItemPrice();
		}
		
		//Discount price should match original price initially
		discountPrice = originalPrice;
		
		//Calculate quantity based discounts & errors
	    if(itemQuantity > 50)
	    {
	      return new String[] {"TooManyItemsError"};
	    }
	    else if(itemQuantity >= 10)
	    {
	      discountPrice *= .9; //Discount by 10%
	    }
	    else if(itemQuantity >= 5)
	    {
	      discountPrice *= .95; //Discount by 5%
	    }

	    if(discountClubMember)
	    {
	      discountPrice *= .9; //Discount by 10%
	    }

	    if(taxExempt)
	    {
	      percentTax = 0; //Delete tax if tax-exempt
	    }

	    //Do pre-Tax Rounding
	    originalPrice = roundOff(originalPrice);
	    discountPrice = roundOff(discountPrice);
	    
	    //Add tax
	    finalPrice = discountPrice*(1+percentTax);

	    //Do post-Tax Rounding
	    finalPrice = roundOff(finalPrice);
	    
	    //Make calculations & round
	    netDiscount = roundOff(originalPrice - discountPrice);
	    netTax = roundOff(finalPrice-discountPrice);
	    
	    //Return all values, formatted as US dollars
	    return new String[]{"$" + String.format("%.2f", originalPrice),
	    					"$" + String.format("%.2f", netDiscount),
	    					"$" + String.format("%.2f", netTax),
	    					"$" + String.format("%.2f", finalPrice)};
	}
	
	public static double roundOff(double price)
	{
		DecimalFormat df = new DecimalFormat("0.00"); //Round to two decimals
		String temp = String.valueOf(price).substring(String.valueOf(price).indexOf(".")); //Save only the decimal part
		if(temp.length() > 3) //Prevents errors that would result from following check
		{
			if(temp.substring(3,4).equals("5")) //Prevents breakage when input is "X.XX5"
			{
				df.setRoundingMode(RoundingMode.UP); //Round up if the third decimal is 5
			    return Double.valueOf(df.format(price));
			}
		}
		df.setRoundingMode(RoundingMode.HALF_UP); //Round normally otherwise
	    return Double.valueOf(df.format(price));
	}
}