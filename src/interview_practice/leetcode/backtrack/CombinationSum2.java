package interview_practice.leetcode.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
	
	

    private void solve(int[] nums, int pos,int target, List<Integer> list, List<List<Integer>> res){

    	if(target == 0){
    		res.add(new ArrayList<>(list));
    		return;
    	}
        if(pos >= nums.length){
            return;
        }

        for(int i = pos; i < nums.length; i++)
        {
            if(i != pos && nums[i] == nums[i-1]) {
            	System.out.println("\n"+i +" => "+pos);
            	continue;
            }

            if(target - nums[i] >= 0){
                list.add(nums[i]);
                System.out.print("("+nums[i]+" : "+target+"), ");
                solve(nums, i+1, target - nums[i], list, res);
                list.remove(list.size()-1);
            }
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, 0, target, list, res);
        return res;
    }

	public static void main(String[] args) {
		
		
		int[] nums = {10,1,2,7,6,1,5};
		int target = 8;
		
		CombinationSum2 obj = new CombinationSum2();
	
		obj.combinationSum2(nums, target);
	}

}
