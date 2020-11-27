package org.sid.lightecomv1;

import java.util.Random;
import org.sid.lightecomv1.dao.CategoryRepository;
import org.sid.lightecomv1.dao.ProductRepository;
import org.sid.lightecomv1.entities.AppRole;
import org.sid.lightecomv1.entities.Category;
import org.sid.lightecomv1.entities.Product;
import org.sid.lightecomv1.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
@CrossOrigin("*")
public class LightEcomV1Application implements CommandLineRunner {
	@Autowired
	private AccountService accountService;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(LightEcomV1Application.class, args);
	}
	@Bean
    public BCryptPasswordEncoder getBCPE(){
        return new BCryptPasswordEncoder();
    }
	
    @Override
	public void run(String... args) throws Exception {
    	accountService.saveUser("admin","test235");
    	accountService.saveUser("user","test1234");
    	accountService.saveRole(new AppRole(null,"ADMIN"));
    	accountService.saveRole(new AppRole(null,"USER"));
    	accountService.addRoleToUser("admin","ADMIN");
    	accountService.addRoleToUser("admin","USER");
    	accountService.addRoleToUser("user","USER");
    	
    	
		repositoryRestConfiguration.exposeIdsFor(Product.class,Category.class);
		categoryRepository.save(new Category(null,"Computers",null,null,null));
		categoryRepository.save(new Category(null,"Printers",null,null,null));
		categoryRepository.save(new Category(null,"Smart Phones",null,null,null));
		Random rnd=new Random();
        categoryRepository.findAll().forEach(c->{
        	for (int i = 0; i <10 ; i++) {
                Product p=new Product();
                p.setName("Ware");
                p.setDescription("Neu");
                p.setCurrentPrice(100+rnd.nextInt(1000));
                p.setAvailable(rnd.nextBoolean());
                p.setPromotion(rnd.nextBoolean());
                p.setSelected(rnd.nextBoolean());
                p.setCategory(c);
                p.setPhotoName("unknown.png");
                productRepository.save(p);
        	}
        });
	}


}
