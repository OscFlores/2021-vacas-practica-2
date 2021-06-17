package src.peliculas;
import src.tienda.*;

public class VectoresPelicula {
    private Peliculas [] peliculas = new Peliculas[50];
    private int s;

    public VectoresPelicula(){
         s= 1;
    }
    //Agregar Peliculas
    public void agregarPeliculas(String nombre, int anio, String Catego){
        if (s > 50){
            System.out.println("Límite de Peliculas alcanzado");
        }
        else{
            peliculas[(s-1)] = new Peliculas(s, nombre, anio, Catego);
        }
        s++;
    }

    public void agregarPelicula(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la Pelicula: ");
        int anio = IngresoDatos.getEntero("Ingrese el año en el que estreno la pelicula: ", false);
        String catego = IngresoDatos.getTexto("Ingrese la Categoria de la Pelicula: ");
        agregarPeliculas(nombre,anio,catego);
    }

    public void mostrarPeliculas(){
        System.out.println("\n\n Peliculas Disponibles en la Memorabilia");
        for (int i = 0; i < (s-1); i++) {
            System.out.println("-"+i+") "+peliculas[i].getInformacion());
        }
        System.out.println("\n\n");
    }


    //Ordenamiento
    public void ordenarPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (s-1); i++) {
            for (int j = 0; j < (s-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (peliculas[j].getNombrePelicula().compareTo(peliculas[j+1].getNombrePelicula()) > 0 );
                else 
                    cambio= (peliculas[j].getNombrePelicula().compareTo(peliculas[j+1].getNombrePelicula()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    Peliculas aux = peliculas[j];
                    peliculas[j] = peliculas[1];
                    peliculas[j+1]= aux;
                }
            }
        }
    }
}
