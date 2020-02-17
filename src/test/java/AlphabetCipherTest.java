import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphabetCipherTest {

    @Before

    @After

    @Test
    public void EncryptTest() {
        // GIVEN

        String expected = "jeeno";
        String testKey = "cat";
        String testMessage = "hello";

        // WHEN

        String actual = AlphabetCipher.encrypt(testKey, testMessage);
        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void EncryptTestTwo()
    {
        // GIVEN

        String expected = "tsa";
        String testKey = "hello";
        String testMessage = "mop";

        // WHEN

        String actual = AlphabetCipher.encrypt(testKey, testMessage);
        // THEN

        assertEquals(expected, actual);
    }

    @Test
    public void DecryptTest() {
        // GIVEN

        String expected = "hello";
        String testKey = "cat";
        String testMessage = "jeeno";

        // WHEN

        String actual = AlphabetCipher.decrypt(testKey, testMessage);

        // THEN

        assertEquals(expected, actual);
    }
}
