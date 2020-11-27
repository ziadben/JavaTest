package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import metier.BanqueLocal;
import metier.entities.Compte;
@Stateless
@Path("/")
public class BanqueRestService {
@EJB
private BanqueLocal metier;

@POST
@Path("/comptes")
@Produces(MediaType.APPLICATION_JSON)
public Compte addCompte(Compte cp) {
	return metier.addCompte(cp);
}
@GET
@Path("/comptes/{code}")
@Produces(MediaType.APPLICATION_JSON)
public Compte getCompte(@PathParam(value="code")Long code) {
	return metier.getCompte(code);
}
@GET
@Path("/comptes")
@Produces(MediaType.APPLICATION_JSON)
public List<Compte> listComptes() {
	return metier.listComptes();
}
@PUT
@Path("/comptes/verser")
@Produces(MediaType.APPLICATION_JSON)
public void verser(@FormParam(value="code")Long code, @FormParam(value="montant")double mt) {
	metier.verser(code, mt);
}
@PUT
@Path("/comptes/retirer")
@Produces(MediaType.APPLICATION_JSON)
public void retirer(@FormParam(value="code")Long code, @FormParam(value="montant")double mt) {
	metier.retirer(code, mt);
}
@PUT
@Path("/comptes/virement")
@Produces(MediaType.APPLICATION_JSON)
public void virement(@FormParam(value="cp1")Long cp1,@FormParam(value="cp2") Long cp2, @FormParam(value="montant")double mt) {
	metier.virement(cp1, cp2, mt);
}
}
