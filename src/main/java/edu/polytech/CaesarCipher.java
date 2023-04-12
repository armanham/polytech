package edu.polytech;

public class CaesarCipher {

    public static String encrypt(String text, int shift) {
        StringBuilder cipherText = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                cipherText.append((char) ((c + shift - 65) % 26 + 65));
            } else if (Character.isLowerCase(c)) {
                cipherText.append((char) ((c + shift - 97) % 26 + 97));
            } else {
                cipherText.append(c);
            }
        }

        return cipherText.toString();
    }

    public static String decrypt(String cipherText, int shift) {
        return encrypt(cipherText, 26 - shift);
    }

    public static void main(String[] args) {
        String plainText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        int shift = 3;

        String cipherText = encrypt(plainText, shift);
        System.out.println("Cipher text: " + cipherText);

        String decryptedText = decrypt(cipherText, shift);
        System.out.println("Decrypted text: " + decryptedText);
    }
}