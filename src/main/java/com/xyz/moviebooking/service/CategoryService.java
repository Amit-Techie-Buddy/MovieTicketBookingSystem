package com.xyz.moviebooking.service;

import com.xyz.moviebooking.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    // save new
}
