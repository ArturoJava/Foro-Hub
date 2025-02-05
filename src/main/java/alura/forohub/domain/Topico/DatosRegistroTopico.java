package alura.forohub.domain.Topico;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(

        @NotBlank
        String titulo,

        @NotBlank
        String mensaje,

        @NotBlank
        String autor,

        @NotBlank
        String curso,

        String respuestas

) {
}
