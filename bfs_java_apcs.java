import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int [][] m = {{6, 6, 0, 0, 0},
                    {0, 0, 6, 0, 6},
                    {6, 0, 5, 0, 0},
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
            }
        }
        
        System.out.println(s_x + " " + s_y + " " + e_x + " " + e_y); //debugging
        
        int []position = {s_x, s_y};
        ArrayList<int[]> visited = new ArrayList<int[]>();
        boolean foundFlag = false; 
        while (!foundFlag) {
            int x = position[0];
            int y = position[1];
            if (m[x][y] == 5) {
                foundFlag = true;
            }
            
            visited.add(position);
            int [] right = {x-1, y};
            int [] left = {x+1, y};
            int [] up = {x, y+1};
            int [] down = {x, y-1};
            
            if (!visited.contains(right) && m[x][y] != 6 && x < 5 && x > 0 && y < 5 && y > 0) {
                stack.add(right);
            }
            if (!visited.contains(left) && m[x][y] != 6 && x < 5 && x > 0 && y < 5 && y > 0) {
                stack.add(left);
            }
            if (!visited.contains(up) && m[x][y] != 6 && x < 5 && x > 0 && y < 5 && y > 0) {
                stack.add(up);
            }
            if (!visited.contains(down) && m[x][y] != 6 && x < 5 && x > 0 && y < 5 && y > 0) {
                stack.add(down);
            }
            
            position = stack.remove(0);
        }
        
	}
}
