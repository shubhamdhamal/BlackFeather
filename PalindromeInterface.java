import java.rmi.Remote;

import java.rmi.RemoteException;

public interface PalindromeInterface extends Remote {

    boolean isPalindrome(int number) throws RemoteException;

}

