public class jugador {
    // Atributos ------------------------
    private String nombre;
    private int goles;
    // Constructor ----------------------
    public jugador() {
        this.nombre = "CR7";
        this.goles = 7;
    }

    public jugador(String nombre, int goles) {
        this.nombre = nombre;
        this.goles  = goles;
    }

    // Metodos ----------------------------
        // get ----------------------------
    public String getNombre(){
        return this.nombre;
    }

    public int getGoles(){
        return this.goles;
    }
        // set -----------------------------
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setGoles(int cantidad){
        this.goles = cantidad;
    }

        // propios -----------------------
    public void imprimir(){
        System.out.println("Nombre: " + this.nombre + "  Goles: " + this.goles);
    }

    public int diferenciaGoles(int a) {
        return (this.goles - a);
    }
}
