package com.notificationemail.domain.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailInput {
	 @NotBlank
	 private String emailTo;
	 @NotBlank
	 private String subject;
	 @NotBlank
	 private String text;	
}
