package br.com.sigad.infrastructure.service;

import br.com.sigad.domain.dto.input.ClasseForm;
import br.com.sigad.domain.dto.output.ClasseViewDto;
import br.com.sigad.infrastructure.exception.ClasseNaoEncontradaException;
import br.com.sigad.infrastructure.profiles.ClasseMapper;
import br.com.sigad.infrastructure.repository.DocumentClassRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClasseService {

//	@NonNull private ClasseMapper classeMapper;
//	@NonNull private DocumentClassRepository documentClassRepository;
//
//	public Page<ClasseViewDto> getAll(Pageable pageable) {
//		// TODO validar find all
//		var classes = documentClassRepository
//				.findAll(pageable)
//				.map(classeMapper::classeToView);
//
//		return classes;
//	}
//
//	public ClasseViewDto getById(Long id) {
//		// TODO tratar excessão not found
//		var classe = documentClassRepository.findById(id)
//				.orElseThrow(() -> new RuntimeException("DocumentClass não encontrada"));
//
//		return classeMapper.classeToView(classe);
//	}
//
//	public ClasseViewDto register(ClasseForm classeForm) {
//		var classeToSave = classeMapper.formToClasse(classeForm);
//		var savedClasse = documentClassRepository.save(classeToSave);
//		return classeMapper.classeToView(savedClasse);
//	}
//
//	public ClasseViewDto updateClasse(Long id, ClasseForm updateForm)
//			throws ClasseNaoEncontradaException {
//
//		Classe source = classeMapper.formToClasse(updateForm);
//		Classe destination = documentClassRepository
//				.findById(id)
//				.orElseThrow(() -> new ClasseNaoEncontradaException("Nao encontrada!"));
//
//		classeMapper.updateClasse(destination, source);
//		var updated = documentClassRepository.save(destination);
//		return classeMapper.classeToView(updated);
//	}
//
//	public ClasseViewDto deleteById(long id) {
//		var classe = documentClassRepository.findById(id);
//
//		if(classe.isEmpty()) {
//			return null;
//		}
//
//		documentClassRepository.deleteById(id);
//		return classeMapper.classeToView(classe.get());
//	}
}
