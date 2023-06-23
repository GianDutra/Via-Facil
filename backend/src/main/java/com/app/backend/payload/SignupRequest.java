package com.app.backend.payload;

import lombok.Data;

import java.util.Set;

import javax.validation.constraints.*;

@Data
public class SignupRequest {

    @NotBlank
    private String cpf;

    @NotBlank
    private String cnpj;

    private String urlPhoto;

    @NotBlank
    @Size(min = 3, max = 20)
    private String name;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    private Set<String> roles;

    @NotBlank
    @Size(min = 6, max = 40)
    private String senha;


}