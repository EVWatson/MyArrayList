public class MyArrayList {

    private int[] numberArray;
    private int arrayContentsTracker;

    public MyArrayList(){
        this.numberArray = new int[10];
        this.arrayContentsTracker = 0;
    }

    public int getArraySize(){
       return this.arrayContentsTracker;
    }
}
