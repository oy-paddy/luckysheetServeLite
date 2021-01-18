package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;

@Configuration
public class WebSocketConfig {

    /**
     * 首先在该类中注入一个ServerEndpointExporter的bean,
     * ServerEndpointExporter这个bean会自动注册使用了@ServerEndpoint这个注解的websocket endpoint
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    /***
     * 解决：SpringBoot中使用WebSocket传输数据，
     * 提示 1009|The decoded text message was too big for the output buffer and
     * @return
     */
    @Bean
    public ServletServerContainerFactoryBean createWebSocketContainer() {
        ServletServerContainerFactoryBean container = new ServletServerContainerFactoryBean();
        // 在此处设置bufferSize
        container.setMaxTextMessageBufferSize(2048000);
        container.setMaxBinaryMessageBufferSize(2048000);
        container.setMaxSessionIdleTimeout(15 * 60000L);
        return container;
    }
}
