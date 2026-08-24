class Solution {
    public int orangesRotting(int[][] grid) {

        int min = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();


        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    fresh++;
                }

            }
        }

        int[][] directions = {
            {-1,0},
            {1,0},
            {0,-1},
            {0,1}
        };

        while(!q.isEmpty() && fresh > 0 ){

            int size = q.size();

            for(int i=0;i<size;i++){

            int[] current = q.poll();

            int r = current[0];
            int c = current[1];
            for(int[] dir : directions){
                int nr = r + dir[0];
                int nc = c + dir[1];

    if(nc >= 0 && nc < cols && nr >= 0 && nr < rows && grid[nr][nc]==1){

            grid[nr][nc]=2;
            fresh--;
                 q.offer(new int[]{nr,nc});     
                }
              
            }
            

        }
        min ++;
    }
    if(fresh == 0){
        return min;
    }
    return -1;

        
    }
}
