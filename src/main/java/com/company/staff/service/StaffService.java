package com.company.staff.service;

import com.company.staff.models.StaffMember;
import java.util.List;

// This is the interface for the staff service. This sets up the 'contract' that all implementations of a StaffService should follow.
// Basically this doesn't care how they do it, but every staffService needs to return a list of all staff members. The use of an
// interface is probably clearer for the DAO.
public interface StaffService {

    List<StaffMember> getAllStaff();
}
