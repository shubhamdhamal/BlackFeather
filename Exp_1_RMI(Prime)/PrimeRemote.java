import java.rmi.*;
import java.rmi.server.*;

public class PrimeRemote extends UnicastRemoteObject implements Prime{

PrimeRemote()throws RemoteException{
super();
}

public boolean isprime(int num){
	boolean flag=false;
for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
	}
return flag;
}
}