package com.francis.implementations;

import com.francis.interfaces.IList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class myListTest {

    @Test
    public void test_emptyList_hasZeroSize() {
        IList list = new myList();
        assertEquals(list.getSize(), 0);
    }

    @Test
    public void test_insertItems_preservesInsertOrder() {
        IList list = new myList();
        list.add("apple");
        list.add("orange");

        assertEquals(list.get(0), "apple");
        assertEquals(list.get(1), "orange");
    }
}
