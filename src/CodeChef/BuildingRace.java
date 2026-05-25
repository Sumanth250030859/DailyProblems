/*
Building Race
https://www.codechef.com/learn/course/klu-problem-solving-2025/KLPS2519/problems/BUILDINGRACE
Chef and Chefina are on different floors and move towards the ground floor at different speeds. Determine who reaches first.
*/

package CodeChef;
import java.util.*;

public class BuildingRace {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            float a = sc.nextInt();
            float b = sc.nextInt();
            float x = sc.nextInt();
            float y = sc.nextInt();

            float chefTime = a/x;
            float chefinaTime = b/y;
            if(chefTime<chefinaTime) System.out.println("Chef");
            else if(chefinaTime==chefTime) System.out.println("Both");
            else System.out.println("Chefina");
        }
    }
}
