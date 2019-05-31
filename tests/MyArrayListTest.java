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
    public void whenThereAreNoEmptySpacesAddToArrayDynamicallyIncreasesArrayBoundarySize(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(8);

        int expectedResult = 11;
        int actualResult = myArrayList.getArraySize();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void whenThereAreNoEmptySpacesAddToArrayDynamicallyAddsNumberToIncreasedArray(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(8);

        int[] expectedResult = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 8};
        int[] actualResult = myArrayList.getAsPrimitiveArray();

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void whenGivenTwoIndiciesSwapTwoIndiciesReturnsTheSameArrayWithThoseIndiciesSwapped(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(1);
        myArrayList.addToArray(2);
        myArrayList.addToArray(3);
        myArrayList.addToArray(4);

        myArrayList.swapIndices(1,2);

        int[] expectedResult = {1,3,2,4,0,0,0,0,0,0};
        int[] actualResult = myArrayList.getAsPrimitiveArray();

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void addToArrayAtIndexInsertsNumberAtSpecifiedIndex(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArrayAtIndex(2, 1);

        int[] expectedResult = {0, 0, 1, 0, 0, 0, 0, 0, 0, 0};
        int[] actualResult = myArrayList.getAsPrimitiveArray();

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void whenIndexIsGreaterThanArraySizeAddToArrayAtIndexIncreasesArraySize(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArrayAtIndex(2, 1);

        int expectedResult = 3;

        int actualResult = myArrayList.getArraySize();

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenIndexIsNotGreaterThanArraySizeAddToArrayAtIndexDoesNotIncreaseArraySize(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(8);
        myArrayList.addToArray(8);
        myArrayList.addToArray(8);
        myArrayList.addToArray(8);

        myArrayList.addToArrayAtIndex(2, 1);

        int expectedResult = 4;

        int actualResult = myArrayList.getArraySize();

        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void whenInsertingNumberAtSpecifiedIndexOutsideArrayBoundsArrayIncreasesDynamically(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);

        myArrayList.addToArrayAtIndex(11, 8);

        int[] expectedResult = {9, 9, 9, 9, 9, 0, 0, 0, 0, 0, 0, 8};
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

    @Test
    public void removeFromArrayRemovesValue(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(1);
        myArrayList.addToArray(2);
        myArrayList.addToArray(3);
        myArrayList.addToArray(4);
        myArrayList.addToArray(5);
        myArrayList.addToArray(6);
        myArrayList.addToArray(7);
        myArrayList.addToArray(8);
        myArrayList.addToArray(9);
        myArrayList.addToArray(10);

        myArrayList.removeIndex(2);
        int[] expectedResult = {1, 2, 4, 5, 6, 7, 8, 9, 10, 0};
        int[] actualResult = myArrayList.getAsPrimitiveArray();

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void removeFromArrayDecreasesArraySize(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(1);
        myArrayList.addToArray(2);
        myArrayList.addToArray(3);
        myArrayList.addToArray(4);
        myArrayList.addToArray(5);
        myArrayList.addToArray(6);
        myArrayList.addToArray(7);
        myArrayList.addToArray(8);
        myArrayList.addToArray(9);
        myArrayList.addToArray(10);

        myArrayList.removeIndex(3);

        int expectedResult = 9;
        int actualResult = myArrayList.getArraySize();

        assertEquals(expectedResult, actualResult);
    }
}