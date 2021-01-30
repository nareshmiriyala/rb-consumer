package au.com.dellnaresh.rbconsumer

import au.com.dellnaresh.rbconsumer.domain.Order
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class RbConsumerApplication {
    public static final String QUEUE = "rb-queue"
    static void main(String[] args) {
        SpringApplication.run(RbConsumerApplication, args)
    }

    @RabbitListener(queues = QUEUE)
    public static void listen(Order value) {
        System.out.println("Message read from myQueue : " + value);
    }
    @Bean
    public Jackson2JsonMessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }
}
