package Program_practise;

public class copy_array {
	public static void main(String[] args) {
		
		
		int arr[] = {1,3,5,6,7,8,9};
		int arr2[]= new int [arr.length];
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
			
			arr2[i]=arr[i];
			
		}
		System.out.println();
		for (int j=0;j<arr.length;j++)
		{
			
			System.out.print(" "+arr2[j]);
		}
	}
	
	

}
