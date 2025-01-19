package dsa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyListTest {
    @Test

    public void testThatMyListIsEmpty() {
        MyList strings = new MyList();
        assertTrue(strings.isEmpty());

    }

    @Test

    public void testThatElementCanBeAddedInMyList() {
        MyList strings = new MyList();
        assertTrue(strings.add());
    }
}
