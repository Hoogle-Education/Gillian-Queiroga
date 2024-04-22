package br.com.sigad.infrastructure.repository;

import br.com.sigad.domain.model.document.DocumentClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DocumentClassRepository extends JpaRepository<DocumentClass, Long>{
    // TODO optimize with native queries
    Optional<DocumentClass> findByName(String name);
}