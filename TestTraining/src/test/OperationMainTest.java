package test;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import main.OperationMain;

public class OperationMainTest {
	 List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	 OperationMain opt= new OperationMain();
	
	/*@BeforeClass
	public void init() {
		intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	}
*/
	@Test
	public void givenList_whenParitioningIntoNSublists() {
	    List<List<Integer>> sublists = opt.partition(intList, 3);
	 
	    List<Integer> lastPartition = sublists.get(2);
	    List<Integer> expectedLastPartition = Arrays.asList(7, 8);
	    assertEquals(sublists.size(), 3);
	    assertEquals(lastPartition, expectedLastPartition);
	}
	@Test
	public void givenList_whenSizeIsZero() {
	    List<List<Integer>> sublists = opt.partition(intList, 0);
	 
	    List<Integer> lastPartition = sublists.get(0);
	    List<Integer> expectedLastPartition = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	    assertEquals(sublists.size(), 1);
	    assertEquals(lastPartition, expectedLastPartition);
	}
	// 
	@Test
	public void givenList_whenListIsEmpty_thenCorrect() {
	    List<List<Integer>> sublists = opt.partition(Arrays.asList(), 4);
	 
	    List<Integer> lastPartition = sublists.get(0);
	    List<Integer> expectedLastPartition = Arrays.asList();
	    assertEquals(sublists.size(), 1);
	    assertEquals(lastPartition, expectedLastPartition);
	}
	@Test
	public void givenList_whenListIsNull_thenCorrect() {
	    List<List<Integer>> sublists = opt.partition(null, 4);
	 
	    assertEquals(sublists, null);
	}
	
}
