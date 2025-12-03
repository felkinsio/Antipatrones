package veterinaria;   // mismo paquete, en minúscula

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

    private String nombre;          // encapsulado
    private final List<Animal> animales;  // mejor que usar array fijo

    public Veterinaria(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public Veterinaria(String nombre, List<Animal> animales) {
        this.nombre = nombre;
        this.animales = new ArrayList<>(animales); // copiamos la lista para proteger el estado interno
    }

    public void agregarAnimal(Animal animal) {
        if (animal != null) {
            animales.add(animal);
        }
    }

    public void ingresarAnimales() {
        for (Animal animal : animales) {
            animal.registrarAnimal();
        }
    }

    public void mostrarAnimales() {
        for (Animal animal : animales) {
            animal.mostrarInfoBasica();
        }
    }

    public void tratarAnimales() {
        for (Animal animal : animales) {
            animal.tratarAnimal();
        }
    }

    // Getters útiles
    public String getNombre() {
        return nombre;
    }

    public List<Animal> getAnimales() {
        return new ArrayList<>(animales); // devolvemos copia para no exponer la lista interna
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
