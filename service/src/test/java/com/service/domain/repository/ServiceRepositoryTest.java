package com.service.domain.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.service.domain.model.ServiceEntity;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ServiceRepositoryTest {

	@Autowired
	private ServiceRepository serviceRepository;
	
	@Test
	void shouldPersistAndFindServiceEntity() {
        // Arrange
        ServiceEntity service = ServiceEntity.createNewService(
                "Gustavo Calderaro",
                "(71) 99237-0172",
                "calderarogustavo@gmail.com"
        );

        // Act
        serviceRepository.saveAndFlush(service);

        // Assert
        Optional<ServiceEntity> found = serviceRepository.findById(service.getId());

        assertThat(found).isPresent();
        assertThat(found.get().getName()).isEqualTo("Gustavo Calderaro");
        assertThat(found.get().getPhone()).isEqualTo("(71) 99237-0172");
        assertThat(found.get().getEmail()).isEqualTo("calderarogustavo@gmail.com");
    }
	
	@Test
    void shouldDeleteServiceEntity() {
        // Arrange
        ServiceEntity service = ServiceEntity.createNewService(
                "Gustavo Calderaro",
                "(71) 99237-0172",
                "calderarogustavo@gmail.com"
        );
        serviceRepository.saveAndFlush(service);

        // Act
        serviceRepository.delete(service);

        // Assert
        Optional<ServiceEntity> found = serviceRepository.findById(service.getId());
        assertThat(found).isEmpty();
    }
}
