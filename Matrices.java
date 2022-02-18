
public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int matrix1[] []= {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
 int matrix2[] []={{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
 int result[][]=new int[4][3];
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<3;j++)
		{
		 result[i][j]=matrix1[i][j]+matrix2[i][j];
		 System.out.print(result[i][j]+" ");
		}
		 System.out.println("\n");
	}
		
	
	}

}
