package Assignment;

public class Return_Reverse_Array {
public static void main(String[] args) {
   int arr[]={1,5,7,3,8};
	System.out.print("input arr-->");
	for(int i=0; i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	int ans[]=reverse(arr);
	System.out.print("Output arr-->");
	for(int i=0;i<ans.length;i++)
	{
		System.out.print(ans+" ");
	}
}

private static int[] reverse(int[]arr)
{
	int ans[]=new int[arr.length];
	for(int x=arr.length-1,y=0; x>=0 && y<ans.length; x--,y++)
	{
		ans[y]=arr[x];
	}
	return ans;
	}
}

