package org.sid.lightecomv1.dao;

import org.sid.lightecomv1.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long>{
	public AppUser findByUsername(String username);
}
