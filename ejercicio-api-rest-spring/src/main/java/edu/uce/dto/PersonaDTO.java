package edu.uce.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PersonaDTO {

    @EqualsAndHashCode.Include
    private Integer idPersona;

    @NotNull
    @Size(min = 3, max = 70, message = "{nombre.tamaño}")
    private String nombre;

    @NotNull
    @Size(min = 3, max = 70, message = "{apellido.tamaño}")
    private String apellido;

}
