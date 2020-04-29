// https://classroom.codingninjas.com/app/classroom/me/1108/content/28754/offering/300162/problem/3004

import java.util.Scanner;

public class Main
{	
    private static String lottery(int sum,int digits,String str)
    {
        if(digits==1)
            return Integer.toString(sum)+str;
        
        if(sum>9)
            return lottery(sum-9,digits-1,"9"+str);
        if(sum==1)
            return lottery(sum,digits-1,"0"+str);
        
        return lottery(1,digits-1,Integer.toString(sum-1)+str);
    }
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), n = sc.nextInt();
        sc.close();
        if(n==1)
        {
            System.out.println(s);
            return;
        }
        System.out.println(lottery(s,n,""));
	}
}
