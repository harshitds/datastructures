package com.datastructure.practise;

public class EntryNode<K,V> {
	
	private K key;
	private V value;

	private EntryNode<K,V> next;
	
	
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntryNode other = (EntryNode) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}



public EntryNode(K key, V value, EntryNode<K, V> next) {
	//super();
	this.key = key;
	this.value = value;
	this.next = next;
}

public K getKey() {
	return key;
}

public void setKey(K key) {
	this.key = key;
}

public V getValue() {
	return value;
}

public void setValue(V value) {
	this.value = value;
}

public EntryNode<K, V> getNext() {
	return next;
}

public void setNext(EntryNode<K, V> next) {
	this.next = next;
}
	
	

}
