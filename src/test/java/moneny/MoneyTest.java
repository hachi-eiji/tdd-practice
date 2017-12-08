package moneny;

import money.Dollar;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MoneyTest {
    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        Assertions.assertEquals(10, five.amount);
    }
}
