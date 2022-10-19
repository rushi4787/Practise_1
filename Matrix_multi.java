package Program_practise;

public class Matrix_multi {

	public static void main(String[] args) {
		int [][] ar1 = {{1,2,3},
		             {4,5,6}};
		
		int ar2[][]= {{1,2,3},{3,4,5},{5,6,7}};
		
		int ar3 [][] = new int [2][3] ;
		
		for (int i=0;i<2;i++)
		{
			int sum=0;
			for(int j=0;j<3;j++)
			{
				for (int k=0;k<3;k++)
				{
					sum=sum+ar1[i][k]*ar2[k][j];
					
				}
				
				ar3[i][j]=sum;
			}
		}

		for (int i=0;i<2;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(ar3[i][j] +" ");
			}
			System.out.println();
		}
	}

}
