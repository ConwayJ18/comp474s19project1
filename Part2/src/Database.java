import java.util.HashMap;

public class Database 
{
	static HashMap<Integer, Item> itemList = new HashMap<Integer, Item>();
	
	static void addItem(int id)
	{
		itemList.put(id, new Item(id));
	}
	
	static void addItem(int id, double price)
	{
		itemList.put(id, new Item(id, price));
	}
	
	static void addItem(int id, double price, int stock)
	{
		itemList.put(id, new Item(id, price, stock));
	}
	
	static void removeItem(int id)
	{
		itemList.remove(id);
	}
	
	static Item getItem(int id)
	{
		return itemList.get(id);
	}
}