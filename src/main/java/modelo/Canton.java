/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author USUARIO
 */
public class Canton {
    
    private String nombre;
    private double expancionTerritorial;
    private LocalDate yearFundacion;
    private double nroHabitantes;
    private Provincia provincia;
    private int codigo;

public Canton(String nombre, double expancionTerritorial, double nroHabitantes, Pais pais, Provincia provincia,int codigo) {
        this.nombre = nombre;
        this.expancionTerritorial = expancionTerritorial;
        this.yearFundacion = yearFundacion;
        this.nroHabitantes = nroHabitantes;
        this.provincia = provincia;
        this.codigo = codigo;
    }

    public Canton(String nombre, int expancionTerritorial, LocalDate of, int nroHabitantes, String pais, String provincia, int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExpancionTerritorial() {
        return expancionTerritorial;
    }

    public void setExpancionTerritorial(double expancionTerritorial) {
        this.expancionTerritorial = expancionTerritorial;
    }

    public LocalDate getYearFundacion() {
        return yearFundacion;
    }

    public void setYearFundacion(LocalDate yearFundacion) {
        this.yearFundacion = yearFundacion;
    }

    public double getNroHabitantes() {
        return nroHabitantes;
    }

    public void setNroHabitantes(double nroHabitantes) {
        this.nroHabitantes = nroHabitantes;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Canton{" + "nombre=" + nombre + ", expancionTerritorial=" 
                + expancionTerritorial + ", yearFundacion=" + yearFundacion 
                + ", nroHabitantes=" + nroHabitantes + ", provincia=" + provincia 
                + ", codigo=" + codigo + '}';
    }

}