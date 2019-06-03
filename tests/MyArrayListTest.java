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
//** This test is possibly redundant now
    @Test
    public void addToArrayAddsNewNumberToArray(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(1);
        int expectedResult = 1;
        int actualResult = myArrayList.getFromArray(0);
        assertEquals(expectedResult, actualResult);
    }

    //** is there a better way to test this? perhaps with already established array, then adding arry. or showing what index new number has been added to?
    @Test
    public void addToArrayAddsNewNumberToArrayInEmptySpot(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(8);
        int expectedResult = 8;
        int actualResult = myArrayList.getFromArray(4);
        assertEquals(expectedResult, actualResult);
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

    //**
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

        int expectedResult = 8;
        int actualResult = myArrayList.getFromArray(10);

        assertEquals(expectedResult, actualResult);
    }

    //** This works, but is it confusing?
    @Test
    public void whenGivenTwoIndicesSwapTwoIndicesReturnsTheSameArrayWithThoseIndicesSwapped(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(1);
        myArrayList.addToArray(2);
        myArrayList.addToArray(3);
        myArrayList.addToArray(4);

        myArrayList.swapIndices(1,2);

        int[] expectedResult = {3,2};
        int[] actualResult = {myArrayList.getFromArray(1), myArrayList.getFromArray(2)};

        assertArrayEquals(expectedResult, actualResult);
    }

    //**
    @Test
    public void addToArrayAtIndexInsertsNumberAtSpecifiedIndex(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArrayAtIndex(2, 1);

        int expectedResult = 1;
        int actualResult = myArrayList.getFromArray(2);

        assertEquals(expectedResult, actualResult);
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

    //**
    @Test
    public void whenInsertingNumberAtSpecifiedIndexOutsideArrayBoundsArrayIncreasesDynamically(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);
        myArrayList.addToArray(9);

        myArrayList.addToArrayAtIndex(11, 8);

        int expectedResult = 12;
        int actualResult = myArrayList.getArraySize();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFromArrayGetsIntegerFromIndexInArray(){
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.addToArray(1);
        myArrayList.addToArray(2);
        myArrayList.addToArray(3);
        myArrayList.addToArray(4);

        int expectedResult = 4;
        int actualResult = myArrayList.getFromArray(3);
        assertEquals(expectedResult, actualResult);
    }

    //** Is this one specific enough?
    @Test
    public void removeFromArrayRemovesValueFromSpecifiedIndexWithEachFollowingValueMovingDownOneIndex(){
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
        int expectedResult = 4;
        int actualResult = myArrayList.getFromArray(2);

        assertEquals(expectedResult, actualResult);
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