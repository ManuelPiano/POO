package org.Encapsulamiento;

import lombok.*;


@Getter (AccessLevel.PROTECTED)
@Setter (AccessLevel.PROTECTED)
@AllArgsConstructor (access = AccessLevel.PROTECTED)
@NoArgsConstructor (access = AccessLevel.PROTECTED)
public class Alumno {

    private int id;
    private String nombre;
    private String Apellido;
}
