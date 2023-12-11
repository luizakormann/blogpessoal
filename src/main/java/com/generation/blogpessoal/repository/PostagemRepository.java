package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem,Long>{

	//Construção de método personalizado para busca por texto
	
	List<Postagem> findAllByTituloContainingIgnoreCase (@Param("titulo") String titulo);
}
