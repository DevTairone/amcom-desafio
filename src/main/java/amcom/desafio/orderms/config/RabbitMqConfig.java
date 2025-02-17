package amcom.desafio.orderms.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String ORDER_CREATED_QUEUE = "amcom.desafio.orderms.order-created";
}
