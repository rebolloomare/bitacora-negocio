/**
 * BitacoraService.java Fecha de creación: 23 feb. 2022, 09:31:48 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.bitacoranegocio.services;

import java.util.Date;
import java.util.List;
import mx.gob.oadprs.bitacoranegocio.model.BitacoraNegocio;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public interface BitacoraService {

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @return
	 */
	List<BitacoraNegocio> consultaBitacora();

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param bitacoraNegocio
	 */
	void guardar(BitacoraNegocio bitacoraNegocio);

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 * @param fechaInicio
	 * @param fechaFin
	 * @return
	 */
	List<BitacoraNegocio> consultaBitacoraPorFechas(Date fechaInicio, Date fechaFin);

}
