import java.rmi.registry.LocateRegistry;

import java.rmi.registry.Registry;

public class PalindromeClient {

    public static void main(String[] args) {

        try {

            // Get the registry

            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Look up the remote object

            PalindromeInterface palindromeService = (PalindromeInterface) registry.lookup("PalindromeService");

            // Test palindrome numbers

            int[] numbers = {121, 12321, 12345};

            for (int number : numbers) {

                boolean isPalindrome = palindromeService.isPalindrome(number);

                if (isPalindrome) {

                    System.out.println(number + " is a palindrome.");

                } else {

                    System.out.println(number + " is not a palindrome.");

                }

            }

        } catch (Exception e) {

            System.err.println("Palindrome client exception: " + e.toString());

            e.printStackTrace();

        }

    }

}

