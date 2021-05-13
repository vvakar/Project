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
}
