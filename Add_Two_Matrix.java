package Program_practise;

public class Add_Two_Matrix {

	public static void main(String[] args) {
		int a[][]= {{2,2},{3,4}};
		int b[][]= {{1,2},{3,4}};
		
		
		
		int [][]c = new int[2][2];
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
