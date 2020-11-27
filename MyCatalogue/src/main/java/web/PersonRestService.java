package web;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cat.dao.PersonRepository;
import cat.entities.Person;

@CrossOrigin("*")
@RestController
public class PersonRestService {

	@Autowired
	private PersonRepository personRepository;

@GetMapping(value="/listpersons")
public List<Person> listPersons(){
	return personRepository.findAll();
}
@GetMapping(value="/listpersons/{id}")
public Person listPerson(@PathVariable(name="id")Long id){
		return personRepository.findById(id).get();
	}

@PutMapping(value="/listpersons/{id}")
public Person update(@PathVariable(name="id")Long id,@RequestBody Person p){
	    p.setId(id);
		return personRepository.save(p);
	}

@PostMapping(value="/listpersons")
public Person save(@RequestBody Person p){
	 return personRepository.save(p);
	}

@DeleteMapping(value="/listpersons/{id}")
public void delete(@PathVariable(name="id")Long id){
	 personRepository.deleteById(id);;
	}
}

