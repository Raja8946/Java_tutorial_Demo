import java.util.Scanner;

public class Matrixmultiply 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 row :");
		@SuppressWarnings("unused")
		int row1 = sc.nextInt();
		System.out.println("Enter 1 column :");
		int col1 = sc.nextInt();
		System.out.println("Enter second row :");
		int row2 = sc.nextInt();
		System.out.println("Enter second column :");
		int col2 = sc.nextInt();
		
		int mat1[][]= new int[row1][col1];
		int mat2[][]= new int[row2][col2];
		System.out.println("Enter element into first matrix");
		int i,j;
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("------Displaying First Matrix-----\n");
		
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Enter element into 2 matrix");
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println("-----Displaying Second Matrix------\n");
		
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				System.out.print(mat2[i][j]+"\t");
			}
			System.out.println();
		}
		// Computing-----------
		int mat3[][]=new int[row1][col2];
		if(row2==col1)
		{
			for(i=0;i<row1;i++)
			{
				for(j=0;j<col2;j++)
				{
					for(int k=0;k<row2;k++)
					{
						mat3[i][j]+=mat1[i][k]*mat2[k][i];
					}
				}
			}
		}
		
		System.out.println("----Displaying Final Matrix----\n");
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col2;j++)
			{
				System.out.print(mat3[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
