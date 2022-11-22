package com.portfolio.pnl.Security.Repository;

import com.portfolio.pnl.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByNombreUsuario(String nombreUsuario);

    boolean existByNombreUsuario(String nombreUsuario);

    boolean existByEmail(String email);

    public boolean existsByNombreUsuario(String nombreUsuario);

    public boolean existsByEmail(String email);
}