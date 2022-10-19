package Program_practise;

public class Matrix_Multiplication2 {

	public static void main(String[] args) {
// 
		int [][]  m1= {{1,2,4}
		              ,{4,5,2}};
		
		int [] [] m2= {{1,2,3,4},
				       {4,5,6,7}
		              ,{4,5,6,7}
		              ,{4,5,6,7}};
		
		// m1 2*3 & m2  3*4   it must that m1 colums match to the number of row m2
		int [] [] m3= new int [2][4];
		int sum=0;
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<4;j++)
			{
				for (int k=0;k<3;k++)
				{
					sum=sum+m1[i][k]*m2[k][j];
				}
				m3[i][j]=sum;
				sum=0;
				
			}
		}
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<4;j++)
			{
				System.out.print(m3[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
