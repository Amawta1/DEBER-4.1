/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Canton;
import servicio.CantonServiceImpl;
import servicio.ProvinciaServiceImpl;

/**
 *
 * @author USUARIO
 */
public class CantonControl {

    private CantonServiceImpl cantonServiceImpl = new CantonServiceImpl();
    private ProvinciaServiceImpl provinciaServiceImpl = new ProvinciaServiceImpl();

    public CantonControl() {
        this.cantonServiceImpl = new CantonServiceImpl();
    }

    public String crear(String[] data) {
        var retorno = "No se puede crear el Canton";

        var nombre = data[0];
        var expancionTerritorial = Integer.valueOf(data[1]).intValue();
        var year = Integer.valueOf(data[2]).intValue();
        var mes = Integer.valueOf(data[3]).intValue();
        var dia = Integer.valueOf(data[4]).intValue();
        var nroHabitantes = Integer.valueOf(data[5]).intValue();
        var provincia = this.provinciaServiceImpl.ProvinciaCodigo(Integer.valueOf(data[6]));
        var codigo = Integer.valueOf(data[7]).intValue();
        
        if (year > LocalDate.now().getYear()) {
            retorno += " El año no es valido ";
        } else {
            if (mes < 1 || mes > 12) {
                retorno += " El mes no es valido ";
            } else {
                if (dia < 0 || dia > 31) {
                    retorno += " El dia no es valido ";
                }
        
                var canton = new Canton (nombre, expancionTerritorial,LocalDate.of(year, mes, dia),nroHabitantes,provincia,codigo);

                this.cantonServiceImpl.crear(canton);
                retorno = "Canton creado exitosamente";
            }
        }

        return retorno;
    }

    public String modificar(String[] data) {
        var retorno = "No se puede crear el Canton";

        var nombre = data[0];
        var expancionTerritorial = Integer.valueOf(data[1]).intValue();//double
        var year = Integer.valueOf(data[2]).intValue();
        var mes = Integer.valueOf(data[3]).intValue();
        var dia = Integer.valueOf(data[4]).intValue();
        var nroHabitantes = Integer.valueOf(data[5]).intValue();//double
        var provincia = this.provinciaServiceImpl.ProvinciaCodigo(Integer.valueOf(data[6]));
        var codigo = Integer.valueOf(data[7]).intValue();
        var modificar = Integer.valueOf(data[8]).intValue();
        
        if (year > LocalDate.now().getYear()) {
            retorno += " El año no es valido ";
        } else {
            if (mes < 1 || mes > 12) {
                retorno += " El mes no es valido ";
            } else {
                if (dia < 0 || dia > 31) {
                    retorno += " El dia no es valido ";
                }

                var canton = new Canton (nombre, expancionTerritorial, LocalDate.of(year, mes, dia), nroHabitantes, provincia, codigo);
                this.cantonServiceImpl.modificar(canton, modificar);
                retorno = "Canton modificado exitosamente";
                return retorno;
            }
        }
        
        return retorno;
    }
    

    public void eliminar(String codigos) {
        var codigo = Integer.valueOf(codigos).intValue();
        this.cantonServiceImpl.eliminar(codigo);
    }

    public List<Canton> listar() {
        return this.cantonServiceImpl.listar();

    }
}
