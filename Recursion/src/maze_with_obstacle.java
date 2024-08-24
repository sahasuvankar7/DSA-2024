import java.util.ArrayList;

public class maze_with_obstacle {
    public static void main(String[] args) {
        boolean [][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        int [][] mat = {{1, 0},
                {1, 0}};
//


        System.out.println(findPath(mat,2));

    }

    static void maze(String p, int r ,int c, boolean [][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            maze(p+'D',r+1,c,maze);
        }
        if(c<maze[0].length-1){
            maze(p+'R',r,c+1,maze);
        }

    }
    static void mazeAllDirection(int[][]mat,int r,int c, String p){
        if(r==mat.length-1 && c==mat[0].length-1){
            System.out.println(p);

            return;
        }
        if(mat[r][c]==0){
            return;
        }

        mat[r][c] = 0;

        if(r<mat.length-1){
            mazeAllDirection(mat,r+1,c,p+"D");
        }
        if(c<mat[0].length-1){
            mazeAllDirection(mat,r,c+1,p+'R');
        }
        if(r>0 && mat[r-1][c]!=0){
            mazeAllDirection(mat,r-1,c,p+'U');
        }
        if(c>0 && mat[r][c-1]!=0){
            mazeAllDirection(mat,r,c-1,p+'L');
        }
        mat[r][c] = 1;

    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> list = new ArrayList<>();
         allPaths(m,0,0,list,"");
        if(!list.isEmpty()){
            return list;
        }
        list.add("-1");
        return list;
    }
    static void allPaths(int[][] mat,int r,int c,ArrayList<String> list,String p){
        if(r==mat.length-1 && c==mat[0].length-1){
            list.add(p);
//            return list;
        }
        if(mat[r][c]==0){
            return ;
        }
        mat[r][c] = 0;

        if(r<mat.length-1){
             allPaths(mat,r+1,c,list,p+'D');
        }
        if(c<mat[0].length-1){
             allPaths(mat,r,c+1,list,p+'R');
        }
        if(r>0){
             allPaths(mat,r-1,c,list,p+'U');
        }
        if(c>0){
             allPaths(mat,r,c-1,list,p+'L');
        }
        mat[r][c]=1;

    }
}
