package com.example.foro.validacion;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
/**
 *
 * @author RicardoV
 */
public record DatosActualizarTopico(
        Long id,
        String titulo,
        String mensaje,
        String nombreCurso
) {
}
