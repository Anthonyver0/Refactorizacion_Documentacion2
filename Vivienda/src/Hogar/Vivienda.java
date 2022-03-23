/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author Paqui Elena
 */
public class Vivienda {

    
    protected double getPrecio() {
        return precio;
    }
  
    protected void setPrecio(double precio) {
        this.precio = precio;
    }
    
    protected int getNumHabitaciones() {
        return numHabitaciones;
    }

    protected void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    protected double getSuperficie() {
        return superficie;
    }
    protected void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
 
    protected boolean isParking() {
        return parking;
    }

    protected void setParking(boolean parking) {
        this.parking = parking;
    }

    protected String getEstado() {
        return estado;
    }

    protected void setEstado(String estado) {
        this.estado = estado;
    }

    protected String getPropietario() {
        return propietario;
    }

    protected void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
   
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio(double Descuento)
    {
        setPrecio(getPrecio() - Descuento);
    }

    
}
