package org.Herenecia;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class Empleado extends Persona{
    int num_id;
    String cargo;
    Double Sueldo;

    public Empleado() {
    }


}
