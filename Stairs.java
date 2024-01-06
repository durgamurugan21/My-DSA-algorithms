import java.util.*;
class Stairs
{
	public static int totalWays(int n, int arr[])
	{
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		if (arr[n] == 0) {
			
			arr[n] = totalWays(n-1, arr) + totalWays(n-3, arr) + totalWays(n-5, arr);
		}
		return arr[n];
	} 
	public static void main(String[] args)
	{   
		int n = 4;
		int[] arr = new int[n + 1];
		int total= totalWays(n, arr);
		System.out.println("Total ways to reach the " +n+" stair are " +total);
		System.out.println(Arrays.toString(arr));
	}
}