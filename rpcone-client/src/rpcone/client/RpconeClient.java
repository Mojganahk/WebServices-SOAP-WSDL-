package rpcone.client;

import java.net.URL;
import java.util.Scanner;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class RpconeClient {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // client setup
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://127.0.0.1:8080/XmlRpcServlet"));
        // instantiate client and give it config
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        {
            // make the call: echo1.echo("hello via RPC")
            Object[] params = new Object[]{"hello via RPC"};
            String result = (String) client.execute("echo1.echo", params);
            System.out.println("Result is: " + result);
        }

        { // add two numbers
            System.out.print("Enter value 1: ");
            double val1 = input.nextDouble();
            System.out.print("Enter value 2: ");
            double val2 = input.nextDouble();
            Object[] params = new Object[]{ val1, val2 };
            double result = (Double) client.execute("calc.add", params);
            System.out.println("Add result is: " + result);
        }
    }

}
