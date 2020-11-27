package cat.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import cat.entities.Person;
//import cat.entities.Produit;

//interface DAO basiert auf Spring data
//public interface ProduitRepository extends JpaRepository<Produit, Long> {
//	@Query("select p from Produit p where p.designation like :x")
//	public Page<Produit> suchen(@Param("x") String mc, Pageable pageable);// mc= mot clee
//
//	@Query("select p from Produit p where p.prix like :y")
//	public Page<Produit> suchenNachPreis(@Param("y") double mc, Pageable pageable);// mc= mot clee
//}
@RepositoryRestResource
@CrossOrigin("*")
public interface PersonRepository extends JpaRepository<Person, Long> {
	   @RestResource(path="/byName")
	   public List<Person> findByNameContains(@Param("name")String name);
	   
	   @RestResource(path="/byNamePage")
	   public Page<Person> findByNameContains(@Param("name")String name,Pageable pageable);
		
}