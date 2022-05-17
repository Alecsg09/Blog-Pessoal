package com.generation.blogpessoal.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //Equivalente a create table.
@Table (name = "tb_temas") // Para definir autoincremento. 

public class Tema {
	
	
	
	
@Id //
@GeneratedValue(strategy = GenerationType.IDENTITY) // para indicar autopreenchimento. 
private Long Id ; 

@NotBlank(message = "Obrigatorio")
@Size(min = 5, max = 100 , message = "A descrição deve no minimo ter 5 e no maximo 100 caracteres")
private String descricao; 


public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

@OneToMany(mappedBy = "tema", cascade = CascadeType.REMOVE)
@JsonIgnoreProperties("tema")
private List<Postagem> postagem;


public Long getId() {
	return Id;
}

public void setId(Long id) {
	Id = id;
}

public List<Postagem> getPostagem() {
	return postagem;
}

public void setPostagem(List<Postagem> postagem) {
	this.postagem = postagem;
}
}








