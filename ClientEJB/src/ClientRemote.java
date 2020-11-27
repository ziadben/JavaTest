import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import metier.BanqueRemote;
import metier.entities.Compte;

public class ClientRemote {

	public static void main(String[] args) {
		try {
			String appName="BanqueEAR";
			String moduleName="bankEJB";
			String beanName="BK";
			String remoteInterface=BanqueRemote.class.getName();
			String name = "ejb:"+appName+"/"+moduleName+"/"+beanName+"!"+remoteInterface;
			Context ctx = new InitialContext();
			BanqueRemote proxy=(BanqueRemote) ctx.lookup(name);
			proxy.addCompte(new Compte());
			proxy.addCompte(new Compte());
			proxy.addCompte(new Compte());
			Compte cp = proxy.getCompte(1L);
			System.out.println(cp.getSolde());
			proxy.verser(1L, 3000);
			proxy.verser(2L, 3000);
			proxy.retirer(2L, 700);
			proxy.virement(1L, 2L, 100);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
