package com.alumniconnect.service;

import java.util.List;

import com.alumniconnect.entity.Admin;

public interface AdminService {

    Admin addAdmin(Admin admin);

    Admin updateAdmin(Admin admin);

    void deleteAdmin(int adminId);

    Admin getAdminById(int adminId);

    List<Admin> getAllAdmins();

    Admin getAdminByEmail(String email);

}