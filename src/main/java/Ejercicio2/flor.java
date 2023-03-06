package Ejercicio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class flor extends Planta{

    private String colorPetalos;
    private int cantidadPetalos;
    private String colorPistilo;
    private String estacion;

    @Override
    public void decirloQueSoy() {
        System.out.println("Hola, soy una Flor");

    }
}
