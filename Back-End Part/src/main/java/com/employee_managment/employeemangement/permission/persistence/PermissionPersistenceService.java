package com.employee_managment.employeemangement.permission.persistence;

import com.employee_managment.employeemangement.permission.repository.PermissionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PermissionPersistenceService {
    private final PermissionRepo permissionRepo;
}
