package com.service.domain.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.api.model.ServiceInput;
import com.service.domain.model.ServiceEntity;
import com.service.domain.repository.ServiceRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ServiceRegistration {
   
	 @Autowired
	 private ServiceRepository serviceRepository;
	 
	 public ServiceEntity create(@Valid ServiceInput input) {
		 ServiceEntity service = ServiceEntity.createNewService(input.getName(), input.getPhone());
		 return serviceRepository.saveAndFlush(service);
	 }
	 
	 public ServiceEntity update(UUID serviceId, @Valid ServiceInput input) {
		 ServiceEntity service = serviceRepository.findById(serviceId).orElseThrow();
		 service.setPhone(input.getPhone());
		 service.setName(input.getName());
		 return serviceRepository.saveAndFlush(service);
	 }
}
