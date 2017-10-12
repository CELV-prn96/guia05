/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.ingenieria.prn335_2017.datos.definiciones.Meta;

/**
 *
 * @author cesarlinares
 */
@Local
public interface MetaFacadeLocal {

    void create(Meta meta);

    void edit(Meta meta);

    void remove(Meta meta);

    Meta find(Object id);

    List<Meta> findAll();

    List<Meta> findRange(int[] range);

    int count();
    
}
