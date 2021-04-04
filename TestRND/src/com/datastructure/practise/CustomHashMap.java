package com.datastructure.practise;



public class CustomHashMap<K,V> {
	
	static final int DEFAULT_INITIAL_CAPACITY = 16;
	private EntryNode<K, V> [] table;
	
	public CustomHashMap()
	{
		table=new EntryNode[DEFAULT_INITIAL_CAPACITY];
	}
	
	public CustomHashMap(int capacity)
	{
		table=new EntryNode[capacity];
	}
	
	
	static final int hash(Object paramObject) {
		int i;
		return paramObject == null ? 0 : (i = paramObject.hashCode()) ^ i >>> 16;
	}
	
	public V put(K key,V value)
	{
		EntryNode<K,V> newEntry=new EntryNode<K, V>(key, value, null);
		int index = hash(key.hashCode());
		if(table[index]==null)
		{
			table[index]=newEntry;
		}
		else
		{
			EntryNode<K, V> previousNode = null;
			EntryNode<K, V> currentNode = table[index];
            while(currentNode != null){
                if(currentNode.getKey().equals(key)){
                    currentNode.setValue(value);
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            if(previousNode != null)
                previousNode.setNext(newEntry);
            }
			
		
		return null;
		
	}
	
	public V get(K key){
        V value = null;
        int index = hash(key);
        EntryNode<K, V> entry = table[index];
        while (entry != null){
            if(entry.getKey().equals(key)) {
                value = entry.getValue();
                break;
            }
            entry = entry.getNext();
        }
        return value;
    
	}
	
}
