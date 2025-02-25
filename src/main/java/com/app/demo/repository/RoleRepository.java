package com.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.demo.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
