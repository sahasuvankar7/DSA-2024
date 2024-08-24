import java.util.ArrayList;

public class maze_diagonal {
    public static void main(String[] args) {
        System.out.println(mazeDiagonal(3,3));

    }

    static int mazeDiagonal(int r,int c){

        if(r==1 || c==1){
            return 1;
        }
//        if(r>1 && c>1){
//            dia =  mazeDiagonal(r-1,c-1);
//        }
//        if(r>1){
//            left = mazeDiagonal(r-1,c);
//        }
//        if(c>1){
//            right =  mazeDiagonal(r,c-1);
//        }
        int dia = mazeDiagonal(r-1,c-1);
        int left = mazeDiagonal(r-1,c);
        int right = mazeDiagonal(r,c-1);
    return dia + left + right;
    }


}
