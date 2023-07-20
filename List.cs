

public class List{
    public string[] arr;
    int count = 0;
    public List(int size)
    {
        arr = new string[size];
    }
    public void set(int index,string value)
    {
        if(index < count)
            arr[index] = value;
    }
    private void Scale()
    {
        //resize the array
        //create new array
        //copy the old element to the new array
        string[] newArr = new string[count*2];
        int newCount = 0;
        foreach(var s in arr)
        {
            newArr[newCount++] = s;
        }
        count = newCount;
        arr = newArr;
    }
    public void add(string str)
    {
        if(count == arr.Length)
        {
             string[] newArr = new string[count*2];
            int newCount = 0;
            foreach(var s in arr)
            {
                newArr[newCount++] = s;
            }
            count = newCount;
            arr = newArr;
        }
        arr[count++] = str;
    }
    public void remove(int index)
    {
        //remove by shiffting
        //a bit faster since we know the location of the target element
    }
    public void remove(string value)
    {
        int index = search(value);
        if(index != -1)
        {
            for(int i =index;i<count;i++)
            {
                //remove by shiffting
                arr[i] = arr[i+1]; 
            }
            count -= 1;
        }
    }
     public void insert(int index,string value)
     {
        //task on how to insert element at specific index
        //it requires scale and shiffting
     }
    
    
    public int search(string value)
    {
        for(int i =0;i<arr.Length;i++)
        {
            if(arr[i] == value)
            {
                return i;
            }
        }
        return -1;
        //time complexity

    }
    public int Length()
    {
        return count;
    }
    public void print()
    {
        for(int i =0;i<count;i++)
        {
            Console.WriteLine(arr[i]);
        }
        //time complexity

    }
}