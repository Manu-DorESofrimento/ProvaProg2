package br.edu.prova.emanuel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue
	private Integer id_usuario;
	
	@NotNull(message="Não pode ser vazio, por favor preencha")
	@NotEmpty(message="Não pode ser vazio, por favor preencha")
	private String nome;
	
	private String cpf;
	
	private String senha;
	
	private String email;
}
