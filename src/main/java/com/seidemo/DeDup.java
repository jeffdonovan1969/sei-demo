package com.seidemo;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ArrayUtils;

public class DeDup {

	public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,

            20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,

            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};  

	public int[] removeDuplicates( int[] data ){
		int[] dataNoDuplicates;
		if ( ArrayUtils.isNotEmpty(data) ){
			Set<Integer> set = Arrays.stream(data).boxed().collect(Collectors.toSet());
			dataNoDuplicates = set.parallelStream().mapToInt(Integer::intValue).toArray();
		}
		else {
			dataNoDuplicates = new int[]{};
		}
		return dataNoDuplicates;
	}
	
	public int[] removeDuplicatesWithoutCollections( int[] data ){
		int[] dataNoDuplicates;
		if ( ArrayUtils.isNotEmpty(data) ){
			int end = data.length;
			for (int i = 0; i < end; i++) {
				for (int j = i + 1; j < end; j++) {
					if (data[i] == data[j]) {                  
						data[j] = data[end-1];
						end--;
						j--;
					}
				}
			}
			dataNoDuplicates = new int[end];
			System.arraycopy(data, 0, dataNoDuplicates, 0, end);
		}
		else {
			dataNoDuplicates = new int[]{};
		}
	    return dataNoDuplicates;
	}
	
	public int[] removeDuplicatesPreserveOrder( int[] data ){
		int[] dataNoDuplicates;
		if ( ArrayUtils.isNotEmpty(data) ){
			Set<Integer> set = Arrays.stream(data).boxed().collect(Collectors.toCollection(LinkedHashSet::new));
			dataNoDuplicates = set.parallelStream().mapToInt(Integer::intValue).toArray();
		}
		else {
			dataNoDuplicates = new int[]{};
		}
		return dataNoDuplicates;
	}
	
	public static void main(String [] args) {

	}
}
