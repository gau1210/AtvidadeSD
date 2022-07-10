import javax.swing.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClienteCriptografia {
    public static void main(String[] args) {
        String A, resp ="";
        //Faz uma pergunta Sim = 0 e Não = 1

        int opcao = JOptionPane.showConfirmDialog(null, "Sim = Criptografia" +
                "\nNão = Descriptografar", "Escolha uma opção!", 0);

        try {
            //Faz a chamada do método remoto para o servidor
            Criptografia stub = (Criptografia) Naming.lookup("rmi://localhost:1099/criptoService");
            if (opcao == 0) {
                A = JOptionPane.showInputDialog("Entre com o TEXTO. Sem acento");
                resp = stub.criptografar(A);
            } else {
                A = JOptionPane.showInputDialog("Entre com o TEXTO. Sem acento");
                resp = stub.descriptografar(A);
            }//Fim else
        }//fim try
        catch (MalformedURLException | RemoteException | NotBoundException e) {
            throw new RuntimeException(e);
        }  //fimcatch

        JTextArea outputArea = new JTextArea();
        outputArea.setText(resp);

        JOptionPane.showMessageDialog(null, outputArea,"Texto Criptografado",JOptionPane.INFORMATION_MESSAGE);

    }//fim class void
}