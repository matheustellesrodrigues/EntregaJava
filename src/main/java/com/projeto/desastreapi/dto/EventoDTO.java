package com.projeto.desastreapi.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public record EventoDTO(

    @NotBlank(message = "O tipo do evento é obrigatório")
    String tipo,

    @NotNull(message = "A data do evento é obrigatória")
    LocalDate data,

    @NotBlank(message = "A localização é obrigatória")
    String localizacao,

    @NotNull(message = "A intensidade é obrigatória")
    @DecimalMin(value = "0.0", inclusive = false, message = "A intensidade deve ser maior que zero")
    Double intensidade

) {}
