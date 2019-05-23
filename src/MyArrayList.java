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

    public void addToArrayAtIndex(int index, int number){
        this.numberArray[index] = number;
        arraySize = index + 1;
        // update array
        //update size
    }

    public void removeIndex(int index){
        for(int i = index; i < this.numberArray.length; i++){
            if(i+1 < this.numberArray.length) {
                this.numberArray[i] = this.numberArray[i + 1];
            }
            else {
                this.numberArray[i] = 0;
            }
        }

    }

    public int getFromArray(int index){
        return this.numberArray[index];
    }

    public int[] getAsPrimitiveArray(){
        return this.numberArray;
    }
}
