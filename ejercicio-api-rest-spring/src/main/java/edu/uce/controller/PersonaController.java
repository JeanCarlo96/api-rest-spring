package edu.uce.controller;

import edu.uce.model.Persona;
import edu.uce.service.IPersonaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/personas")
public class PersonaController {

    private final IPersonaService service;

    @GetMapping
    public List<Persona> buscarTodos() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Persona buscarPorId(@PathVariable("id") Integer id){
        return service.findById(id);
    }

    @PostMapping
    public Persona guardar(@RequestBody Persona persona){
        return service.save(persona);
    }

    @PutMapping("/{id}")
    public Persona actualizar(@PathVariable("id") Integer id, @RequestBody Persona persona){
        return service.save(persona);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        service.delete(id);
    }
}
