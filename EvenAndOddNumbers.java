// separate even and odd numbers of an array of integers. Put all even numbers first, and then odd numbers.
import java.util.*;
class EvenAndOddNumbers
{
	public static void main(String args[])
	{
	int array[]={1,8,6,4,2,4,6,8};
	int temp,leftindex=0,rightindex=array.length-1;
	while(leftindex<rightindex)
	{
		while(array[leftindex]%2==0 && leftindex<rightindex)
		{
			leftindex++;
		}
		while(array[rightindex]%2!=0 && leftindex<rightindex)
		{
			rightindex--;
		}
		if(leftindex<rightindex)
		{
			temp=array[leftindex];
			array[leftindex]=array[rightindex];
			array[rightindex]=temp;
			leftindex++;
			rightindex--;
		}
	}
	System.out.println(Arrays.toString(array));
	}
}