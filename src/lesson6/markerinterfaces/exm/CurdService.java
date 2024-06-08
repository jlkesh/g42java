package lesson6.markerinterfaces.exm;

import javax.swing.*;
import java.io.Serializable;

/**
 * @param <D>  dto to return
 * @param <CD> create dto
 * @param <UD> update dto
 * @param <ID> id of domain
 */
public interface CurdService<
        D extends Dto,
        CD extends Dto,
        UD extends Dto,
        ID extends Serializable> {
    ID create(CD dto);

    D read(ID id);

    boolean update(UD dto);

    void delete(ID id);
}
