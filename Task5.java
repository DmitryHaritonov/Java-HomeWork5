
class GFG
{
	static int FindMaxTwoLength(int A[], int B[], int n, int m)
	{
		int[][] ArrayCheck = new int[n + 1][m + 1];
		for (int i = 0; i <= n; i++)
			for (int j = 0; j <= m; j++)
				ArrayCheck[i][j] = 0;

		for (int i = n - 1; i >= 0; i--)
		{
			for (int j = m - 1; j >= 0; j--)
			{
				if (A[i] == B[j])
					ArrayCheck[i][j] = ArrayCheck[i + 1][j + 1] + 1;
			}
		}
		int maxm = 0;

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				maxm = Math.max(maxm, ArrayCheck[i][j]);
			}
		}
		return maxm;
	}

	public static void main(String[] args)
	{
		//int A[] = { 1, 2, 3, 2, 1 };
		//int B[] = { 3, 2, 1, 4, 7 };
 
		// or

		int A[] = { 0, 0, 0, 0, 0 };
		int B[] = { 0, 0, 0, 0, 0 };

		int n = A.length;
		int m = B.length;
		System.out.println(FindMaxTwoLength(A, B, n, m));
        
	}
}
