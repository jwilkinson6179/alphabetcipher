public class AlphabetCipher {

    public static String encrypt(String key, String message)
    {
        StringBuilder encryptedMessage = new StringBuilder(message.length());

        for(int i = 0; i < message.length(); i++)
        {
            Integer keyOffset = (int)key.charAt(i % key.length) - 97; // +2 for 'c', +0 for 'a'
            Integer letterUnicodeIdx = (int)message.charAt(i) - 97;
            Character letter = (char)(((letterUnicodeIdx + keyOffset + 26) % 26) + 97);
            encryptedMessage.append(letter);
        }

        return encryptedMessage.toString();
    }

    public static String decrypt(String key, String message)
    {
        StringBuilder decryptedMessage = new StringBuilder(message.length());

        for(int i = 0; i < message.length(); i++)
        {
            Integer keyOffset = (int)key.charAt(i % key.length) - 97;
            Integer letterUnicodeIdx = (int)message.charAt(i) - 97;
            Character letter = (char)(((letterUnicodeIdx - keyOffset + 26) % 26) + 97);
            decryptedMessage.append(letter);
        }
        return decryptedMessage.toString();
    }
}

// unicode 97 is 'a'
