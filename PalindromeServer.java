import java.rmi.RemoteException;

import java.rmi.registry.LocateRegistry;

import java.rmi.registry.Registry;

import java.rmi.server.UnicastRemoteObject;

public class PalindromeServer implements PalindromeInterface {

    public PalindromeServer() {

    }

    @Override

    public boolean isPalindrome(int number) throws RemoteException {

        String numString = String.valueOf(number);

        int length = numString.length();

        for (int i = 0; i < length / 2; i++) {

            if (numString.charAt(i) != numString.charAt(length - 1 - i)) {

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {

        try {

            PalindromeServer server = new PalindromeServer();

            PalindromeInterface stub = (PalindromeInterface) UnicastRemoteObject.exportObject(server, 0);

            // Bind the remote object's stub in the registry

            Registry registry = LocateRegistry.createRegistry(1099);

            registry.bind("PalindromeService", stub);

            System.out.println("Palindrome server is running...");

        } catch (Exception e) {

            System.err.println("Palindrome server exception: " + e.toString());

            e.printStackTrace();

        }

    }

}

