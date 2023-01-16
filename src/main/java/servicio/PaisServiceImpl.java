/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Pais;

/**
 *
 * @author USUARIO
 */
public class PaisServiceImpl implements PaisService {
    
    private static List<Pais> paisList;

    public PaisServiceImpl() {
        this.paisList = new ArrayList<>();
    }

    @Override
    public void crear(Pais pais) {
        this.paisList.add(pais);
    }

    @Override
    public List<Pais> listar() {
        return this.paisList;
    }


    @Override
    public void modificar(Pais pais, int codigo) {
        var indice = -1;
        for (var paises : this.paisList) {
            indice++;
            if (codigo == paises.getCodigo()) {
                this.paisList.set(indice, pais);
            }
        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var paises : this.paisList) {
            indice++;
            if (codigo == paises.getCodigo()) {
                this.paisList.remove(indice);

            }

        }
    }

    @Override
    public Pais PaisCodigo(int codigo) {
        Pais retorno = null;
        for (var pais : this.paisList) {
            if (codigo == pais.getCodigo()) {
                retorno = pais;
                break;

            }
        }
        return retorno;
    }

}
