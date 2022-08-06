import java.util.*;

class MatrixLargestSmallest
{
	static int matrix[][];
	static int n=3,m=3;

	static void createMatrix()
	{
		Scanner sc = new Scanner(System.in);

		matrix = new int[m][n];

		System.out.println("Enter the values for matrix : ");

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				int num=sc.nextInt();
				matrix[i][j]=num;
			}
		}
	}

	static void display()
	{
		System.out.println("The Matrix is : ");

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}

	static void largest()
	{
		int largest=matrix[0][0];		

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(matrix[i][j] > largest)
				{
					largest=matrix[i][j];
				}
			}
		}
		System.out.println("Largest element of matrix : " +largest);
	}

	static void smallest()
	{
		int smallest=matrix[0][0];		

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(matrix[i][j] < smallest)
				{
					smallest=matrix[i][j];
				}
			}
		}
		System.out.println("Smallest element of matrix : " +smallest);
	}

	public static void main(String args[])
	{
		createMatrix();
		display();
		largest();
		smallest();
	}
}