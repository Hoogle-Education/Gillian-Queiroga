package br.com.sigad.infrastructure.repository;

import br.com.sigad.domain.model.document.DocumentSubClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentSubClassRepository extends JpaRepository<DocumentSubClass, Long> {

}
