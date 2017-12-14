
package rpcone.client;
import java.net.URL;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;


public class RpconeClient {

  
    public static void main(String[] args)throws Exception {
       
          //client setup 
       
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL ("http://127.0.0.1:8080/XmlRpcServlet"));
        
        //instatiate client and give it config 
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        
        //make the call : echo1.echo("Hello via RPC")
        
        Object[] params = new Object[]{" from RpconeClient hello via RPC"};
        String result = (String) client.execute("echo1.echo" , params);
        System.out.println("result is (from RpconeClient.java):  "+ result );
        
        
    }
    
    
    
}
