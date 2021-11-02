package com.example.ChatRoom.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;



/*--------------ENABLE WEBSOCKET AND STOMP MESSAGING--------------*/



@Configuration
@EnableWebSocketMessageBroker    //this annotaion enables our message broker
public class Config implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
       //server connectivity on which url
        registry.addEndpoint("/server1").withSockJS(); //The registerStompEndpoints() method registers the /gs-guide-websocket endpoint, enabling SockJS fallback options so that alternate transports can be used if WebSocket is not available. The SockJS client will attempt to connect to /gs-guide-websocket and use the best available transport (websocket, xhr-streaming, xhr-polling, and so on)
      //SockJS Enables fallback options(it will work even if web socket protocol is not supported on the browser if removed cannot connect server)
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
     //Send and Receive
        registry.enableSimpleBroker("/topic");  //helps to broadcast
        registry.setApplicationDestinationPrefixes("/app");     //first prefix this url and then message url
    }
}
