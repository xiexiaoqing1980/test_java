package hashtable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums,int target){
		if(nums==null || nums.length<2) return null;
		  Map<Integer,Integer> map=new HashMap();
		 for(int i=0;i<nums.length;i++){
	            map.put(nums[i],i);
	        } 
		 for (int i=0;i<nums.length;i++) {
			 int temp=target-nums[i];
			 if(map.containsKey(temp)&&map.get(temp)!=i){
				 return new int[]{i,map.get(temp)};
		}
      }
		 return null;
	}
}
