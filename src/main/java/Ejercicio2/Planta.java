package Ejercicio2;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Planta {
    private String name;
    private Double altoTallo;
    private boolean tienehojas;
    private String climaIdeal;

    protected abstract void decirloQueSoy();
}
