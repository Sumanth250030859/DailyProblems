/*
Link: https://www.codechef.com/learn/course/klu-problem-solving-2025/KLPS2520/problems/AORB
There are two problems in a contest.
Problem A is worth 500 points at the start of the contest.
Problem B is worth 1000 points at the start of the contest.
Once the contest starts, after each minute:
Maximum points of Problem A reduce by 2 points.
Maximum points of Problem B reduce by 4 points.
It is known that Chef requires X minutes to solve Problem A correctly and Y minutes to solve Problem B correctly.
Find the maximum number of points Chef can score if he optimally decides the order of attempting both the problems.
*/

package CodeChef;
import java.util.Scanner;
public class AorB {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int order1 = (500 - (x*2)) + (1000 - (4*(x+y)));
            int order2 = (1000 - 4*y) + (500 - 2*(x+y));
            System.out.println(Math.max(order1, order2));
        }
    }
}
