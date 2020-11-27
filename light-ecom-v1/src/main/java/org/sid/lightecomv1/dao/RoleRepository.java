package org.sid.lightecomv1.dao;

import org.sid.lightecomv1.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<AppRole, Long>{
	public AppRole findByRoleName(String roleName);

}
