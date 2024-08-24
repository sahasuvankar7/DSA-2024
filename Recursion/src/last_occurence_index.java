public class last_occurence_index {
    public static void main(String[] args) {
        int [] arr = {9,8,3,9,1};
        int t = 1;
        System.out.println(loi(arr,t,0));

    }
    static int loi(int [] arr,int t,int idx){
        if(idx==arr.length){
            return -1;
        }
        int liisa = loi(arr,t,idx+1);
        if(liisa==-1){
            if(arr[idx]==t){
                return idx;
            }else{
                return -1;
            }

        }else{
            return liisa;
        }


    }
}
