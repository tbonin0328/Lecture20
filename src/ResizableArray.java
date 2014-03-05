
public class ResizableArray implements Stack, Queue
{
	String[] items;
	int count = 0;
	
	public ResizableArray()
	{
		items = new String[4];
	}
	
	public void add(String item)
	{
		if(count == items.length)
		{
			expandArray();
		}
		items[count] = item;
		count++;
	}
	
	private void expandArray()
	{
		//this is about creating another array
		String[] moreItems = new String[items.length * 2];
		
		//copy all the data from items into more items
		for(int i = 0; i < items.length; i++)
		{
			moreItems[i] = items[i];
		}
		
		items = moreItems;
	}
	
	public String get(int index)
	{
		//if they try to access an index beyond where data is
		if(index >= count) return null;
		return items[index];
	}
	
	public int size()
	{
		return count;
	}
	
	public boolean remove(int index)
	{
		//if they are trying to access an item beyond the indexes they've entered
		if(index >= count) return false;
		
		//shift all the items over
		for (int i = index; i < count - 1; i++)
		{
			items[i] = items[i+1];
		}
		
		//get rid of last item
		items[count - 1] = null;
		
		count--;  //reduce the count
		
		return true;  //indicate that we've successfully removed the data
	}
	
	public boolean remove(String item) //method overloading
	{
		//look for the item in the list and remove it if it exists
		for(int i = 0; i < count; i++)
		{
			if(items[i].equals(item))
			{
				return remove(i);
			}
		}
		
		return false;
	}

	@Override
	public void push(String item) 
	{
		add(item);
	}

	@Override
	public String pop() 
	{
		String item = peek();
		remove(count - 1);
		return item;
	}

	@Override
	public String peek() 
	{
		return get(count - 1);
	}

	@Override
	public boolean isEmpty() 
	{
		return count == 0;
	}

	@Override
	public void enqueue(String item) 
	{
		add(item);
	}

	@Override
	public String dequeue() 
	{
		String item = get(0);
		remove(0);
		return item;
	}
	
	//want to test each method: TRY ADDING 4 ITEMS, 5 ITEMS, 0 ITEMS, 8 ITEMS;
	//TRY GETTING -1, -, 4, 5, 8 ITEMS.
	
}

