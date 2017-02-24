/**
 * Test for the checksum calculation.
 */
package at.andaris.keyutil;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Calculator test case.
 *
 * The example of A-Trust is used to verify the checksum calculation result.
 * @see http://labs.a-trust.at/developer/sourcecode/RegistrierkasseAesPruefsumme.html
 *
 * @author Andreas Erhard <developer@andaris.at>
 */
public class CalculatorTest {

    @Test
    public void testCheckValSum() throws Exception {
        int N = 3;
        String base64AESKey = "cWhay3H4asTvRzXzXGZQ3KyBEu9BZaIxl8J+L4Bhr5A=";
        String userCheckSum = "qx6p";

        boolean result = Calculator.checkValSum(N, base64AESKey, userCheckSum);
        assertEquals(true, result);
    }

    @Test
    public void testCalcCheckSumFromKey() throws Exception {
        String base64AESKey = "cWhay3H4asTvRzXzXGZQ3KyBEu9BZaIxl8J+L4Bhr5A=";
        int N = 3;

        String result = Calculator.calcCheckSumFromKey(base64AESKey, N);
        assertEquals("qx6p", result);
    }

}
