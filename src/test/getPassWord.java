package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class getPassWord {
	
	
	
	
	
	
	public static List getpass(int n,int dimension) {
		
		List<Point1> result = new ArrayList<>();
		List<Point1> points = new ArrayList<>();
		List<Point1> origins = new ArrayList<>();
		
		//初始化值
		int value=1;
		for(int x=0;x<dimension;x++) {
			
			for(int y=0;y<dimension;y++) {
				
				origins.add(new Point1(x,y,value));
				value++;
			}
		}
		
		//随机取索引
		Collections.copy(origins, points); //复制list
		Random ran=new Random();
		while(result.size()<n) {
			int index=ran.nextInt(points.size());
			Point1 point=points.get(index);
			if(result.isEmpty()) {
				result.add(point);
				points.remove(index);
			}
			
			
		}
		
		
		
		
		return null;
		
	}

}

class Point1{
	
	private int x;
	private int y;
	private int value;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public Point1(int x, int y, int value) {
		super();
		this.x = x;
		this.y = y;
		this.value = value;
	}
	
	
}
