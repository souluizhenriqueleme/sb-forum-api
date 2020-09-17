package br.com.lheme.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lheme.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
