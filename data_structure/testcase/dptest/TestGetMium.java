package dptest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import dynamicprogram.Getminimum;
import test.passWord;


public class TestGetMium {
	
	private  List<List<Integer>> triangle=getTriangle();
	
	
	public static List<List<Integer>> getTriangle() {
		List<List<Integer>> triangle=new ArrayList();
		triangle.add(Arrays.asList(2));
		triangle.add(Arrays.asList(3,4));
		triangle.add(Arrays.asList(6,5,7));
		triangle.add(Arrays.asList(4,1,8,3));
		return triangle;
		
		
	}
	
	
	@Test
	public  void testgetmin() {
		
		int min=Getminimum.minimumTotal(triangle);
		System.out.println(min);
		
	}
	
	
	@Test
	public  void GetMinDp() {
		
		int min=Getminimum.GetMinDp(triangle);
		System.out.println(min);
		
	}
	
	
	
	@Test
public  void testgetAllPath() {
		
		List<String> result=Getminimum.getAllPath(triangle);
		for (String path : result) {
			System.out.println(path);
		}
		
		
	}
	
	@Test
	public  void testJunit() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
			
			passWord word=new passWord();
			word.setname("12354");
			Class<?> clazz=word.getClass();
			Field field = clazz.getDeclaredField("password");
			field.setAccessible(true);
			String value=(String) field.get(word);
			assertEquals(value, "12354", "TRUE");
			
			
		}
	
	
	

}
