package br.com.sigad.infrastructure.repository;

import br.com.sigad.domain.model.document.DocumentGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentGroupRepository extends JpaRepository<DocumentGroup, Long>{

}
