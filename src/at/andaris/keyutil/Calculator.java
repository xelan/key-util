/**
 * Checksum calculator for AES-256 keys.
 *
 * License: Apache 2.0
 * @see http://www.apache.org/licenses/LICENSE-2.0
 *
 * Based on the example code of the Austrian Federal Ministry of Finance.
 * @see https://www.bmf.gv.at/egovernment/projekte/registrierkassen/AES_Pruefsummenberechnung_200716_3.pdf?5s3pzd
 */
package at.andaris.keyutil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * Calculator class, based on the BMF code example.
 *
 * CashBoxUtils.base64Encode is replaced with java.util.Base64 to avoid
 * external dependencies.
 *
 * @author Andreas Erhard <developer@andaris.at>
 */
public class Calculator {
    public static boolean checkValSum(int N, String base64AESKey, String userCheckSum) throws NoSuchAlgorithmException {
        String calculatedCheckSum = calcCheckSumFromKey(base64AESKey, N);

        return calculatedCheckSum.equals(userCheckSum);
    }

    public static String calcCheckSumFromKey(String base64AESKey, int N) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        byte[] sha256hash = md.digest(base64AESKey.getBytes());
        byte[] sha256hashNbytes = new byte[N];

        System.arraycopy(sha256hash , 0, sha256hashNbytes, 0, N);

        String base64sha256hashNbytes = Base64.getEncoder().encodeToString(sha256hashNbytes);
        String valSumCalc = base64sha256hashNbytes.replace("=", "");

        return valSumCalc;
    }
}
