public class Item
{
	int itemID;
	double itemPrice;
	int itemStock;
	
	public Item() {}
	
	/**
	 * @param itemID
	 */
	public Item(int itemID)
	{
		this.itemID = itemID;
		this.itemPrice = 0;
	}
	
	/**
	 * @param itemID
	 * @param itemPrice
	 */
	public Item(int itemID, double itemPrice)
	{
		this.itemID = itemID;
		this.itemPrice = itemPrice;
	}
	
	/**
	 * @param itemID
	 * @param itemPrice
	 * @param itemStock
	 */
	public Item(int itemID, double itemPrice, int itemStock)
	{
		this.itemID = itemID;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}

	/**
	 * @return the itemID
	 */
	public int getItemID()
	{
		return itemID;
	}

	/**
	 * @param itemID the itemID to set
	 */
	public void setItemID(int itemID)
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
