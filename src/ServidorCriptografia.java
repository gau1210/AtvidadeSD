import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

//Cria o objeto servidor;
public class ServidorCriptografia {

    public ServidorCriptografia(){
        try {
            //Definição do nome do objeto servidor para o cliente tentar a conexão.
            Registry registry = LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/criptoService",new CriptografiaImpl());

            System.out.println("Servidor Levantou");

        }catch (Exception e){
            System.out.println("Erro: "+ e);
        }
    }

    public static void main(String[] args) {

    //Chama o método ServidorCriptografia
        new ServidorCriptografia();

    }
}//Class ServidorCriptografia
