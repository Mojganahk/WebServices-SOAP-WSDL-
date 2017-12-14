
package rpcone.server;

import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;


public class RpconeServer {

    public static void main(String[] args) throws Exception{
        
       //listen to your apache 
       WebServer webServer = new WebServer(8080); 
       
       //all requests recieved by this below 
        XmlRpcServer  xmlRpcServer = webServer.getXmlRpcServer();
        
        //tell XML-RPC server which classes  contain method to map 
        PropertyHandlerMapping phm = new PropertyHandlerMapping();
        phm.addHandler("echo1", Echo.class);
        
        xmlRpcServer.setHandlerMapping(phm);
        
        
        XmlRpcServerConfigImpl serverConfig = (XmlRpcServerConfigImpl) xmlRpcServer.getConfig();
        
        serverConfig.setEnabledForExtensions(true);
        serverConfig.setContentLengthOptional(false);
        
        
        
        
        System.out.println("sever started from RpconeServer");
        webServer.start();
    }
    
}
