package uniquehashmap;

import java.util.*;



public class UniqueHashMap<K, V> extends HashMap<K , V>{
	
	
	private  Map<K, V> uhash;
	
	public V put(K key, V value){
		
		boolean exist = true;
		
		for (K keys: this.keySet()){
	
			
			if (this.get(keys) == value){
				
				this.remove(keys);
				V v = super.put(key, value);
				
				exist = false;
				return v;
			}
			
		}
			
		V v = super.put(key, value);
		return v;
		
	}
	
	
}
