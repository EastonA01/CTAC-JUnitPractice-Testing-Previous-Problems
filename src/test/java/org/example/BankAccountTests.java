package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@DisplayName("Bank Account Tests")
public class BankAccountTests {
    private static BankAccount bankAccount;

    @BeforeEach
    void setUpBeforeClass() throws Exception {
        bankAccount = new BankAccount("John Hopkins",500);
    }

    @Test
    @DisplayName("Test For Deposit")
    void testDeposit() {
        bankAccount.deposit(500);
        assertEquals(1000, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Test For Withdrawl")
    void testWithdraw() {
        bankAccount.withdrawal(200);
        assertEquals(300, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Get Account Holder Name")
    public void getAccountHolderName() {
        assertEquals("John Hopkins", bankAccount.getAccountHolder());
    }
}
