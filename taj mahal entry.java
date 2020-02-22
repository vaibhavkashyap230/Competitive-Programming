import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
	    int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        s.close();
        
        double c[]=new double[n];
        for(int i=0;i<n;i++)
        {
            double d=(a[i]-i)/(double)(n);
            if(d>0 && d>(int)(d))
        	{
        		d=(int)(d+1);
        	}
        	if(d<0 && d>(int)(d))
        	{
        		d=0;
        	}
        	c[i]=d;
        }
        int r=0;
        for(int i=0;i<n;i++)
        {
            if(c[i]<1)
            {
                System.out.println(i+1);
                return;
            }
            
            if(c[i]<c[r])
                r=i;
        }
        System.out.println(r+1);
	}
}
