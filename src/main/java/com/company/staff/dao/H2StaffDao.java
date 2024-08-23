package com.company.staff.dao;

import com.company.staff.dao.entity.StaffMemberEntity;
import com.company.staff.dao.repository.StaffRepository;
import com.company.staff.models.StaffMember;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*
This is the Dao. It is responsible for retrieving stuff from the database.
In this case we use some Spring data magic that uses the entity class to automatically build the SQL queries you need to get the data.
This is a big time saver, although you should still learn SQL as a lot of places prefer to write their own custom SQL queries for
better performance
 */
@Service
public class H2StaffDao implements StaffDao {

    private final StaffRepository staffRepository;

    public H2StaffDao(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public List<StaffMember> getAllStaff() {
        List<StaffMemberEntity> staff = staffRepository.findAll();
        List<StaffMember> staffMemberList = new ArrayList<>();
        /*
            This part is a personal preference. I don't like passing the entities too far from
            the dao class. I like to map them to a DTO type object.
         */
        for(StaffMemberEntity staffMember : staff) {
            staffMemberList.add(
                StaffMember.builder()
                    .id(staffMember.getId())
                    .name(staffMember.getName())
                    .role(staffMember.getRole())
                    .build());
        }

        return staffMemberList;
    }
}
