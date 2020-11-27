package org.sid.lightecomv1.web;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.sid.lightecomv1.dao.ProductRepository;
import org.sid.lightecomv1.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin("*")
@RestController
public class CatalogueRestController {
	@Autowired 
	private ProductRepository productRepository;
	
	  @GetMapping(path="/photoProduct/{id}",produces = MediaType.IMAGE_PNG_VALUE)
	  public byte[] getPhoto(@PathVariable("id") Long id) throws Exception{
	        Product p=productRepository.findById(id).get();
	        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/ecom/products/"+p.getPhotoName()));
	    }
	  @PostMapping(path="/uploadPhoto/{id}")
	  public void uploadPhoto(MultipartFile file, @PathVariable Long id) throws Exception{
	       Product p=productRepository.findById(id).get();
	       p.setPhotoName(file.getOriginalFilename());
	       Files.write(Paths.get(System.getProperty("user.home")+"/ecom/products/"+p.getPhotoName()),file.getBytes());
	       productRepository.save(p);
	    }
}
