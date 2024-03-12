package interview_practice.collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElement {

	class Pair{
		int x, y;
		Pair(int _x, int _y){
			x = _x;
			y = _y;
		}
	}
	
	 public int[] topKFrequent(int[] nums, int k) {
	        Map<Integer, Integer> map = new HashMap<>();
	        int[] res = new int[k];
	        for(int i = 0; i < nums.length; i++)
	        {
	            if(map.containsKey(nums[i])){
	                map.put(nums[i], map.get(nums[i])+1);
	            }
	            else{
	                map.put(nums[i], 1);
	            }
	        }
	        List<Pair> list = new ArrayList<>();
	        for(Map.Entry<Integer, Integer> item: map.entrySet())
	        {
	        	System.out.println(item.getKey()+" : "+item.getValue());
	        	list.add(new Pair(item.getKey(), item.getValue()));
	        }
	        
//	        list.sort((e1, e2) -> {
//	        	return e2.y > e1.y? 100 : -1;
//	        });
	        
	        list.sort(Comparator.comparingInt((Pair p) -> p.y).reversed());
	        
	        for(int i = 0; i < k; i++) {
	        	res[i] = list.get(i).x;
	        }
	        
	        return res;
	    }
	
	public static void main(String[] args) {
		
		TopKFrequentElement obj = new TopKFrequentElement();
		
		int[] nums = {1,2,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,5,5,5,5,6,6,6,6,6,6,6,6};
		int[] res = obj.topKFrequent(nums, 2);
		
		System.out.println();
		for(int i = 0; i < res.length; i++)
		{
			System.out.print(res[i]+" ");
		}

	}

}
