package Ejercicio2;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class arbusto extends Planta{

    private double ancho;
    private boolean esDomestico;
    private String variedad;
    private String colordeHojas;
    private boolean sePodaONo;
    @Override
    public void decirloQueSoy() {
        System.out.println("Hola, soy un arbusto");

    }
}
