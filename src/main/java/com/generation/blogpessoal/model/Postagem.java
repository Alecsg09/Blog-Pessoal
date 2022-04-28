package com.generation.blogpessoal.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import org.hibernate.annotations.UpdateTimestamp;

@Entity //Equivalente a create table.
@Table (name = "tb_postagens") // Para definir autoincremento. 

public class Postagem {
	
	
	
	
@Id //
@GeneratedValue(strategy = GenerationType.IDENTITY) // para indicar autopreenchimento. 
private Long Id ; 

@NotBlank(message = "Obrigatorio")
@Size(min = 5, max = 100 , message = "O titulo deve no minimo ter 5 e no maximo 100 caracteres")
private String titulo; 

@NotNull(message = "Obrigatorio")
@Size(min  = 5, max = 1000, message = "O titulo deve no minimo ter 5 e no maximo 1000 caracteres")
private String texto;


@UpdateTimestamp
private LocalDateTime data;


public LocalDateTime getData() {
	return data;
}

public void setData(LocalDateTime data) {
	this.data = data;
}

public long getId() {
	return Id;
}

public void setId(long id) {
	Id = id;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getTexto() {
	return texto;
}

public void setTexto(String texto) {
	this.texto = texto;
}

	

}
