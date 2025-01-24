package Assignment17_Modifiers;

class Counter{
    static int count = 0;

    Counter(){
        //incrementing the value of static variable
        count++;
        System.out.println("1 ");
    }

    public static void main (String args[]){
        // create the objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
    }
}
