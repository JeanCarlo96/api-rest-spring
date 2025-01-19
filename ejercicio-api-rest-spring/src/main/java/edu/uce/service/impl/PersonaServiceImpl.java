package edu.uce.service.impl;

import edu.uce.model.Persona;
import edu.uce.repo.IGenericRepo;
import edu.uce.repo.IPersonaRepo;
import edu.uce.service.IPersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonaServiceImpl extends CRUDImpl<Persona, Integer> implements IPersonaService {

    private final IPersonaRepo repo;

    @Override
    protected IGenericRepo<Persona, Integer> getRepo() {
        return repo;
    }
}
