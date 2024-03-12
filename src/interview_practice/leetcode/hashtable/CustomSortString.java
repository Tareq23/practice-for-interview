package interview_practice.leetcode.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CustomSortString {

	public static String customSortString(String order, String s)
	{
//		Map<Character, Integer> orderMap = new HashMap<>();
		
//        for(int i = 0; i < order.length(); i++){
//            orderMap.put(order.charAt(i), i);
//        }
        Map<Character, Integer> sMap = new HashMap<>();

        StringBuffer res = new StringBuffer("");

        for(int i = 0; i < s.length(); i++)
        {
            if(sMap.containsKey(s.charAt(i)))
            {
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
                continue;
            }

            sMap.put(s.charAt(i), 1);
        }
        

        for(int i = 0; i < order.length(); i++)
        {
        	if(sMap.containsKey(order.charAt(i))) {
        		int temp = sMap.get(order.charAt(i));
        		for(int k = 1; k <= temp; k++) {
        			res.append(order.charAt(i));
        		}
        		sMap.put(order.charAt(i), -1);
        	}
        }
        
        for(Map.Entry<Character, Integer> entry : sMap.entrySet())
        {
        	int temp = entry.getValue();
    		while(temp > 0) {
    			res.append(entry.getKey());
    			temp--;
    		}
        }


        return res.toString();
	}
	
	public static void main(String[] args) {
		
		
		String order = "bcafg", s = "abcd";
		
		String res = customSortString(order, s);
		System.out.println(res);

	}

}
