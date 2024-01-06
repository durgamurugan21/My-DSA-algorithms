class ClockwisebyOne
{
public static void main (String args[])
{
	int array[]={1,2,3,4,5};
	int temp;
	for(int i=0;i<array.length-1;i++)
	{
		temp=array[i];
		array[i]=array[array.length-1];
		array[array.length-1]=temp;
	}
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]+" ");
	}
}


}