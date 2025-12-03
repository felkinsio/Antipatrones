package veterinaria;   //paquete en minúscula 

public class Perro extends Animal {

    public Perro(String nombre, String colorPelaje, String comidaFavorita) {
        super(nombre, colorPelaje, comidaFavorita);
    }

    @Override
    public void registrarAnimal() {
        // En una clase de dominio no se debe leer de consola.
        // Aquí simplemente mostramos la información ya registrada.
        System.out.println("Registrando perro...");
        mostrarInfoBasica();
    }

    @Override
    public Padecimiento revisarAnimal() {
        Padecimiento p = getPadecimiento();
        System.out.println("Revisando perro. Padecimiento actual: " + p);
        return p;
    }

    @Override
    public void tratarAnimal() {
        Padecimiento padecimientoActual = getPadecimiento();

        if (padecimientoActual == null) {
            System.out.println("El perro no presenta padecimientos actualmente.");
            return;
        }

        switch (padecimientoActual) {
            case GRIPE:
                System.out.println("Tratando la gripe del perro con medicamentos y reposo.");
                break;
            case FRACTURA:
                System.out.println("Tratando la fractura del perro con inmovilización y cirugía si es necesario.");
                break;
            case INFECCION:
                System.out.println("Tratando la infección del perro con antibióticos.");
                break;
            case OTRO:
            default:
                System.out.println("Tratando el padecimiento del perro de manera general.");
                break;
        }

        // Marcamos que ya fue tratado (podrías usar otro estado)
        setPadecimiento(null);
        System.out.println("Se ha tratado al animal.");
    }
}
