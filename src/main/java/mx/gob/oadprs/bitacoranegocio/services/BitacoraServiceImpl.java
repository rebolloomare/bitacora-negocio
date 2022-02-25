/**
 * BitacoraServiceImpl.java Fecha de creación: 23 feb. 2022, 11:41:35 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.bitacoranegocio.services;

import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mx.gob.oadprs.bitacoranegocio.model.BitacoraNegocio;
import mx.gob.oadprs.bitacoranegocio.repositories.BitacoraRepository;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@Service
public class BitacoraServiceImpl implements BitacoraService {

	private static final Logger logger = LoggerFactory.getLogger(BitacoraServiceImpl.class);

	@Autowired
	private BitacoraRepository bitacoraRepository;

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.bitacoranegocio.services.BitacoraService#consultaBitacora()
	 */
	@Override
	public List<BitacoraNegocio> consultaBitacora() {
		logger.info("BitacoraServiceImpl::::::consultaBitacora");
		List<BitacoraNegocio> consultaBitacora = bitacoraRepository.findAll();
		return consultaBitacora;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.oadprs.bitacoranegocio.services.BitacoraService#guardar(mx.gob.oadprs.
	 * bitacoranegocio.model.BitacoraNegocioDto)
	 */
	@Override
	public void guardar(BitacoraNegocio bitacoraNegocio) {
		logger.info("BitacoraServiceImpl:::::guardar");
		bitacoraRepository.save(bitacoraNegocio);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.oadprs.bitacoranegocio.services.BitacoraService#consultaBitacoraPorFechas(
	 * java.util.Date, java.util.Date)
	 */
	@Override
	public List<BitacoraNegocio> consultaBitacoraPorFechas(Date fechaInicio, Date fechaFin) {
		logger.info("BitacoraServiceImpl::::::consultaBitacoraPorFechas");
		List<BitacoraNegocio> consultaBitacora =
			bitacoraRepository.findAllByFechaModificacion(fechaInicio, fechaFin);
		return consultaBitacora;
	}

}
