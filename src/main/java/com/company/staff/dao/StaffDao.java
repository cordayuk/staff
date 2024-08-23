package com.company.staff.dao;

import com.company.staff.models.StaffMember;
import java.util.List;

/*
    Once again we use an interface. At the moment we only have an in memory H2 Database which is
    convenient as it just loads with the application and makes development easier.
    So the only implementation of this interface will be H2StaffDao. However most databases are
    MySQL. If we want to connect to a MySQL database we will create a MySQLStaffDao that works in a MySQL way.
    Using the interface means we only have to change the type of implementation used in 1 place,
    and we know the rest of our code is fine as long as we have implemented this interface.
    The StaffService doesn't care where the staff list comes from or how its built, it just needs a list of all staff.
    This is the encapsulation is keep banging on about.
 */
public interface StaffDao {

    List<StaffMember> getAllStaff();

}
