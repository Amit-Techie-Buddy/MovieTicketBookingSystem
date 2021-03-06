package com.xyz.moviebooking.repository.user;

import com.xyz.moviebooking.model.user.User;

import java.util.List;

public interface UserRepositoryCustom {
    public List<User> fetchUserByAgeAndLocality(int age, String locality);
}