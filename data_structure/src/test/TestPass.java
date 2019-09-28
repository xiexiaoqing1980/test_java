package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestPass {
	public static void main(String[] args) {
		List<Point> points = getPass(3, 5);
		points.forEach(p ->{
			System.out.println(p.getValue());
		});
	}

	private static List<Point> getPass(int n, int size){
		List<Point> result = new ArrayList<>();
		//鍒濆鍖�
		List<Point> points = new ArrayList<>();
		List<Point> origin = new ArrayList<>();
		int value = 1;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				Point p = new Point(i, j, value);
				points.add(p);
				origin.add(p);
				value++;
			}
		}
		Random romdam = new Random();
		while(result.size() < size){
			int index = romdam.nextInt(points.size());
			Point p = points.get(index);
			if(result.isEmpty()){
				result.add(p);
				points.remove(p);
				continue;
			}
			
			//鏍￠獙杩欎袱涓偣杩炴垚鐨勭洿绾挎槸鍚﹀寘鍚叾浠栧尯闂村唴鐨勭偣
			boolean b = false;
			Point lastPoint = result.get(result.size()-1);
			
			int index1 = origin.indexOf(p);
			int index2 = origin.indexOf(lastPoint);
			int minIndex = index1 > index2 ? index2 : index1;
			int maxIndex = index1 < index2 ? index2 : index1;
					
			for(int m = minIndex +1 ; m < maxIndex; m++){
				Point testPoint = origin.get(m);
				b = checkValidData(lastPoint, p, testPoint);
				if(b){
					break;
				}
			}
			if(!b){
				result.add(p);
				points.remove(p);
				continue;
			}
		}
		return result;
	}
	
	private static boolean checkValidData(Point point1, Point point2, Point point3) {
		return (point3.getX() - point1.getX()) * (point1.getY() - point2.getY()) == (point1.getX() - point2.getX())
				* (point3.getY() - point1.getY());
	}
	
}
class Point{
	private int x;
	private int y;
	private int value;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Point(int x, int y, int value){
		this.x = x;
		this.y = y;
		this.value = value;
	}
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
	
}
