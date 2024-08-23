package com.company.staff.service;

import com.company.staff.dao.H2StaffDao;
import com.company.staff.dao.StaffDao;
import com.company.staff.models.StaffMember;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/*
This is the implementation of the staff service. A controller is only responsible for managing things to do with handling requests.
It shouldn't be bothered with doing fancy business logic or retrieving data from databases.
Services handle the bulk of the work. In our case we will store a StaffDao object which
is the class responsible for retrieving things from the database.
 */
@Service
public class StaffServiceImpl implements StaffService {

    private StaffDao staffDao;

    // Try changing this to fixedStaffDao and see what happens. This is power of interfaces.
    public StaffServiceImpl(@Qualifier("h2StaffDao") StaffDao staffDao) {
        this.staffDao = staffDao;
    }

    @Override
    public List<StaffMember> getAllStaff() {
        return staffDao.getAllStaff();
    }
}
