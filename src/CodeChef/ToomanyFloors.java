/*
Link: https://www.codechef.com/learn/course/klu-problem-solving-2025/KLPS2520/problems/FLOORS
Chef and Chefina are residing in a hotel.There are 10 floors in the hotel and each floor consists of 10 rooms.
Floor i consists of room numbers 10⋅(i−1)+1 to 10⋅i.
You know that Chef's room number is X while Chefina's Room number is Y. If Chef starts from his room, find the number of floors he needs to travel to reach Chefina's room.
*/
package CodeChef;
import java.util.*;
public class ToomanyFloors {
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            double x = sc.nextInt();
            double y = sc.nextInt();
            double chef_floor = Math.ceil(x/10);
            double chefina_floor = Math.ceil(y/10);
            int ans =(int) (chef_floor - chefina_floor);
            System.out.println(Math.abs(ans));
        }
    }
}
