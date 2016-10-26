package com.seidemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeDupTest {

	public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,

            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,

            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
	
	// remove Duplicates
	@Test
	public void testRemoveDuplicatesNullArray(){
		int[] noDuplicates = DeDup.removeDuplicates(null);
		assertEquals(noDuplicates.length,0);
	}
	
	@Test
	public void testRemoveDuplicatesEmptyArray(){
		int[] randomIntegers = {};;
		int[] noDuplicates = DeDup.removeDuplicates(randomIntegers);
		assertEquals(noDuplicates.length,0);
	}
	
	@Test
	public void testRemoveDuplicates(){
		int[] randomIntegers = {-1,-1,0,1,1,2,2,4,3,3};
		int[] noDuplicates = DeDup.removeDuplicates(randomIntegers);
		assertEquals(noDuplicates.length,6);
	}
	
	@Test
	public void testRemoveDuplicatesAllDuplicates(){
		int[] randomIntegers = {-1,-1,0,0,1,1,2,2,4,4,3,3};
		int[] noDuplicates = DeDup.removeDuplicates(randomIntegers);
		assertEquals(noDuplicates.length,6);
	}
	
	//removeDuplicatesWithoutCollections
	@Test
	public void testRemoveDuplicatesWithoutCollectionsNullArray(){
		int[] noDuplicates = DeDup.removeDuplicatesWithoutCollections(null);
		assertEquals(noDuplicates.length,0);
	}
	
	@Test
	public void testRemoveDuplicatesWithoutCollectionsEmptyArray(){
		int[] randomIntegers = {};
		DeDup DeDup = new DeDup();
		int[] noDuplicates = DeDup.removeDuplicatesWithoutCollections(randomIntegers);
		assertEquals(noDuplicates.length,0);
	}
	
	@Test
	public void testRemoveDuplicatesWithoutCollections(){
		int[] randomIntegers = {-1,-1,0,1,1,2,2,4,3,3};
		int[] noDuplicates = DeDup.removeDuplicatesWithoutCollections(randomIntegers);
		assertEquals(noDuplicates.length,6);
	}
	
	@Test
	public void testRemoveDuplicatesWithoutCollectionsAllDuplicates(){
		int[] randomIntegers = {-1,-1,0,0,1,1,2,2,4,4,3,3};
		int[] noDuplicates = DeDup.removeDuplicatesWithoutCollections(randomIntegers);
		assertEquals(noDuplicates.length,6);
	}
	
	//removeDuplicates preserve order
	private void testPreserveOrder( int[] dataArray, int[] controlDataArray ){
		assertEquals(dataArray.length,controlDataArray.length);
		for ( int i = 0 ; i < dataArray.length ; i++ ){
			assertEquals(dataArray[i],controlDataArray[i]);
		}
	}
	
	@Test
	public void testRemoveDuplicatesPreserveOrderNullArray(){
		int[] noDuplicates = DeDup.removeDuplicatesPreserveOrder(null);
		assertEquals(noDuplicates.length,0);
	}
	
	@Test
	public void testRemoveDuplicatesPreserveOrderEmptyArray(){
		int[] randomIntegers = {};
		int[] noDuplicates = DeDup.removeDuplicatesPreserveOrder(randomIntegers);
		assertEquals(noDuplicates.length,0);
	}
	
	@Test
	public void testRemoveDuplicatesPreserveOrder(){
		int[] randomIntegers = {1,-1,-1,2,0,0};
		int[] noDuplicates = DeDup.removeDuplicatesPreserveOrder(randomIntegers);
		assertEquals(noDuplicates.length,4);
		testPreserveOrder(noDuplicates, new int[]{1,-1,2,0});
	}
	
	@Test
	public void testRemoveDuplicatesPreserveOrderAllDuplicates(){
		int[] randomIntegers = {1,-1,-1,2,2,0,0};
		int[] noDuplicates = DeDup.removeDuplicatesPreserveOrder(randomIntegers);
		assertEquals(noDuplicates.length,4);
		testPreserveOrder(noDuplicates, new int[]{1,-1,2,0});
		
	}
	
}
