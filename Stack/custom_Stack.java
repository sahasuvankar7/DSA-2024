  class custom_Stack {
    protected int [] data; // data of array type is taken
    private static  final int DEFAULT_SIZE = 10; // here data is private and static means it will not create any
    // objects and final means we can't change even if myself
    int ptr = -1;
    public custom_Stack(){
        this(DEFAULT_SIZE); // this function will execute if the size is mention during running the program
    }
    public custom_Stack( int size){ // to set custom size we need constructor which will set
// the value of newly typed sized .
        this.data = new int [size];
    }
    public boolean  push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    private boolean isFull() {
        return ptr==data.length-1; //
    }
    public int pop()  {
        if(isEmpty()){
            System.out.println("empty stack");
        }
        return data[ptr--];
    }
    private boolean isEmpty(){return ptr ==-1;}
    public int  peek() { // return the top value
        if(isEmpty()){
//            throw new  Exception("can't peek empty");
            System.out.println("can't peek , stack is empty");
        }
        return data[ptr];
    }
}
