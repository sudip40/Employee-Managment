package com.employee_managment.employeemangement.role.persistence;

import com.employee_managment.employeemangement.role.repository.RoleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RolePersistenceService {
    private final RoleRepo roleRepo;
}
