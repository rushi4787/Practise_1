package Program_practise;

public class Sort_Bubble_sort {
	
	static void function(int arr [] )
	{
		
		for (int i=0;i<arr.length;i++)
		{
			int temp=0;
			for (int j=1;j<arr.length-i;j++)
			{
				if (arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		
		int arr[] = {1,5,8,3,9,2};
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		function(arr);
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}System.out.println();
		
		
		
		
	}

}
