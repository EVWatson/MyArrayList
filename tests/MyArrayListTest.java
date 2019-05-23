import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    @Test
    public void whenSizeIsCalledOnMyArrayListReturnsNumberOfItemsCurrentlyStored(){
        MyArrayList myArrayList = new MyArrayList();

        int expectedResult = 0;

        int actualResult = myArrayList.getArraySize();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addToArrayAddsNewNumberToArray(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(1);
        int[] expectedResult = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] actualResult = myArrayList.getAsPrimitiveArray();
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void addToArrayIncreasesArraySize(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(1);
        int expectedResult = 1;
        int actualResult = myArrayList.getArraySize();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addToArrayAddsNewNumberToArrayInEmptySpot(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        int[] expectedResult = {9, 9, 9, 9, 9, 0, 0, 0, 0, 0};
        int[] actualResult = myArrayList.getAsPrimitiveArray();
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void getFromArraygetsIntegerFromIndexInArray(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(1);
        myArrayList.addToArray(2);
        myArrayList.addToArray(3);
        myArrayList.addToArray(4);

        int expectedResult = 4;
        int actualResult = myArrayList.getFromArray(3);
        assertEquals(expectedResult, actualResult);
    }
}