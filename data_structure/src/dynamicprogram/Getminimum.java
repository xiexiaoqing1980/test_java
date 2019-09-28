package dynamicprogram;

import java.util.ArrayList;
import java.util.List;

public class Getminimum {
	
	private static Integer[][] memo;
    public  static int minimumTotal(List<List<Integer>> triangle) {
    	
    	
        int level=triangle.size();
        memo=new Integer[level][level];

        return getmin(0,0,triangle,level);

    }

    public static int getmin(int row,int y,List<List<Integer>> triangle,int level){
        if(row==level-1){
        	 if(memo[row][y]!=null) {
             	return memo[row][y];
             }
        	memo[row][y]=triangle.get(row).get(y);
            return memo[row][y];
        }
        //此处使用到了分治
        int left=getmin(row+1,y,triangle,level);
        int right=getmin(row+1,y+1,triangle,level);
        if(memo[row][y]!=null) {
        	return memo[row][y];
        }
         //下一层的最小值加上本层的值
        return memo[row][y]= Math.min(left,right)+triangle.get(row).get(y);
    }

    
 public  static List<String> getAllPath(List<List<Integer>> triangle) {
    	
    	
        int level=triangle.size();
        
        List<String> result=new ArrayList();
        getPath(0,0,triangle,level,"",result);
        
        
		return result;
        

    }
 
 
 public static  void getPath(int row,int y,List<List<Integer>> triangle,int level,String str,List<String> result){
	 if(row==level-1) {
		 result.add(str+triangle.get(row).get(y).toString());
	 }else {
		 getPath(row+1,y,triangle,level,str+triangle.get(row).get(y).toString(),result);
		 getPath(row+1,y+1,triangle,level,str+triangle.get(row).get(y).toString(),result);
	 }
	 
		 
	 }
 
 public static int GetMinDp(List<List<Integer>> triangle) {
	 int row=triangle.size();
	 
	 int[] temp=new int[row+1];
	 for(int i=triangle.size()-1;i>=0;i--) {
		 for(int j=0;j<triangle.get(i).size();j++) {
			 temp[j]=triangle.get(i).get(j)+Math.min(temp[j], temp[j+1]);
			 System.out.println(temp[j]);
		 }
		 
	 }
	 
	 return temp[0];
	 
 }
	 
	 
 

}
