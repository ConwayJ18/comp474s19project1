import java.util.HashMap;

public class Database 
{
	static HashMap<String, Item> itemList = new HashMap<String, Item>();
	
	static void addItem(String id)
	{
		itemList.put(id, new Item(id));
	}
	
	static void addItem(String id, double price)
	{
		itemList.put(id, new Item(id, price));
	}
	
	static void addItem(String id, double price, int stock)
	{
		itemList.put(id, new Item(id, price, stock));
	}
	
	static void removeItem(String id)
	{
		itemList.remove(id);
	}
	
	static Item getItem(String id)
	{
		return itemList.get(id);
	}
}