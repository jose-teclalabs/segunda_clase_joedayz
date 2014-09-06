package com.mycompany.finanzas.controller;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.EntityManager;

import com.mycompany.finanzas.modelo.Persona;
import com.mycompany.finanzas.repository.PersonaRepository;
import com.mycompany.finanzas.util.JpaUtil;

@FacesConverter(forClass = Persona.class)
public class PersonaConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
			System.out.println("HOLAAAAAAAAAAAAAAAAAAA");
			System.out.println(value);
			Persona retorno = null;
			EntityManager manager = JpaUtil.getEntityManager();
			try{
			if(value!=null){
			PersonaRepository personaRepository = new PersonaRepository(manager);
			retorno =  personaRepository.porId(new Long(value));
			}
			}finally{
				manager.close();
			}

			return retorno;

	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		if(value!=null){
			return ((Persona) value).getId().toString();
		}
		return null;

	}

}
