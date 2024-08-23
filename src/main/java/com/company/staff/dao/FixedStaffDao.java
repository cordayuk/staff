package com.company.staff.dao;

import com.company.staff.models.StaffMember;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/*
This is just a dumb example of interfaces. We build
 */
@Service
public class FixedStaffDao implements StaffDao {

    @Override
    public List<StaffMember> getAllStaff() {
        List<StaffMember> staff = new ArrayList<>();
        staff.add(StaffMember.builder().id(24).name("Daniel Crane").role("Auditor").build());
        staff.add(StaffMember.builder().id(24).name("Sean Campbell").role("Nice Guy").build());

        return staff;
    }
}
