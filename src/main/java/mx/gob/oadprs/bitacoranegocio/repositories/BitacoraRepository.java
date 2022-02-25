/**
 * BitacoraRepository.java Fecha de creación: 23 feb. 2022, 11:48:07 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.bitacoranegocio.repositories;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mx.gob.oadprs.bitacoranegocio.model.BitacoraNegocio;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Repository
public interface BitacoraRepository extends JpaRepository<BitacoraNegocio, Integer> {

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param fechaFin
	 * @param fechaInicio
	 * @return
	 */
	List<BitacoraNegocio> findAllByFechaModificacion(Date fechaInicio, Date fechaFin);

}
