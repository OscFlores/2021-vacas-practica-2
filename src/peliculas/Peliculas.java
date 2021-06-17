package src.peliculas;

public class Peliculas {
    private int IdPelicula;
    private String NombrePelicula;
    private int AnioPelicula;
    private String CategoriaPelicula;
    private Boolean PeliculaDisponible;
    private int PeliculaVecesPrestado;
    public Peliculas(int id, String nombrep, int anio, String Catego, Boolean Dispo, int Presta){
        this.IdPelicula = id;
        this.NombrePelicula = nombrep;
        this.AnioPelicula = anio;
        this.CategoriaPelicula = Catego;
        this.PeliculaDisponible = Dispo;
        this.PeliculaVecesPrestado = Presta;
    }
    public Peliculas(int id, String nombrep, int anio, String Catego){
        this(id, nombrep, anio, Catego, true, 0);
    }
    //getters
    public int getIdPelicula(){
        return IdPelicula;
    }
    public String getNombrePelicula(){
        return NombrePelicula;
    }
    public int AnioPelicula(){
        return AnioPelicula;
    }
    public String CategoriaPelicula(){
        return CategoriaPelicula;
    }
    public Boolean PeliculaDisponible(){
        return PeliculaDisponible;
    }
    public int PeliculasVecesPrestado(){
        return PeliculaVecesPrestado;
    }
    //setters
    public void setIdPelicula(int id){
        this.IdPelicula = id;
    }
    public void setNombrePelicula(String Nombre){
        this.NombrePelicula = Nombre;
    }
    public void setAnioPelicula(int Anio){
        this.AnioPelicula = Anio;
    }
    public void setCategoriaPelicula(String Categoria){
        this.CategoriaPelicula = Categoria;
    }
    public void setPeliculaDisponible(boolean Dispo){
        this.PeliculaDisponible = Dispo;
    }
    public void setPeliculasVecesPrestado(int PelisPrestado){
        this.PeliculaVecesPrestado = PelisPrestado;
    }

    public String getInformacion(){
        String resultado = "Id: "+IdPelicula+" Nombre de la Pelicula: " + NombrePelicula + " Año: "+AnioPelicula+" Categoria: "+CategoriaPelicula;
        return resultado;
    }
}
