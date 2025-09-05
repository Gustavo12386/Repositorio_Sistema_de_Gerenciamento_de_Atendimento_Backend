package com.service.domain.model;

import java.util.UUID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class ServiceEntity {
	 @Id
	 @EqualsAndHashCode.Include
	 private UUID id;	
	 private String name;	
	 private String phone;	 
	 private String email;
	 	 
	 public static ServiceEntity createNewService(String name, String phone, String email) {
		    ServiceEntity service = new ServiceEntity();
		    service.setId(UUID.randomUUID());
		    service.setName(name);
		    service.setPhone(phone);
		    service.setEmail(email);
		    return service;
		}
	 
	 
}
