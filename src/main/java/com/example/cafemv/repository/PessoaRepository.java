package com.example.cafemv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cafemv.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
