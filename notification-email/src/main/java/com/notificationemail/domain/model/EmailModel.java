package com.notificationemail.domain.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
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
public class EmailModel {
	@Id
	@EqualsAndHashCode.Include
	private UUID emailId;
	private UUID userId;
	private String emailFrom;
	private String emailTo;
	private String subject;
	@Column(columnDefinition = "TEXT")
	private String text;
	private LocalDateTime sendDateEmail;
	private EmailStatus emailStatus;
	
	
}
