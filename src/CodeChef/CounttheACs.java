/*
Link: https://www.codechef.com/learn/course/klu-problem-solving-2025/KLPS2520/problems/ACS
In this problem there are 10 problems in a contest. The marks for each question is either 1 or 100. The task is we have to determine the number of problems solved by the participant.
*/
package CodeChef;
import java.util.*;
public class CounttheACs {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int p = sc.nextInt();
            int ans = (p/100) + (p%100);
            if(ans>=11) System.out.println(-1);
            else System.out.println(ans);
        }
    }
}
