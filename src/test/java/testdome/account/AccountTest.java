package testdome.account;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AccountTest {
    @Test
    public void depositCanNotAcceptNegativeNumbers() {
        Account sut = new Account(10);

        boolean result = sut.deposit(-1);

        assertFalse(result);
    }

    @Test
    public void withdrawCanNotAcceptNegativeNumbers() {
        Account sut = new Account(10);

        boolean result = sut.withdraw(-1);

        assertFalse(result);
    }

    @Test
    public void accountCanNotOverstepItsOverdraftLimit() {
        Account sut = new Account(10);
        sut.deposit(10);

        boolean result = sut.withdraw(21);

        assertFalse(result);
    }

    @Test
    public void testDepositAndWithdraw() {
        Account sut = new Account(10);

        sut.deposit(10);
        assertThat(sut.getBalance(), is(10.0));

        sut.withdraw(5);
        assertThat(sut.getBalance(), is(5.0));
    }

    @Test
    public void withdrawReturnsCorrectResult() {
        Account sut = new Account(10);
        assertTrue(sut.withdraw(0));
    }

    @Test
    public void depositReturnsCorrectResult() {
        Account sut = new Account(10);
        assertTrue(sut.deposit(10));
    }
}
