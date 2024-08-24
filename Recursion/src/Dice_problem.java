// we are given dice and target value . so we have to find out how no of ways to form the target value
public class Dice_problem {
    public static void main(String[] args) {
        dice("",4);
    }
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return ;
        }
        for (int i = 1; i <=6 && i<=target ; i++) { // here second condition means that target  is
            // decreasing  so not need check for high value
            dice(p+i,target-i);
        }
    }
}

