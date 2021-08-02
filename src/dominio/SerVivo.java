package dominio;

public abstract class SerVivo {
    private String nombre;
    public abstract void alimentarse();
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
