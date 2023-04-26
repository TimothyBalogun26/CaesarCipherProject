import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message to be encrypted or decrypted: ");
        String message = scanner.nextLine();
        System.out.print("Enter an integer key value for encryption or decryption: ");
        int key = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter 'E' to encrypt or 'D' to decrypt: ");
        String choice = scanner.nextLine();
        CaesarCipher cipher = new CaesarCipher(key);
        String result = "";
        if (choice.equalsIgnoreCase("E")) {
            result = cipher.encrypt(message);
            System.out.println("Encrypted message: " + result);
        } else if (choice.equalsIgnoreCase("D")) {
            result = cipher.decrypt(message);
            System.out.println("Decrypted message: " + result);
        } else {
            System.out.println("Invalid choice");
        }
    }
}