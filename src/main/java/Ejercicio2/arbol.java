package Ejercicio2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class arbol extends Planta{
    private String Variedad;
    private String tipotronco;
    private Double radioTronco;
    private String color;
    private String tipoHojas;

        @Override
    public void decirloQueSoy() {
            System.out.println("Hola, soy un árbol");
    }
}
