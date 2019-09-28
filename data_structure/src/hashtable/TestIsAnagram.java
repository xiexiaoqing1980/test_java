package hashtable;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestIsAnagram {

	@Test
	public void test() {
		
		 boolean result=isAnagram.isAnnagram3("aab", "bdcaa");
		 Assert.assertTrue(result);
	}

}
