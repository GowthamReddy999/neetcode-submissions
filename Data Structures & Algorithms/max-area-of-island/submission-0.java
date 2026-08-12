class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int count = 0;

        int rows = grid.length;
        int cols = grid[0].length;


        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    int area = dfs(grid,i,j);
                    count = Math.max(area,count);
                }
            }
        }
        return count;
    }
    public int dfs(int[][] grid,int i,int j){

        if(i<0 || i>=grid.length || j <0 ||j>=grid[0].length){
            return 0;
        }
        if(grid[i][j]==0){
            return 0;
        }

        int ans =1;

       grid[i][j] = 0;

        ans+=dfs(grid,i-1,j);

        ans+=dfs(grid,i+1,j);

        ans+=dfs(grid,i,j-1);

        ans+=dfs(grid,i,j+1);

        return ans;

    }
}
