/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Provincia;

/**
 *
 * @author USUARIO
 */
public interface ProvinciaService {
    
   public void crear(Provincia provincia);

    public void modificar(Provincia provincia, int codigo);

    public void eliminar(int codigo);

    public List<Provincia> listar();

    public Provincia ProvinciaCodigo(int codigo);
}
