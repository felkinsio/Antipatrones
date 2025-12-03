import veterinaria.Animal;
import veterinaria.Perro;
import veterinaria.Veterinaria;

public class Main {
    public static void main(String[] args) {
        
        Veterinaria veterinaria = new Veterinaria("El Perro Feliz");

        Animal perro1 = new Perro("Firulais", "Café", "Croquetas");
        Animal perro2 = new Perro("Max", "Negro", "Pollo");

        veterinaria.agregarAnimal(perro1);
        veterinaria.agregarAnimal(perro2);
        
        veterinaria.mostrarAnimales();
        veterinaria.tratarAnimales();
        veterinaria.mostrarAnimales();
    }
}
