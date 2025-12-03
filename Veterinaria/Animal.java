package veterinaria;   // convención: nombres de paquetes en minúscula

import java.util.Random;

public abstract class Animal {

    // Nombre del enum en singular y con mayúscula inicial
    public enum Padecimiento {
        GRIPE, FRACTURA, INFECCION, OTRO
    }

    // Un único Random compartido por la clase
    private static final Random RANDOM = new Random();

    // Encapsulación: campos privados
    private String nombre;
    private String colorPelaje;
    private String comidaFavorita;
    private Padecimiento padecimiento;

    // Constructor protegido (es una clase abstracta)
    protected Animal(String nombre, String colorPelaje, String comidaFavorita) {
        this.nombre = nombre;
        this.colorPelaje = colorPelaje;
        this.comidaFavorita = comidaFavorita;
        asignarPadecimientoAleatorio();
    }

    public abstract void registrarAnimal();
    public abstract Padecimiento revisarAnimal();
    public abstract void tratarAnimal();

    public void mostrarInfoBasica() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Color de Pelaje: " + colorPelaje);
        System.out.println("Comida Favorita: " + comidaFavorita);
        System.out.println("El animal presenta el siguiente padecimiento: " + padecimiento + "\n");
    }

    protected void asignarPadecimientoAleatorio() {
        Padecimiento[] valores = Padecimiento.values();
        this.padecimiento = valores[RANDOM.nextInt(valores.length)];
    }

    // Getters (y un setter protegido para el padecimiento si se quiere cambiar)
    public String getNombre() {
        return nombre;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public Padecimiento getPadecimiento() {
        return padecimiento;
    }

    protected void setPadecimiento(Padecimiento padecimiento) {
        this.padecimiento = padecimiento;
    }
}
