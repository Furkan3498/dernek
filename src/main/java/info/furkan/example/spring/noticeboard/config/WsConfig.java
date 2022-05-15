package info.furkan.example.spring.noticeboard.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.concurrent.SettableListenableFuture;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.sockjs.client.TransportRequest;
import org.springframework.web.socket.sockjs.client.WebSocketClientSockJsSession;

@Configuration
@EnableWebSocket
public class WsConfig  implements WebSocketHandler{

    @Override
    public void afterConnectionEstablished(WebSocketSession webSocketSession) throws Exception {

    }

    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> webSocketMessage) throws Exception {

    }

    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession webSocketSession, CloseStatus closeStatus) throws Exception {

    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}
