package com.service.domain.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.api.model.EmailInput;
import com.service.api.model.ServiceInput;
import com.service.domain.model.ServiceEntity;
import com.service.domain.repository.ServiceRepository;
import com.service.infrastructure.kafka.ServiceProducer;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ServiceRegistration {
   
	 @Autowired
	 private ServiceRepository serviceRepository;
	 
	 @Autowired
	 private ServiceProducer serviceProducer;
	 
	 public ServiceEntity create(ServiceInput input) {
		   // Cria a entidade e salva no banco
	        ServiceEntity service = ServiceEntity.createNewService(
	            input.getName(),
	            input.getPhone(),
	            input.getEmail()
	        );
	        ServiceEntity saved = serviceRepository.saveAndFlush(service);

	        // Monta a mensagem de e-mail a ser publicada no Kafka
	        EmailInput emailInput = new EmailInput();
	        emailInput.setUserId(saved.getId());
	        emailInput.setEmailTo(saved.getEmail());
	        emailInput.setSubject("Cadastro realizado com sucesso!");
	        emailInput.setText(saved.getName() + ", seu cadastro já foi realizado com sucesso! \n");

	        // Envia para o Kafka
	        serviceProducer.sendEmail(emailInput);

	        return saved;
	}
	 
	 public ServiceEntity update(UUID serviceId, @Valid ServiceInput input) {
		 ServiceEntity service = serviceRepository.findById(serviceId).orElseThrow();
		 service.setPhone(input.getPhone());
		 service.setName(input.getName());
		 service.setEmail(input.getEmail());
		 return serviceRepository.saveAndFlush(service);
	 }
}
