import java.util.*;
class two_sum {
    public int[] twoSum(int[] nums, int target) 
    {
        int a = 0;
        int n = nums.length;
        int res[] = new int[2];
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                a = nums[i] + nums[j];
                if(target == a && i != j)
                {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        int n = ni.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0;i<n;i++)
        {
            arr[i] = ni.nextInt();
        }
        
        two_sum ss = new two_sum();
        int ans[] = ss.twoSum(arr,tar);
        for(int val:ans)
        {
            System.out.print(val + " ");
        }
    }
}