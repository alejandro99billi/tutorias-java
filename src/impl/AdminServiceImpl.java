package impl;

import interfaces.AdminService;

public class AdminServiceImpl implements AdminService {
    @Override
    public String registerNewUser(String userName, String password) {
        System.out.println("user register completed" + userName + password);
        return userName;
    }
}
