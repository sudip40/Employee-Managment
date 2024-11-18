package com.employee_managment.employeemangement.user.service;

import com.employee_managment.employeemangement.user.persistence.UserPersistenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserPersistenceService userPersistenceService;
}
