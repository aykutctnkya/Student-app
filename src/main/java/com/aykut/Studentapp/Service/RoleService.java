package com.aykut.Studentapp.Service;

import com.aykut.Studentapp.Dao.RoleDao;
import com.aykut.Studentapp.Entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
