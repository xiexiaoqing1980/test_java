package bitCount;

public class Count1 {
	public int hammingWeight(int n) {

		int count=0;

		for(int i=0;i<32;i++){ //不能用while，因为最高位的补位不一定是0，请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的；

//		java中的都是有符号位的；

//		、、注意负数是以补码的形式呈现的

		if((n&1)==1){  //(n&1)==1标明最低位为1

		count+=1;
		}

		n=n>>1;

		}

		return count;
	}
	
	public int hammingWeight2(int n) {

		int count=0;

		while(n!=0){

		count+=1;

		n=n&(n-1); //清零最低位的1

		}

		return count;

		}

		}

