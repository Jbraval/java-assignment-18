import java.util.*;
import java.util.Scanner;
public class Test1{
        public static void main(String[] args){
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter the number n: ");
                int n = scn.nextInt();
                rec(n, n, true);
        }
        public static void rec(int n, int m, boolean flag) {
                System.out.print(m + " ");
               
                if (flag == false && n == m)
                        return;
 
                
                if (flag) {
                      
                        if (m - 5 > 0)
                                rec(n, m - 5, true);
 
                        else 
                                rec(n, m - 5, false);
                }
 
                else 
                        rec(n, m + 5, false);
        }
}
