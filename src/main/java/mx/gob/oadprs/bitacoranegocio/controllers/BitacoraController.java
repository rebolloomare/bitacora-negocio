/**
 * BitacoraController.java Fecha de creación: 23 feb. 2022, 09:19:35 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.bitacoranegocio.controllers;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import mx.gob.oadprs.bitacoranegocio.dto.BitacoraNegocioDto;
import mx.gob.oadprs.bitacoranegocio.model.BitacoraNegocio;
import mx.gob.oadprs.bitacoranegocio.services.BitacoraService;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
@RestController()
public class BitacoraController {

	private static final Logger logger = LoggerFactory.getLogger(BitacoraController.class);

	@Autowired
	private BitacoraService bitacoraService;

	@PostMapping("/guardar")
	public void guardaBitacora(@RequestBody BitacoraNegocioDto bitacoraNegocio) {
		logger.info("BitacoraController:::::guardaBitacoraNegocio");
		logger.info(bitacoraNegocio.toString());
		bitacoraService.guardar(new BitacoraNegocio(bitacoraNegocio));
	}

	@GetMapping("/consulta")
	public List<BitacoraNegocioDto> consultaBitacora() {
		logger.info("BitacoraController::::consultaBitacora");
		List<BitacoraNegocio> bitacoraList = bitacoraService.consultaBitacora();
		return bitacoraList.stream().map(BitacoraNegocioDto::new).collect(Collectors.toList());
	}

	@GetMapping("/consultaporfechas/")
	public List<BitacoraNegocioDto> consultaBitacoraPorFechas(@RequestParam Date fechaInicio,
		Date fechaFin) {
		logger.info("BitacoraController::::::consultaBitacoraPorFechas");
		List<BitacoraNegocio> bitacoraList =
			bitacoraService.consultaBitacoraPorFechas(fechaInicio, fechaFin);
		return bitacoraList.stream().map(BitacoraNegocioDto::new).collect(Collectors.toList());
	}

}
