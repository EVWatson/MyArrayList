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

}