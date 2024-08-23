package com.company.staff.models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class StaffMember {
    private long id;
    private String name;
    private String role;
}
