package es.mga.mgabuda.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.mga.mgabuda.model.Contact;
import es.mga.mgabuda.service.ContactService;

@Component
@Named
@SessionScoped
public class HolaMundo implements Serializable {
	private String saludo = "Hola mundo desde JSF 2";

	@Autowired
	private ContactService contactService;
	
	public String getSaludo() {
		System.out.println("TEST saludo");
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public String save() {
		System.out.println("TEST");
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("TEST save!"));
		return "";
	}

	public String test() {
		// Do any action that you would.
		System.out.println("TEST test");
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("TEST test!"));
		// Returns outcome
		return "";
	}
	
	public String saveContactTest()
	{
		Contact contact2 = new Contact("Name 1", "name@correo.com", "calle inventada 1", "+34666666666");
		this.contactService.save(contact2);
		Contact contact = new Contact("TEST", "test@test.com", "calle test 1", "+34666666666");
		this.contactService.save(contact);
		return "";
	}

}
