package br.com.lheme.forum.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lheme.forum.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByEmail(String email);
}
