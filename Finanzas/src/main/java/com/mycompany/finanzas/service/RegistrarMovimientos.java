package com.mycompany.finanzas.service;

import java.util.Date;

import com.mycompany.finanzas.exception.NegocioException;
import com.mycompany.finanzas.modelo.Movimiento;
import com.mycompany.finanzas.repository.MovimientoRepository;

public class RegistrarMovimientos {
	
	private MovimientoRepository movimientosRepository;
	
	public RegistrarMovimientos(MovimientoRepository movimientoRepository){
			this.movimientosRepository = movimientoRepository;
	}
		
	
	public void guardar(Movimiento movimiento) throws NegocioException{
		if(movimiento.getFechaPago() != null &&
				movimiento.getFechaPago().after(new Date())){
			throw new NegocioException("la fecha de pago no puede ser futura");
		}
		this.movimientosRepository.agregar(movimiento);
	}
}
