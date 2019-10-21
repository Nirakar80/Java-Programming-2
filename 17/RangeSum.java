
public class RangeSum 
{
	public static void main(String[] args) 
	{                                                                     
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};                      
		                                                                  
		                                                                  
		System.out.println("The sum of the elements 2 through 5 is " + rangeSum(numbers, 3, 7));
	}                                                                     
	                                                                      
	public static int rangeSum(int[] Numbers, int start, int end)         
	{                                                                     
		if (start > end )                                                 
			return 0;                                                     
		else                                                              
			return Numbers[start] + rangeSum(Numbers, start+1, end);      
	}

}
