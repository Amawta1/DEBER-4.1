/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Provincia;
import servicio.PaisServiceImpl;
import servicio.ProvinciaServiceImpl;

/**
 *
 * @author USUARIO
 */
public class ProvinciaControl {

    private ProvinciaServiceImpl provinciaServiceImpl = new ProvinciaServiceImpl();
    private PaisServiceImpl paisServiceImpl = new PaisServiceImpl();

    public String crear(String[] data) {
        try{
        var retorno = "No se pudo crear la Provincia";
        
        var nombre = data[0];
        var expancionTerritorial = Integer.valueOf(data[1]).intValue();
        var pais = this.paisServiceImpl.PaisCodigo(Integer.valueOf(data[2]));
        var nroHabitantes = Integer.valueOf(data[3]).intValue();
        var codigo = Integer.valueOf(data[4]).intValue();

        var provincia = new Provincia(nombre, expancionTerritorial, pais, nroHabitantes, codigo);
        this.provinciaServiceImpl.crear(provincia);
        retorno = "Provincia creado exitosamente";

        return retorno;
        } catch (NumberFormatException e1) {
            throw new RuntimeException("Error en los parametros");
        } catch (RuntimeException e1) {
            throw new RuntimeException("Codigo existe");
        }
    }

    public String modificar(String[] data) {
        try{
        var retorno = "No se pudo crear la Provincia";
        
        var nombre = data[0];
        var expancionTerritorial = Integer.valueOf(data[1]).intValue();
        var pais = this.paisServiceImpl.PaisCodigo(Integer.valueOf(data[2]));
        var nroHabitantes = Integer.valueOf(data[3]).intValue();
        var codigo = Integer.valueOf(data[4]).intValue();
        var provinciaModificado = Integer.valueOf(data[5]).intValue();

        var provincia = new Provincia(nombre, expancionTerritorial, pais, nroHabitantes, codigo);
        this.provinciaServiceImpl.modificar(provincia, provinciaModificado);
        retorno = "Provincia modificado exitosamente";

        return retorno;
        } catch (NumberFormatException e1) {
            throw new RuntimeException("Error en los parametros");
        } catch (RuntimeException e1) {
            throw new RuntimeException("Codigo existe");
        }
    }

    public void eliminar(String codigos) {
        try{
        var codigo = Integer.valueOf(codigos).intValue();
        this.provinciaServiceImpl.eliminar(codigo);
        } catch (NumberFormatException e1) {
            throw new RuntimeException("Error en los parametros");
        } catch (RuntimeException e1) {
            throw new RuntimeException("Codigo existe");
        }
    }

    public List<Provincia> listar() {
        return this.provinciaServiceImpl.listar();

    }

}
