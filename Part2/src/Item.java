public class Item
{
	String itemID;
	double itemPrice;
	int itemStock;
	
	public Item() {}
	
	/**
	 * @param itemID
	 */
	public Item(String itemID)
	{
		this.itemID = itemID;
		this.itemPrice = 0;
	}
	
	/**
	 * @param itemID
	 * @param itemPrice
	 */
	public Item(String itemID, double itemPrice)
	{
		this.itemID = itemID;
		this.itemPrice = itemPrice;
	}
	
	/**
	 * @param itemID
	 * @param itemPrice
	 * @param itemStock
	 */
	public Item(String itemID, double itemPrice, int itemStock)
	{
		this.itemID = itemID;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}

	/**
	 * @return the itemID
	 */
	public String getItemID()
	{
		return itemID;
	}

	/**
	 * @param itemID the itemID to set
	 */
	public void setItemID(String itemID)
	{
		this.itemID = itemID;
	}

	/**
	 * @return the itemPrice
	 */
	public double getItemPrice()
	{
		return itemPrice;
	}

	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(double itemPrice)
	{
		this.itemPrice = itemPrice;
	}

	/**
	 * @return the itemStock
	 */
	public int getItemStock()
	{
		return itemStock;
	}

	/**
	 * @param itemStock the itemStock to set
	 */
	public void setItemStock(int itemStock)
	{
		this.itemStock = itemStock;
	}
}
