package com.techprimers.security.securitydbexample.repository;

import com.techprimers.security.securitydbexample.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Lukasz on 21.06.2018.
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {


}
