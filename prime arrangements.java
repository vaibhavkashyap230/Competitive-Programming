// https://classroom.codingninjas.com/app/classroom/me/1108/content/43107/offering/486606/problem/6048

public class Solution
{    
    private static long fact(int n)
    {
        long r = 1;
        for(int i=2;i<=n;i++)
        {
            r = r*i;
            r = r % 1000000007;
        }
        return r;
    }
    
    public static int numPrimeArrangements(int n)
    {
        int a[] = new int[n+1];
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            for(int j=i+i;j<=n;)
            {
                a[j]+=1;
                j+=i;
            }
        }
        int pc = 0;
        for(int i=2;i<=n;i++)
        {
            if(a[i]<1)
            {
                pc+=1;
            }
        }
        long r = fact(pc)*fact(n-pc);
        r = r % 1000000007;
        int ans = (int)r;
        return ans;
    }
}