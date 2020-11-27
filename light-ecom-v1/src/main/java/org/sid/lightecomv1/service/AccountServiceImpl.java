package org.sid.lightecomv1.service;

import org.sid.lightecomv1.dao.RoleRepository;
import org.sid.lightecomv1.dao.UserRepository;
import org.sid.lightecomv1.entities.AppRole;
import org.sid.lightecomv1.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
@Service
@Transactional
@CrossOrigin("*")
public class AccountServiceImpl implements AccountService {
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public AppUser saveUser(String username,String password) {
		AppUser user=userRepository.findByUsername(username);
        if(user!=null) throw new RuntimeException("User already exists");
		  AppUser appUser=new AppUser();
		  appUser.setUsername(username);
	      appUser.setPassword(bCryptPasswordEncoder.encode(password));
	     // System.out.println("pw:"+appUser.getPassword());
	        userRepository.save(appUser);
	        return appUser;
	}

	@Override
	public AppRole saveRole(AppRole role) {
		return roleRepository.save(role);
	}

	@Override
	public void addRoleToUser(String username, String rolename) {
		    AppUser appUser=userRepository.findByUsername(username);
	        AppRole appRole=roleRepository.findByRoleName(rolename);
	        appUser.getRoles().add(appRole);
		
	}

	@Override
	public AppUser findUserByUsername(String username) {
		return userRepository.findByUsername(username);
		
	}

}
