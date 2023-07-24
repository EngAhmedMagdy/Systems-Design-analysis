
public class SelectionSort {
	public static void Sort(int[] arr,int n)
	{
		int minIndex;
		for(int i=0;i<n;i++)
		{
			minIndex = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
}
