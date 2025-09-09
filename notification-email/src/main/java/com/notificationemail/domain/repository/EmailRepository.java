package com.notificationemail.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notificationemail.domain.model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {

}
