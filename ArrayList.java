
public class ArrayList {
	int[] arr ;
	int count = 0;
	public ArrayList(int count)
	{
		this.arr = new int[count];
	}
	public void add(int value)
	{
		arr[this.count++] = value;
	}
	public void Print() {
		for(int i =0;i<count;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public int[] current() {
		return arr;
	}
	public int length() {
		return this.count;
	}
}
