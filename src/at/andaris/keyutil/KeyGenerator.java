/**
 * Generator for AES-256 keys.
 *
 * License: Apache 2.0
 * @see http://www.apache.org/licenses/LICENSE-2.0
 */
package at.andaris.keyutil;

import java.security.SecureRandom;
import java.util.Base64;

/**
 * Key generator class.
 *
 * Generates a cryptographically secure 256-bit AES key.
 *
 * @author Andreas Erhard <developer@andaris.at>
 */
public class KeyGenerator {

    /**
     * Generates a 256-bit key.
     *
     * @return Key as byte array.
     */
    public static byte[] generateKey() {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[32];
        random.nextBytes(bytes);

        return bytes;
    }

    /**
     * Generates a base64-encoded 256-bit key.
     *
     * @return Base64-encoded key
     */
    public static String generateKeyBase64() {
        byte bytes[] = generateKey();

        return Base64.getEncoder().encodeToString(bytes);
    }
}
