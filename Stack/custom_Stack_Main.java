public class custom_Stack_Main {
    public static void main(String[] args) throws Exception {
        custom_Stack cs = new custom_Stack(5);
        cs.push(34);
        cs.push(64);
        cs.push(22);
        cs.push(39);
        cs.push(24);
//        cs.push(74);


        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
        System.out.println(cs.pop());
//        System.out.println(cs.peek());

//        cs.pop();
//        cs.pop();
////        cs.pop();

    }
}
