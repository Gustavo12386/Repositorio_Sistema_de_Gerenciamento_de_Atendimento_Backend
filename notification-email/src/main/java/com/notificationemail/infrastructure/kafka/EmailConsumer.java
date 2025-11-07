package com.notificationemail.infrastructure.kafka;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.notificationemail.domain.model.EmailInput;
import com.notificationemail.domain.model.EmailModel;
import com.notificationemail.domain.service.EmailService;


@Component
public class EmailConsumer {
	
	@Autowired
	private EmailService emailService;
	
	@KafkaListener(topics = "${broker.topic.email.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void listenEmailTopic(@Payload EmailInput emailInput) {
        System.out.println("Mensagem recebida do Kafka: " + emailInput);
        var emailModel = new EmailModel();
        BeanUtils.copyProperties(emailInput, emailModel);
        emailService.sendEmail(emailModel);
    }

}
