//https://leetcode.com/problems/walking-robot-simulation/
/*
A robot on an infinite grid starts at point (0, 0) and faces north.  The robot can receive one of three possible types of commands:

-2: turn left 90 degrees
-1: turn right 90 degrees
1 <= x <= 9: move forward x units 
Some of the grid squares are obstacles. 

The i-th obstacle is at grid point (obstacles[i][0], obstacles[i][1])

If the robot would try to move onto them, the robot stays on the previous grid square instead (but still continues following the rest of the route.)

Return the square of the maximum Euclidean distance that the robot will be from the origin.

 
*/
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[] dx = new int[]{0,-1,0,1};
        int[] dy = new int[]{1,0,-1,0};
        int x = 0, y = 0, di = 0;
        Set<Long> obstacle = new HashSet<Long>();
        for (int[] obs: obstacles)
        {
            long ox = (long) obs[0] + 30000;
            long oy = (long) obs[1] + 30000;
            obstacle.add((ox<<15)+oy);
        }
        int ans = 0;
        for (int cmd : commands)
        {
            if (cmd == -2)
                di = (di+1)%4;
            else if (cmd == -1)
                di = (di+3)%4;
            else
            {
                for (int c = 0; c < cmd; c++)
                {
                    int nx = x + dx[di];
                    int ny = y + dy[di];
                    long code = (((long) nx+30000) << 15) + ((long)ny+30000);
                    if (!obstacle.contains(code))
                    {
                        x = nx;
                        y = ny;
                        ans = Math.max(ans, x*x+y*y);
                    }
                    else
                        break;
                }
            }
        }
        return ans;
    }
    
}






