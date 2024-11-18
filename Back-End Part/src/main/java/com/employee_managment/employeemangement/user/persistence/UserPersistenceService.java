package com.employee_managment.employeemangement.user.persistence;

import com.employee_managment.employeemangement.user.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserPersistenceService {
    private final UserRepo userRepo;
}
