/**
 * BitacoraNegocioDto.java Fecha de creación: 23 feb. 2022, 09:33:23 Copyright (c) 2022
 * XXXXXXX Todos los derechos reservados. Este software es información confidencial,
 * propiedad de XXXXXXX. Esta información confidencial no deberá ser divulgada y solo se
 * podrá utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.oadprs.bitacoranegocio.dto;

import java.util.Date;
import mx.gob.oadprs.bitacoranegocio.model.BitacoraNegocio;

/**
 * TODO [Agregar documentacion de la clase]
 * @author
 * @version 1.0
 * @since
 */
public class BitacoraNegocioDto {

	private Integer id;

	private String accion;

	private String creadoPor;

	private Date fechaCreacion;

	private String modificadoPor;

	private Date fechaModificacion;

	/**
	 * TODO [Agregar documentacion al método]
	 * @author
	 */
	public BitacoraNegocioDto() {
		super();
	}

	public BitacoraNegocioDto(BitacoraNegocio bitacoraNegocio) {
		this.id = bitacoraNegocio.getId();
		this.accion = bitacoraNegocio.getAccion();
		this.creadoPor = bitacoraNegocio.getCreadoPor();
		this.fechaCreacion = bitacoraNegocio.getFechaCreacion();
		this.modificadoPor = bitacoraNegocio.getModificadoPor();
		this.fechaModificacion = bitacoraNegocio.getFechaModificacion();
	}

	/**
	 * @return el atributo id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id parametro id a actualizar
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return el atributo accion
	 */
	public String getAccion() {
		return accion;
	}

	/**
	 * @param accion parametro accion a actualizar
	 */
	public void setAccion(String accion) {
		this.accion = accion;
	}

	/**
	 * @return el atributo creadoPor
	 */
	public String getCreadoPor() {
		return creadoPor;
	}

	/**
	 * @param creadoPor parametro creadoPor a actualizar
	 */
	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}

	/**
	 * @return el atributo fechaCreacion
	 */
	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * @param fechaCreacion parametro fechaCreacion a actualizar
	 */
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	/**
	 * @return el atributo modificadoPor
	 */
	public String getModificadoPor() {
		return modificadoPor;
	}

	/**
	 * @param modificadoPor parametro modificadoPor a actualizar
	 */
	public void setModificadoPor(String modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	/**
	 * @return el atributo fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion parametro fechaModificacion a actualizar
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BitacoraNegocioDto [id=")
			.append(id)
			.append(", accion=")
			.append(accion)
			.append(", creadoPor=")
			.append(creadoPor)
			.append(", fechaCreacion=")
			.append(fechaCreacion)
			.append(", modificadoPor=")
			.append(modificadoPor)
			.append(", fechaModificacion=")
			.append(fechaModificacion)
			.append("]");
		return builder.toString();
	}

}
