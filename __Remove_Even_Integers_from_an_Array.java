package Program_practise;

import java.util.Arrays;

public class __Remove_Even_Integers_from_an_Array {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		
		int arr1 [] =new int [arr.length];
		
		for (int i=0;i<arr.length;i++)
		{
			
			
			if (arr[i]%2==0)
			{
				
				//jSystem.out.println(arr[i]);
				
				
			}
			else
			{
				
				arr1[i]=arr[i];
			}
			
		}
		System.out.println(Arrays.toString(arr1));
		

	}

}
