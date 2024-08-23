package com.company.staff.dao.repository;

import com.company.staff.dao.entity.StaffMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// This is the Spring magic that handles the connection to a db. It will have a lot of out the box methods that can be used to update,
// insert and find things in databases.
public interface StaffRepository extends JpaRepository<StaffMemberEntity, Long> {

}
