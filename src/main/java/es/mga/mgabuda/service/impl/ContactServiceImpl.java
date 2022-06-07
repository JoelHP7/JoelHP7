package es.mga.mgabuda.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import es.mga.mgabuda.model.Contact;
import es.mga.mgabuda.repository.ContactRepository;
import es.mga.mgabuda.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	public void save(Contact contact)
	{
		contactRepository.save(contact);
	}
	
	public void load()
	{
		
//		Pageable pageable = new PageRequest(1, 10, null);
//		Page<Contact>  listPage = contactRepository.findAll(pageable);
//		return listPage.getContent();
	}
	
//	------------------------------
//	GETTERS y SETTERS
//	------------------------------
	public ContactRepository getContactRepository() {
		return contactRepository;
	}

	public void setContactRepository(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
}
