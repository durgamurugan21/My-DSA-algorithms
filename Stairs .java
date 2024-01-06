class Stairs
{
	// Recursive DP function to find total ways to reach the n'th stair from bottom
	// when a person is allowed to climb either 1 or 2 or 3 stairs at a time
	public static int totalWays(int n, int dp[])
	{
		// base case
		if (n < 0) {
			return 0;
		}

		// base case: there is one way to cover it with no steps
		if (n == 0) {
			return 1;
		}

		// if the sub-problem is not seen before
		if (dp[n] == 0) {
			// combine results of taking 1 step or 2 steps or 3 steps at a time
			dp[n] = totalWays(n-1, dp) + totalWays(n-2, dp) + totalWays(n-3, dp);
		}

		// return the sub-problem solution
		return dp[n];
	}

	public static void main(String[] args)
	{
		int n = 4;

		// create an array of n+1 size for storing solution to the sub-problems
		// and initialized by 0
		int[] dp = new int[n + 1];

		System.out.printf("Total ways to reach the %d'th stair are %d",
							n, totalWays(n, dp));
	}
}