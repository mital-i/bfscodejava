import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int [][] m = {{6, 6, 0, 0, 0},
                    {0, 0, 6, 0, 6},
                    {0, 6, 5, 0, 0},
                    {0, 1, 6, 6, 0},
                    {0, 0, 0, 0, 0}};
                
        Stack<int[]> stack = new Stack<int[]>();
        int s_x = 0, s_y = 0, e_x = 0, e_y = 0;
        for ( int i = 0; i < 5; ++i ) {
            for ( int j = 0; j < 5; ++j ) {
                if (m[i][j] == 1 ) {
                    s_x = j;
                    s_y = i;
                } 
                if (m[i][j] == 5 ) {
                    e_x = j;
                    e_y = i;
                } 
                System.out.print(i + " " + j + " - " + m[i][j] + "    |     "); //debugging
            }
            System.out.println(); //debugging
        }
        
        System.out.println(s_x + " " + s_y + " " + e_x + " " + e_y); //debugging
        
        int []position = {s_x, s_y};
        
        stack.add(position); //add starting point to stack so we can start bfsing (is that a verb?)
        
        
	}
}
