package data_structure;

public class demo2_string {
	public static void main(String[] args) {
		
//		System.out.println(getIndex("wwoaini", "ww", 1));
		System.out.println(index("wwoaini", "ni"));
		
	}
	
	 //
	public  static int getIndex(String s,String T,int pos) {
		
		int n=s.length();
		int m=T.length();
		int i=pos-1;  //对应索引
		
		String sub;
		
		if (pos<=0) {
			return -1;
		}
		
		while (i<=n-m) {
			sub=s.substring(i, m+i);  //dedaizichuan
			
			if (sub.equals(T)) {
				return i+1;
			} else {

				i++;
			}
			
		}
		
		return -1;
		
	}

	
	
	public static int  index(String s,String t){
		if(t==null||t.length()>s.length()){
			return -1;  
		}
		int n=s.length();
		int m=t.length();
		int j=0;   //下标
		String sub;
		while(j<=n-m){
			sub=s.substring(j, m+j);  //dedaizichuan
			
			if (sub.equals(t)) {
				return j+1;
			} else {

				j++;
			}
			
		}
		
		
		return -1;
		
		
	}
}
