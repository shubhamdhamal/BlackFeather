import java.rmi.*; 
import java.util.*; 
public class MyClient{ 
public static void main(String args[]){ 
try{ 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter Number To check Prime or Not"); 
int num=sc.nextInt(); 
Prime stub=(Prime)Naming.lookup("rmi://localhost:5000/sonoo"); 
if(stub.isprime(num)){ 
 System.out.println("The Number Is Prime"); 
} 
else{ 
System.out.println("The Number Is Not Prime");} 
}catch(Exception e){System.out.println(e);} 
} 
} 

