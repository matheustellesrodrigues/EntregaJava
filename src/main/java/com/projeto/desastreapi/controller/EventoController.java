package com.projeto.desastreapi.controller;

import com.projeto.desastreapi.dto.EventoDTO;
import com.projeto.desastreapi.model.EventoClimatico;
import com.projeto.desastreapi.service.EventoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService service;

    @PostMapping
    public EventoClimatico criar(@RequestBody @Valid EventoDTO dto) {
        return service.salvar(dto);
    }

    @GetMapping
    public Page<EventoClimatico> listar(
        @RequestParam(required = false) String tipo,
        @PageableDefault(size = 10, sort = "data", direction = Sort.Direction.DESC) Pageable pageable
    ) {
        return service.listar(tipo, pageable);
    }
}

