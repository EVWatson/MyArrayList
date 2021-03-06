public class MyArrayList {

    private int[] numberArray;
    private int arraySize;
//    default/setting array size

    public MyArrayList(){
        this.numberArray = new int[10];
        this.arraySize = 0;
    }

    public MyArrayList(int arrayCapacity){
        this.numberArray = new int[arrayCapacity];
        this.arraySize = 0;
    }

    public int getArraySize(){
        return this.arraySize;
    }

    private void expandArray(int numberOfSpaces){
        int[] tempArray = new int[this.numberArray.length + numberOfSpaces];
        for(int index = 0; index < this.numberArray.length; index++){
            tempArray[index] = this.numberArray[index];
        }
        this.numberArray = tempArray;
    }


    public void addToArray(int number){
        if(this.arraySize >= this.numberArray.length) {
            expandArray(1);
            this.numberArray[arraySize] = number;
            arraySize++;
        } else {
            this.numberArray[arraySize] = number;
            this.arraySize++;
        }
    }

//    add at any index outside the scope. how many spaces will need to be passed?
//    public void addToArrayAtIndex(int index, int number){
////        if(index > this.numberArray.length) {
////            for(int i = this.numberArray.length; i <= index; i++) {
////                expandArray(1);
////            }
////        }
////        this.numberArray[index] = number;
////
////        if(index > this.arraySize) {
////            this.arraySize = index + 1;
////           }
////    }

    public void addToArrayAtIndex(int index, int number){
        if(index > this.numberArray.length) {
                expandArray((index +1) - this.numberArray.length);
        }
        this.numberArray[index] = number;

        if(index > this.arraySize) {
            this.arraySize = index + 1;
        }
    }

    public void swapIndices (int index1, int index2){
        int temp = this.numberArray[index2];
        this.numberArray[index2] = this.numberArray[index1];
        this.numberArray[index1] = temp;
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
        arraySize --;
    }

    public int getFromArray(int index){
        return this.numberArray[index];
    }

//    public void addNumberToEachInArrayObject(int number){
//        for (int integer : this.numberArray){
//            System.out.println(integer);
//        }
//    }
//
//    public void addNumberToEachInArrayIndex(int number){
//        for (int i = 0; i < this.numberArray.length; i++) {
//            int integer = this.numberArray[i];
//            integer = integer + number;
//            System.out.println(integer);
//        }
//    }

//    remove this function, get tests to pass without it. use get instead where possible.

    private int[] getAsPrimitiveArray(){
        return this.numberArray;
    }
}
