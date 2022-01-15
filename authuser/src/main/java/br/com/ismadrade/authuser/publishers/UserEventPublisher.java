package br.com.ismadrade.authuser.publishers;

import br.com.ismadrade.authuser.dtos.UserEventDto;
import br.com.ismadrade.authuser.enums.ActionType;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserEventPublisher {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Value(value = "${ead.broker.exchange.userEvent}")
    private String exchangeUserEvent;

    public void publishUserEvent(UserEventDto userEventDto, ActionType actionType){
        userEventDto.setActionType(actionType.toString());
        rabbitTemplate.convertAndSend(exchangeUserEvent, "", userEventDto);
    }
}
