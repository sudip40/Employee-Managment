package com.employee_managment.employeemangement.role.service;

import com.employee_managment.employeemangement.role.persistence.RolePersistenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService{
    private final RolePersistenceService rolePersistenceService;
}
