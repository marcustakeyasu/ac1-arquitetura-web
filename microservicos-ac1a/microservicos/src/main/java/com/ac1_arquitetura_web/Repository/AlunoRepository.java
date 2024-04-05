package com.ac1_arquitetura_web.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ac1_arquitetura_web.Aluno.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>  {
    
}
