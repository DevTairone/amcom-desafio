package amcom.desafio.orderms.listiner;

import amcom.desafio.orderms.config.RabbitMqConfig;
import amcom.desafio.orderms.listiner.dto.OrderCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static amcom.desafio.orderms.config.RabbitMqConfig.ORDER_CREATED_QUEUE;

@Component
public class OrderCreatedListner {

    private final Logger logger = LoggerFactory.getLogger(RabbitMqConfig.class);

    @RabbitListener(queues = ORDER_CREATED_QUEUE)
    public void listen(Message<OrderCreatedEvent> message) {
        logger.info("message consumed: {}", message);

    }
}
