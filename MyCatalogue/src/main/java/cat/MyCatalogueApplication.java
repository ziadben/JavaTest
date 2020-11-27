package cat;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import cat.dao.PersonRepository;
import cat.entities.Person;

@SpringBootApplication
@ComponentScan(basePackages= {"web","cat.dao","cat.entities"})
public class MyCatalogueApplication implements CommandLineRunner {
    @Autowired
	private PersonRepository personRepository;
    @Autowired
    private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(MyCatalogueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Person.class);
		personRepository.save(new Person(null,"Joachim", "Müller",new Date(),"Arzt"));
		personRepository.save(new Person(null,"Claudia", "Brennan",new Date(),"Managerin"));
		personRepository.save(new Person(null,"Stefan", "Fischer",new Date(),"Software entwickler"));
		
		personRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});
		

		
	}

}
