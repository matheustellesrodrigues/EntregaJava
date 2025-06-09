package com.projeto.desastreapi.service;

import com.projeto.desastreapi.dto.EventoDTO;
import com.projeto.desastreapi.model.EventoClimatico;
import com.projeto.desastreapi.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    @Autowired
    private EventoRepository repository;

    public EventoClimatico salvar(EventoDTO dto) {
        EventoClimatico evento = new EventoClimatico(
            null,
            dto.tipo(),
            dto.data(),
            dto.localizacao(),
            dto.intensidade()
        );
        return repository.save(evento);
    }

    public Page<EventoClimatico> listar(String tipo, Pageable pageable) {
        if (tipo == null || tipo.isBlank()) {
            return repository.findAll(pageable);
        }
        return repository.findByTipoContainingIgnoreCase(tipo, pageable);
    }
}
