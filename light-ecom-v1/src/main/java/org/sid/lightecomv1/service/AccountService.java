package org.sid.lightecomv1.service;

import org.sid.lightecomv1.entities.AppRole;
import org.sid.lightecomv1.entities.AppUser;

public interface AccountService {
	public AppUser saveUser(String username, String password);
    public AppRole saveRole(AppRole role);
    public void addRoleToUser(String username,String rolename);
    public AppUser findUserByUsername(String username);
}
