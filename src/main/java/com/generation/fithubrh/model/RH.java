package com.generation.fithubrh.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity 
@Table(name = "tb_colaboradores")
public class RH {
	
	@Id // PRIMARY KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório!")
	@Size(min = 10, max = 50, message = "O atributo nome deve conter seu sobrenome.")
	@Column(length = 50)
	private String nome;
	
    @Email(message = "Informe um e-mail válido")
	@NotBlank(message = "O atributo email é obrigatório!")
	@Size(max = 255, message = "O atributo email deve ter no máximo 255 caracteres.")
	@Column(length = 255)
	private String email;
	
	@NotBlank(message = "O atributo cargo é obrigatório!")
	@Size(max = 50, message = "O atributo cargo deve ter no máximo 50 caracteres.")
	@Column(length = 50)
	private String cargo;
	
	@NotNull
	@DecimalMin("750.0")
	@DecimalMax("100000.00")
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal salario;

	
	//Métodos Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	
	

}
