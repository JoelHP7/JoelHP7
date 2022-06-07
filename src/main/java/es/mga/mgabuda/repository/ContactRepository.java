package es.mga.mgabuda.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import es.mga.mgabuda.model.Contact;

@Repository
public interface ContactRepository extends PagingAndSortingRepository<Contact, Integer>{

}
