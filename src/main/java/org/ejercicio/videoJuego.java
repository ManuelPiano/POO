package org.ejercicio;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class videoJuego {
    private int codigo;
    private String titulo;
    private String consola;
    private int players;
    private String categorias;
}
