package search;

public class ImplementSqrt {
public static float sqrt(int x, double d) {
    	
    	if(x==1||x==0) return (float)x;
    	
    	float low=1;    //ֱ��תΪ������
    	float high=x;
    	float mid = 0;
    	while(high-low>d){
    		 mid=(low+high)/2;
    		
    		if(x/mid<mid) {
    			high=mid;
    			
    		}else if(x/mid>mid) {
    			low=mid;
    		}else {
    			return mid;
    		}
    	}
    	
		return mid;
    	
    	
    }
  
    

}
