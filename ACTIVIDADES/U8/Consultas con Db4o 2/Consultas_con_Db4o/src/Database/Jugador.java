package Database;

public class Jugador {
    private String nombre;
    private String deporte;
    private String pais;
    private Integer edad;
    
    public Jugador(){
        this.nombre = null;
        this.deporte = null;
        this.pais = null;
        this.edad = null;
    }
    
    public Jugador(String nombre, String deporte, 
            String pais, Integer edad){
        this.nombre = nombre;
        this.deporte = deporte;
        this.pais = pais;
        this.edad = edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setDeporte(String deporte){
        this.deporte = deporte;
    }
    public String getDeporte(){
        return this.deporte;
    }
    
    public void setPais(String pais){
        this.pais = pais;
    }
    public String getPais(){
        return this.pais;
    }
    
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    public Integer getEdad(){
        return this.edad;
    }
}

