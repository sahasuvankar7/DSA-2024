import java.util.ArrayList;

public class Get_maze_path {

    public static ArrayList<String> getmaze(int sr,int sc,int dr,int dc){
        if(sr==dr && sc==dc){
            ArrayList<String > bres = new ArrayList<>();
            bres.add("");
            return bres;

        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        if(sr<dr){
            vpaths = getmaze(sr+1,sc,dr,dc);
        }
        if(sc<dc){
            hpaths = getmaze(sr,sc+1,dr,dc);
        }
        ArrayList<String> paths = new ArrayList<>();
        for(String hpath:hpaths){
            paths.add("h"+hpath);
        }
        for(String vpath:vpaths){
            paths.add("v"+vpath);
        }
        return paths;

    }

    public static void main(String[] args) {
        ArrayList<String> paths =  getmaze(1,1,3,3);
        System.out.println(paths);
    }
}
