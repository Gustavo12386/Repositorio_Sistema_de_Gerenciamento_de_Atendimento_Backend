package com.service.api.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceInput {
    @NotBlank
	private String name;
	@NotBlank
	private String phone;
	@NotBlank
	private String email;	
}
