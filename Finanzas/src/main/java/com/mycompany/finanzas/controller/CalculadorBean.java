package com.mycompany.finanzas.controller;

import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadorBean {

	private Double valorA;
	private Double valorB;
	private Double resultado;
	private Date fechaBase;
	private Integer dias;
	private Date fechaResultado;
	private String suNombre;
	
	public void agregar(){
	
		System.out.println("fecha base "  + fechaBase );
		Calendar fechaCalculo = Calendar.getInstance();
		
		fechaCalculo.setTime(this.fechaBase);
		fechaCalculo.add(Calendar.DAY_OF_MONTH,dias);
		this.fechaResultado = fechaCalculo.getTime();
		
	}
	
	public void sumar(){
		this.resultado = this.valorA + this.valorB;
				
	}

	public Double getValorA() {
		return valorA;
	}

	public void setValorA(Double valorA) {
		this.valorA = valorA;
	}

	public Double getValorB() {
		return valorB;
	}

	public void setValorB(Double valorB) {
		this.valorB = valorB;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Date getFechaBase() {
		return fechaBase;
	}

	public void setFechaBase(Date fechaBase) {
		this.fechaBase = fechaBase;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public Date getFechaResultado() {
		return fechaResultado;
	}

	public void setFechaResultado(Date fechaResultado) {
		this.fechaResultado = fechaResultado;
	}

	public String getSuNombre() {
		return suNombre;
	}

	public void setSuNombre(String suNombre) {
		this.suNombre = suNombre;
	}
	
	
	
	
}
