/**
 * Test for the key generation.
 */
package at.andaris.keyutil;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Key generator test case.
 *
 * @author Andreas Erhard <developer@andaris.at>
 */
public class KeyGeneratorTest {

    @Test
    public void testGenerateKey() throws Exception {
        for (int i = 0; i < 10; i++) {
            byte[] key = KeyGenerator.generateKey();
            assertEquals(256/8, key.length);
        }
    }

    @Test
    public void testGenerateKeyBase64() throws Exception {
        for (int i = 0; i < 10; i++) {
            String key = KeyGenerator.generateKeyBase64();
            assertEquals(44, key.length());
        }
    }
}
