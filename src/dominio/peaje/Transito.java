package dominio.peaje;

import java.util.Date;

public class Transito {
    private Puesto puesto;
    private Vehiculo vehiculo;
    private Date fecha;
    private int costo;
    private Bonificacion bonif;

    public Transito(Puesto puesto, Vehiculo vehiculo, int costo, Date fecha, Bonificacion bonif) {
        this.puesto = puesto;
        this.vehiculo = vehiculo;
        this.costo = costo;
        this.fecha = fecha;
        this.bonif = bonif;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getCosto() {
        return costo;
    }

    public Bonificacion getBonif() {
        return bonif;
    }

    public Date getFecha() {
        return fecha;
    }
}