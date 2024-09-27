package com.example.lookup.Services;

import com.example.lookup.dtos.DTOUser;

import java.util.List;

public interface UserService {

    public User findById(Long id);

    public User register(DTOUser user);

    public User changePassword(DTOUser user);

    public List<User> list();

}
