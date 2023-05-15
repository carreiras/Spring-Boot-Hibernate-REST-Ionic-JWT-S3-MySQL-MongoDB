package carreiras.com.github.pedidosbackend.repository;

import carreiras.com.github.pedidosbackend.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
