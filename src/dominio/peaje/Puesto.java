package dominio.peaje;

import java.util.ArrayList;

public class Puesto {
    private int nroPuesto;
    private static int ultId = 0;
    private String nombre;
    private String direccion;
    private final ArrayList<Tarifa> tarifas = new ArrayList();

    public Puesto(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        ultId++;
        nroPuesto = ultId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getNroPuesto() {
        return nroPuesto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Tarifa> getTarifas() {
        return tarifas;
    }
}