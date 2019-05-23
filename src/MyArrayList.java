public class MyArrayList {

    private int[] numberArray;
    private int arraySize;

    public MyArrayList(){
        this.numberArray = new int[10];
        this.arraySize = 0;
    }

    public int getArraySize(){
       return this.arraySize;
    }

    public void addToArray(int number){
        this.numberArray[arraySize] = number;
        arraySize++;
    }

    public int getFromArray(int index){
        return this.numberArray[index];
    }

    public int[] getAsPrimitiveArray(){
        return this.numberArray;
    }
}
