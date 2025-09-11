package com.notificationemail.infrastructure.kafka;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
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
	  @Bean
	    public ConsumerFactory<String, EmailInput> consumerFactory() {
	        Map<String, Object> props = new HashMap<>();
	        props.put(org.apache.kafka.clients.consumer.ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
	        props.put(org.apache.kafka.clients.consumer.ConsumerConfig.GROUP_ID_CONFIG, "email-group");
	        props.put(org.apache.kafka.clients.consumer.ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
	        props.put(org.apache.kafka.clients.consumer.ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);

	        // Configura o JsonDeserializer para confiar no pacote do EmailInput
	        JsonDeserializer<EmailInput> deserializer = new JsonDeserializer<>(EmailInput.class);
	        deserializer.addTrustedPackages("com.notificationemail.domain.model");

	        return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(), deserializer);
	    }

	    @Bean
	    public ConcurrentKafkaListenerContainerFactory<String, EmailInput> kafkaListenerContainerFactory() {
	        ConcurrentKafkaListenerContainerFactory<String, EmailInput> factory =
	                new ConcurrentKafkaListenerContainerFactory<>();
	        factory.setConsumerFactory(consumerFactory());
	        return factory;
	    }
}
