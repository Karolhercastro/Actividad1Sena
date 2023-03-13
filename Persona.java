public abstract class Persona {
    private int numId;
    private String nombre;



    public void setNumId(int numId) {
        this.numId = numId;
    }

    public int getNumId() {
        return numId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona(int numId, String nombre) {

    }
}
