package com.company.staff.models;

import java.util.Collections;
import java.util.List;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Data;

@Builder
@Data
public class StaffList {
    @Default
    private List<StaffMember> rows = Collections.emptyList();
}
