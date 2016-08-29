package uniquehashmap;

import java.util.*;

public class uniquehashmapTest {
	
	public static void main(String args[]){
		
        Map<String , String> map1 = new UniqueHashMap<String, String>();
        
        map1.put("blog", "glob");
        
        //System.out.println("the key: blog" + "    the value: " + map1.get("blog"));
        map1.put("1", "h");
        map1.put("2", "e");
        map1.put("3", "l");
        map1.put("4", "l");
        
        map1.put("hello world", "h");
        
        map1.put("blag", "glob");        
        
        for (String keyss: map1.keySet()){
        	
        	System.out.println("the key: " + keyss + "    the value: " + map1.get(keyss));
        }
		
	}

}
