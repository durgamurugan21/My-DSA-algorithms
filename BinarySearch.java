class BinarySearch
{
	public static void main(String args[])
	{
		int array[]={2,5,7,8,9};
		int size=array.length;
		int left=0,right=size-1;
		int find=7;
		int midvalue=size/2;
		while(left<=right)
		{
			if(find==array[midvalue])
			{
				System.out.println("The value found in the index of " +midvalue);
				break;
			}
			else if(array[midvalue]<find)
			{
				midvalue=midvalue+1;
				left=midvalue;
			}
			else if(array[midvalue]>find)
			{
				midvalue=midvalue-1;
				right=midvalue;
			}
		}
	}
}