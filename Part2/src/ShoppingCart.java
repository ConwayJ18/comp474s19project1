import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;

public class ShoppingCart 
{
	ShoppingCart() {}
	
	String[] calculatePurchasePrice(List<String> ProductIDs, Customer customer)
	{
		return null;
	}
	
	public static double roundOff(double price)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
	    return Double.valueOf(df.format(price));
	}
}