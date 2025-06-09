package com.projeto.desastreapi.repository;

import com.projeto.desastreapi.model.EventoClimatico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<EventoClimatico, Long> {

    Page<EventoClimatico> findByTipoContainingIgnoreCase(String tipo, Pageable pageable);
}
