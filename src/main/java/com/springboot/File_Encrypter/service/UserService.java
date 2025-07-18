package com.springboot.File_Encrypter.service;

import com.springboot.File_Encrypter.dao.UserDAO;
import com.springboot.File_Encrypter.model.User;

import java.sql.SQLException;

public class UserService {
    public static Integer saveUser(User user){
        try {
            if(UserDAO.isExists(user.getEmail())) {
                return 0;
            } else {
                return UserDAO.saveUser(user);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
