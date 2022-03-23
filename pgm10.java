import java.util.*;
public class pgm10
{
	public static void main(String args [])
	{
		int [] my_array1={101,234,111,555,107,236,869,367};
		String [] my_array2={"java","python","php","c","c++","js"};
		System.out.println("Original string numeric arry:"+Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.println("Sorted numeric array:"+Arrays.toString(my_array1));
		System.out.println("Original string numeric arry:"+Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println("Sorted numeric array:"+Arrays.toString(my_array2));
	}
}