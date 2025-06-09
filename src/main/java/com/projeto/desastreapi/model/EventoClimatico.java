package com.projeto.desastreapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventoClimatico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O tipo do evento é obrigatório")
    private String tipo;

    @NotNull(message = "A data é obrigatória")
    private LocalDate data;

    @NotBlank(message = "A localização é obrigatória")
    private String localizacao;

    @NotNull(message = "A intensidade é obrigatória")
    @DecimalMin(value = "0.0", inclusive = false, message = "A intensidade deve ser maior que zero")
    private Double intensidade;
}
