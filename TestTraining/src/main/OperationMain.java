package main;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OperationMain {
	
	
	public  List<List<Integer>> partition(List<Integer> liste, int size){
		if(liste==null) return null;
		if(size==0||liste.size()==0)return Arrays.asList(liste);
		return IntStream.range(0, liste.size())
			    .filter(i -> i % size == 0)
			    .mapToObj(i -> liste.subList(i, Math.min(i + size, liste.size() )))
			    .collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
         System.out.println(new OperationMain().partition(Arrays.asList(1,3,5,3,85,5,22),2));
      

	}

}
