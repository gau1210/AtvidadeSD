import java.rmi.Remote;
import java.rmi.RemoteException;

/*
Interface com dois metodos, o de criptografar e descriptografar.
*/
public interface Criptografia extends Remote {
    String criptografar(String a) throws RemoteException;
    String descriptografar(String a) throws RemoteException;
}

