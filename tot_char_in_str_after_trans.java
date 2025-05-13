import java.util.*;
public class tot_char_in_str_after_trans
{
    public int lenthaftertrans(String s,int t)
    {
        int mod = (int) 1e9 + 7;
        int freq[] = new int[26];
        for(char ch:s.toCharArray())
        {
            freq[ch - 'a']++;
        }

        for(int i = 0;i<t;i++)
        {
            int nfreq[] = new int[26];
            for(int j = 0;j<25;j++)
            {
                nfreq[j+1] = freq[j];
            }
            nfreq[0] = freq[25];
            nfreq[1] = (int)(nfreq[1] + (long)freq[25])% mod;
            freq = nfreq;
        }
        int tot = 0;
        for(int val:freq)
        {
            tot = (tot + val) % mod;
        }
        return (int)tot;

    }
    public static void main(String args[])
    {
        Scanner ni = new Scanner(System.in);
        System.out.println("Enter the string for transform :");
        String str = ni.nextLine();
        System.out.println("Enter the target :");
        int t = ni.nextInt();
        tot_char_in_str_after_trans s = new tot_char_in_str_after_trans();
        int ans = s.lenthaftertrans(str, t);
        System.out.println(ans);
    }
}