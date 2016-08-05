package com.abc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.abc.model.Transaction;

public class TransactionTest {
    @Test
    public void transaction() {
        Transaction t = new Transaction(5);
        assertTrue(t instanceof Transaction);
    }
    
    
}
