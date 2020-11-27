package mywebsocket;

import java.io.IOException;

import javax.websocket.EncodeException;
import javax.websocket.OnMessage;
import javax.websocket.RemoteEndpoint.Basic;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/chat")
public class Chat{
@OnMessage
public void message( String message, Session session)throws IOException, EncodeException{
for(Session s: session.getOpenSessions()){
    Basic endpoint = s.getBasicRemote();
    endpoint.sendText(message);
    }
   }
}
