package org.sid.lightecomv1.web;


import org.sid.lightecomv1.entities.AppUser;
import org.sid.lightecomv1.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class AccountRestController {
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/register") 
	public AppUser register(@RequestBody RegisterForm userForm) {
		if(!userForm.getPassword().equals(userForm.getRepassword()))
			throw new RuntimeException("You must confirm your password");
		AppUser user= accountService.findUserByUsername(userForm.getUsername());
		if(user!=null)
			throw new RuntimeException("User Already exists");
		
		AppUser appuser=accountService.saveUser(userForm.getUsername(), userForm.getPassword());
		accountService.addRoleToUser(userForm.getUsername(), "USER");
		return appuser;
	}

}
